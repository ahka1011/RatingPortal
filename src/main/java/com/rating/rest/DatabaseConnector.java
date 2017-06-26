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
 * Initialisieren was macht diese Klasse?
 * @author Kaleem, Son, Tolga
 *
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
    
    /*
    @SuppressWarnings({ "finally" })
    public static boolean profAnlegen(String iz_kuerzel, String vorname, String nachname, String email_adresse) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        boolean b = false;
        try {
            Professor p = new Professor(iz_kuerzel, vorname, nachname, email_adresse);
            session.save(p);
            b = true;
        } catch (HibernateException he) {
            he.printStackTrace();
            trans.rollback();
            session.close();
        } finally {
            session.close();
            return b;
        }
    }
    */
    /**
     * 
     * @param course_nr
     * @param course_title
     * @param semester
     * @param username
     * @return
     */
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
    public static boolean createTemplate(int course_nr, String course_title, String semester, String username) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        boolean b = false;
        try {
            String sql = "INSERT INTO kursvorlage(Kurs_nr, Bezeichnung_kurs, Semester_kurs, Iz_kuerzel) values ('"
                    + course_nr + "', '" + course_title + "', '" + semester + "', '" + username + "')";
            SQLQuery query = session.createSQLQuery(sql);
            query.executeUpdate();
            session.getTransaction().commit();
            b = true;
            session.flush();
        }
        catch (HibernateException he) {
            he.printStackTrace();
            trans.rollback();
            session.close();
        } finally {
            session.close();
            return b;
        }
    }
    /**
     * 
     * @param course_nr
     * @return
     */
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
    public static boolean deleteTemplate(int course_nr) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        boolean b = false;
        try {
            String sql = "Delete from kursvorlage where kurs_nr = '" + course_nr + "';";
            SQLQuery query = session.createSQLQuery(sql);
            query.executeUpdate();
            session.getTransaction().commit();
            b = true;
            session.flush(); 
        }
        catch (HibernateException he) {
            he.printStackTrace();
            trans.rollback();
            session.close();
        } finally {
            session.close();
            return b;
        }
    }
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
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
            return k;
        }
    }
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
    public static boolean createCourse(int course_nr, String course_title, String semester, String username) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        boolean b = false;
        try {
            String sql = "INSERT INTO KURSE (Kurs_nr, Bezeichnung_kurs, Semester_kurs, Iz_kuerzel) values ('"
                    + course_nr + "', '" + course_title + "', '" + semester + "', '" + username + "')";
            SQLQuery query = session.createSQLQuery(sql);
            query.executeUpdate();
            session.getTransaction().commit();
            session.flush();
            b = true;
        }
        catch (HibernateException he) {
            he.printStackTrace();
            trans.rollback();
            session.close();
        } finally {
            session.close();
            return b;
        }
    }
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
    public static boolean deleteCourse(int course_nr) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        boolean b = false;
        try {
            String sql = "Delete from KURSE where kurs_nr = '" + course_nr + "';";
            SQLQuery query = session.createSQLQuery(sql);
            query.executeUpdate();
            session.getTransaction().commit();
            session.flush();
            b = true;
        }
        catch (HibernateException he) {
            he.printStackTrace();
            trans.rollback();
            session.close();
        } finally {
            session.close();
            return b;
        }
    }
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
    public static List<Template> course(int course_nr) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        List<Template> k = new ArrayList<Template>();
        try {
            String sql = "SELECT * FROM KURSE WHERE kurs_nr = '" + course_nr + "';";
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
            return k;
        }
    }
    
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
    public static boolean createCriteria(String title, double weighting, int group_nr) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        boolean b = false;
        try {
            String sql = "INSERT INTO kriterium(bezeichnung, gewichtung, gruppen_nr) values ('" + title + "', '"
                    + weighting + "', '" + group_nr + "')";
            SQLQuery query = session.createSQLQuery(sql);
            query.executeUpdate();
            session.getTransaction().commit();
            session.flush();
            b = true;
        }
        catch (HibernateException he) {
            he.printStackTrace();
            trans.rollback();
            session.close();
        } finally {
            session.close();
            return b;
        }
    }
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
    public static boolean deleteCriteria(String title) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        boolean b = false;
        try {
            String sql = "Delete from kriterium where bezeichnung = '" + title + "';";
            SQLQuery query = session.createSQLQuery(sql);
            query.executeUpdate();
            session.getTransaction().commit();
            session.flush();
            b = true;
        }
        catch (HibernateException he) {
            he.printStackTrace();
            trans.rollback();
            session.close();
        } finally {
            session.close();
            return b;
        }
    }
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
    public static boolean createGroup(int group_nr, String title, int course_nr) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        boolean b = false;
        try {
            String sql = "INSERT INTO gruppe(gruppen_nr, bezeichnung, kurs_nr ) values ('" + group_nr + "', '"
                    + title + "', '" + course_nr + "')";
            SQLQuery query = session.createSQLQuery(sql);
            query.executeUpdate();
            session.getTransaction().commit();
            session.flush();
            b = true;
        }
        catch (HibernateException he) {
            he.printStackTrace();
            trans.rollback();
            session.close();
        } finally {
            session.close();
            return b;
        }
    }
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally"})
    public static boolean deleteGroup(String title) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        boolean b = false;
        try {
            String sql = "Delete from gruppe where bezeichnung = '" + title + "';";
            SQLQuery query = session.createSQLQuery(sql);
            query.executeUpdate();
            session.getTransaction().commit();
            session.flush();
            b = true;
        }
        catch (HibernateException he) {
            he.printStackTrace();
            trans.rollback();
            session.close();
        } finally {
            session.close();
            return b;
        }
    }
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
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
            return k;
        }
    }
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
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
            return k;
        }
    }
    
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
    public static List<Student> searchforStudents(int group_nr) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        List<Student> s = new ArrayList<Student>();
        try {
            String sql = "SELECT Student.iz_kuerzel, Student.vorname, Student.nachname, Student.matrk_num, Student.email_adresse FROM Belegung_Gruppe join Student on Student.matrk_num = Belegung_Gruppe.matrk_num WHERE Belegung_Gruppe.gruppen_nr = '"
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
            return s;
        }
    }
   
    /*
    @SuppressWarnings({ "deprecation", "rawtypes", "finally" })
    public static Professor profInfo(String iz_kuerzel) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        Professor p = null;
        try {
            String sql = "SELECT * FROM Professor WHERE iz_kuerzel = '" + iz_kuerzel + "';";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(Professor.class);
            List results = query.list();
            p = (Professor) results.get(0);
        } catch (HibernateException he) {
            he.printStackTrace();
            trans.rollback();
            session.close();
        } finally {
            session.close();
            return p;
        }
    }
    */
}
