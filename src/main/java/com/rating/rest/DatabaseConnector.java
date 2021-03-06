package com.rating.rest;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import com.rating.domain.*;

/**
 * This class represents the database methods. Both student and professor view.
 * 
 * @author Tolga Duman, Kaleem Ahmed, Son Hoang
 * @version 28.06.2017
 */

public class DatabaseConnector {
	static SessionFactory sessionFactory = null;
	static {
		Configuration config = new Configuration();
		config.configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(config.getProperties());
		MetadataSources metadataSources = new MetadataSources();
		metadataSources.addAnnotatedClass(Template.class);
		metadataSources.addAnnotatedClass(Course.class);
		metadataSources.addAnnotatedClass(Professor.class);
		metadataSources.addAnnotatedClass(Student.class);
		Metadata metadata = metadataSources.buildMetadata(builder.build());
		sessionFactory = metadata.buildSessionFactory();
	}

	/**
	 * This database method creates a new template for a course and inserts in
	 * the database. This method is only available for professors.
	 * 
	 * @param course_nr is the ID of a course, every course has a unique number
	 * @param course_title the name of the course
	 * @param semester explains in which semester the course is offered
	 * @param username is the user ID for the login
	 * @return SQL INSERT INTO statement
	 */

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static boolean createTemplate(int course_nr, String course_title, String semester, String username) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		boolean b = false;
		try {
			String sql = "INSERT INTO kursvorlage(Kurs_nr, Bezeichnung_kurs, Semester_kurs, Iz_kuerzel) VALUES ('"
					+ course_nr + "', '" + course_title + "', '" + semester + "', '" + username + "')";
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			session.getTransaction().commit();
			b = true;
			session.flush();
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		}
		return b;
	}

	/**
	 * This database method deletes a template from the database. This method is only available for professors.
	 * 
	 * @param course_nr is the ID of a course, every course has a unique number
	 * @return SQL DELETE statement
	 */

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static boolean deleteTemplate(int course_nr) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		boolean b = false;
		try {
			String sql = "DELETE FROM kursvorlage WHERE kurs_nr = '" + course_nr + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			session.getTransaction().commit();
			b = true;
			session.flush();
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		}
		return b;
	}

	/**
	 * This database method selects the templates depending on the course number from the database.
	 * This method is only available for professors.
	 * 
	 * @param course_nr is the ID of a course, every course has a unique number
	 * @return SQL SELECT statement
	 */

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static List<Template> template(int course_nr) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<Template> k = new ArrayList<Template>();
		try {
			String sql = "SELECT * FROM Kursvorlage WHERE kurs_nr = '" + course_nr + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Template.class);
			List results = query.list();
			for (int i = 0; i < results.size(); i++) {
				k.add((Template) results.get(i));
			}
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		}
		return k;
	}

	/**
	 * This database method creates a new course and inserts it in the database. 
	 * This method is only available for professors.
	 * 
	 * @param course_nr is the ID of a course, every course has a unique number
	 * @param course_title the name of the course
	 * @param semester explains in which semester the course is offered
	 * @param username is the user ID for the login
	 * @return SQL INSERT INTO statement
	 */
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static boolean createCourse(int course_nr, String course_title, String semester, String username) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		boolean b = false;
		try {
			String sql = "INSERT INTO KURSE (Kurs_nr, Bezeichnung_kurs, Semester_kurs, Iz_kuerzel) VALUES ('"
					+ course_nr + "', '" + course_title + "', '" + semester + "', '" + username + "')";
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			session.getTransaction().commit();
			session.flush();
			b = true;
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		}
		return b;
	}

	/**
	 * This database method deletes a course from the database. 
	 * This method is only available for professors.
	 * 
	 * @return SQL DELETE statement
	 */

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static boolean deleteCourse(int course_nr) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		boolean b = false;
		try {
			String sql = "DELETE FROM kurse WHERE kurs_nr = '" + course_nr + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			session.getTransaction().commit();
			session.flush();
			b = true;
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		}
		return b;
	}

	/**
	 * This database method selects the courses depending on the course number from the database.
	 * This method is only available for professors.
	 *
	 * @param course_nr is the ID of a course, every course has a unique number
	 * @return SQL SELECT statement
	 */

	@SuppressWarnings({ "deprecation", "rawtypes"})
	public static List<Template> course(int course_nr) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<Template> k = new ArrayList<Template>();
		try {
			String sql = "SELECT * FROM kurse WHERE kurs_nr = '" + course_nr + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Template.class);
			List results = query.list();
			for (int i = 0; i < results.size(); i++) {
				k.add((Template) results.get(i));
			}
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		} return k;
	}

	/**
	 * This database method inserts a new criteria into the database.
	 * This method is only available for professors.
	 * 
	 * @param title is the title of the new criteria
	 * @param weighting is the weight of the new criteria referring to the other criteria
	 * @param group_nr is the number of the group
	 * @return SQL INSERT INTO statement
	 */

	@SuppressWarnings({ "deprecation", "rawtypes"})
	public static boolean createCriteria(String title, double weighting, int group_nr) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		boolean b = false;
		try {
			String sql = "INSERT INTO kriterium(bezeichnung, gewichtung, gruppen_nr) VALUES ('" + title + "', '"
					+ weighting + "', '" + group_nr + "')";
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			session.getTransaction().commit();
			session.flush();
			b = true;
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		} return b;
	}

	/**
	 * This database method deletes the existing criteria in the database.
	 * This method is only available for professors.
	 * 
	 * @param title is the title of the criteria which will be deleted
	 * @return SQL DELETE statement
	 */

	@SuppressWarnings({ "deprecation", "rawtypes"})
	public static boolean deleteCriteria(String title) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		boolean b = false;
		try {
			String sql = "DELETE FROM kriterium WHERE bezeichnung = '" + title + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			session.getTransaction().commit();
			session.flush();
			b = true;
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		} return b;
	}

	/**
	 * This database method insert a new group into the database.
	 * This method is only available for professors.
	 * 
	 * @param group_nr is the number of the group
	 * @param title is title of the new group
	 * @param course_nr is the ID of a course, every course has a unique number
	 * @return SQL INSERT INTO statement
	 */

	@SuppressWarnings({ "deprecation", "rawtypes"})
	public static boolean createGroup(int group_nr, String title, int course_nr) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		boolean b = false;
		try {
			String sql = "INSERT INTO gruppe(gruppen_nr, bezeichnung, kurs_nr ) VALUES ('" + group_nr + "', '" + title
					+ "', '" + course_nr + "')";
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			session.getTransaction().commit();
			session.flush();
			b = true;
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		} return b;
	}
	
	/**
	 * This database method deletes a existing group from the database by the given title.
	 * This method is only available for professors.
	 * 
	 * @param title is the title of the group
	 * @return SQL DELETE statement
	 */
	

	@SuppressWarnings({ "deprecation", "rawtypes"})
	public static boolean deleteGroup(String title) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		boolean b = false;
		try {
			String sql = "DELETE FROM gruppe WHERE bezeichnung = '" + title + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.executeUpdate();
			session.getTransaction().commit();
			session.flush();
			b = true;
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		} return b;
	}

	/**
	 * This database method searches for courses by username.
	 * This method is only available for students.
	 * 
	 * @param username is the user ID for the login
	 * @return SQL SELECT statement
	 */
	
	@SuppressWarnings({ "deprecation", "rawtypes"})
	public static List<Course> searchforCoursesbyUsername(String username) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<Course> k = new ArrayList<Course>();
		try {
			String sql = "SELECT kurse.kurs_nr, kurse.bezeichnung_kurs, kurse.semester_kurs, kurse.iz_kuerzel  FROM  kurse join belegung_einzeln on belegung_einzeln.bezeichnung_kurs = kurse.bezeichnung_kurs  WHERE belegung_einzeln.iz_kuerzel = '"
					+ username + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Course.class);
			List results = query.list();
			for (int i = 0; i < results.size(); i++) {
				k.add((Course) results.get(i));
			}
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		} return k;
	}

	/**
	 * This database method searches for courses by username.
	 * This method is only available for professors.
	 * 
	 * @param username is the user ID for the login
	 * @return SQL SELECT statement
	 */
	
	@SuppressWarnings({ "deprecation", "rawtypes"})
	public static List<Course> searchforCoursesbyProf(String username) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<Course> k = new ArrayList<Course>();
		try {
			String sql = "SELECT * FROM Kurse WHERE iz_kuerzel = '" + username + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Course.class);
			List results = query.list();
			for (int i = 0; i < results.size(); i++) {
				k.add((Course) results.get(i));
			}
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		} return k;
	}

	/**
	 * This database method searches for students by group number.
	 * This method is only available for students.
	 * 
	 * @param group_nr is the number of the group
	 * @return SQL SELECT statement
	 */

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static List<Student> searchforStudents(int group_nr) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<Student> s = new ArrayList<Student>();
		try {
			String sql = "SELECT Student.iz_kuerzel, Student.vorname, Student.nachname, Student.matrk_num, Student.email_adresse FROM Belegung_Gruppe JOIN Student on Student.matrk_num = Belegung_Gruppe.matrk_num WHERE Belegung_Gruppe.gruppen_nr = '"
					+ group_nr + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Student.class);
			List results = query.list();
			for (int i = 0; i < results.size(); i++) {
				s.add((Student) results.get(i));
			}
		} catch (HibernateException he) {
			he.printStackTrace();
			trans.rollback();
			session.close();
		} finally {
			session.close();
		} return s;
	}
}
