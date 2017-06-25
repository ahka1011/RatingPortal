package com.rating.rest;

import static org.junit.Assert.assertEquals;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import com.rating.domain.Course;
import com.rating.domain.Professor;
import com.rating.domain.Student;
import com.rating.domain.Template;

public class CourseResourceTest {

	CourseResource courseResource;

	// declare dummy data
	final String iz_kuerzel_student = "test1111";
	final String vorname = "Max";
	final String nachname = "Mustermann";
	final String matrk_num = "12345";
	final String email_adresse = "test1111@hs-karlsruhe.de";

	@Before
	public void setUp() {
		courseResource = new CourseResource();
		final Configuration config = new Configuration();
		config.configure();
		final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(config.getProperties());
		final MetadataSources metadataSources = new MetadataSources();
		metadataSources.addAnnotatedClass(Template.class);
		metadataSources.addAnnotatedClass(Course.class);
		metadataSources.addAnnotatedClass(Professor.class);
		metadataSources.addAnnotatedClass(Student.class);
		final Metadata metadata = metadataSources.buildMetadata(builder.build());
		final SessionFactory sessionFactory = metadata.buildSessionFactory();

		Transaction transaction = null;

		// declare dummy data
		final String iz_kuerzel_student = "test1111";
		final String iz_kuerzel_prof = "prof1111";
		final String vorname = "Max";
		final String nachname = "Mustermann";
		final String matrk_num = "12345";
		final String email_adresse = "test1111@hs-karlsruhe.de";

		// student dummy
		try {
			final Session session1 = sessionFactory.openSession();
			transaction = session1.beginTransaction();
			// delete student from db
			final String sql_delete_stundent = "delete from student where iz_kuerzel='" + iz_kuerzel_student + "'";
			final SQLQuery delete_query_student = session1.createSQLQuery(sql_delete_stundent);
			delete_query_student.executeUpdate();

			// insert student in db
			final String sql_student = "INSERT INTO student(iz_kuerzel, vorname, nachname, matrk_num, email_adresse) VALUES ('"
					+ iz_kuerzel_student + "', '" + vorname + "', '" + nachname + "', '" + matrk_num + "', '"
					+ email_adresse + "');";
			final SQLQuery query_student = session1.createSQLQuery(sql_student);
			query_student.executeUpdate();

			// close session
			session1.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		// prof dummy
		try {
			final Session session1 = sessionFactory.openSession();
			transaction = session1.beginTransaction();

			// delete prof from db
			final String sql_delete_prof = "delete from professor where iz_kuerzel='" + iz_kuerzel_prof + "'";
			final SQLQuery delete_query_prof = session1.createSQLQuery(sql_delete_prof);
			delete_query_prof.executeUpdate();

			// insert prof in db
			final String sql_prof = "INSERT INTO professor(iz_kuerzel, vorname, nachname, email_adresse) VALUES ('"
					+ iz_kuerzel_prof + "', '" + vorname + "', '" + nachname + "', '" + email_adresse + "');";
			final SQLQuery query_prof = session1.createSQLQuery(sql_prof);
			query_prof.executeUpdate();

			// close session
			session1.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		// kurs dummy
		try {
			final Session session1 = sessionFactory.openSession();
			transaction = session1.beginTransaction();

			// delete prof from db

			final String sql_delete = "delete from kurse where iz_kuerzel='" + iz_kuerzel_prof + "'";
			final SQLQuery delete_query = session1.createSQLQuery(sql_delete);
			delete_query.executeUpdate();

			// insert prof in db
			final String sql_prof = "INSERT INTO kurse(kurs_nr,bezeichnung_kurs, semester_kurs, iz_kuerzel) VALUES (10000,'Planung', '2', '"
					+ iz_kuerzel_prof + "');";
			final SQLQuery query = session1.createSQLQuery(sql_prof);
			query.executeUpdate();

			// close session
			session1.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		// belegung_einzeln dummy
		try {
			final Session session1 = sessionFactory.openSession();
			transaction = session1.beginTransaction();

			// delete prof from db

			final String sql_delete = "delete from belegung_einzeln where iz_kuerzel='" + iz_kuerzel_student + "'";
			final SQLQuery delete_query = session1.createSQLQuery(sql_delete);
			delete_query.executeUpdate();

			// insert prof in db
			final String sql_prof = "INSERT INTO belegung_einzeln(iz_kuerzel, matrk_num, bezeichnung_kurs, semester_kurs, einzeln_kriterium, einzeln_note) VALUES ('"
					+ iz_kuerzel_student + "', 12345, 'Planung', '2', 'Test kurs', 0.1);";
			final SQLQuery query = session1.createSQLQuery(sql_prof);
			query.executeUpdate();

			// close session
			session1.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		// kursvorlage dummy
		try {
			final Session session1 = sessionFactory.openSession();
			transaction = session1.beginTransaction();

			// delete prof from db

			final String sql_delete = "delete from kursvorlage where iz_kuerzel='" + iz_kuerzel_prof + "'";
			final SQLQuery delete_query = session1.createSQLQuery(sql_delete);
			delete_query.executeUpdate();

			// insert prof in db
			final String sql_prof = "INSERT INTO kursvorlage(kurs_nr, bezeichnung_kurs, semester_kurs, iz_kuerzel) VALUES (10000, 'Test Kursvorlage', '2','"
					+ iz_kuerzel_prof + "');";
			final SQLQuery query = session1.createSQLQuery(sql_prof);
			query.executeUpdate();

			// close session
			session1.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}

	@Test
	public void studentKursListeSuchenStudentDa() {
		final String iz_kuerzel_working = "test1111";
		assertEquals("Kurse sollten da sein", 1,
				courseResource.getCoursesOfStudent("asdfadsfasdf", iz_kuerzel_working).size());
	}

	@Test
	public void studentKursListeSuchenStudentNichtDa() {
		final String iz_kuerzel_not_working = "asadfhakdsf";
		assertEquals("Student sollte nicht da sein", 0,
				courseResource.getCoursesOfStudent("asdfadsfasdf", iz_kuerzel_not_working).size());

	}

	@Test
	public void dozentKursListeSuchenDa() {
		final String iz_kuerzel_working = "prof1111";
		assertEquals("Kurs sollte da sein", 1,
				courseResource.getCoursesOfProfessor("asdfasdfadsf", iz_kuerzel_working).size());

	}

	@Test
	public void dozentKursListeSuchenNichtDa() {
		final String iz_kuerzel_not_working = "asadfhakdsf";
		assertEquals("Kurs sollte nicht da sein", 0,
				courseResource.getCoursesOfProfessor("asdfasdfadsf", iz_kuerzel_not_working).size());

	}

	@Test
	public void testGetTemplate() {
		assertEquals("Test get template", 1, courseResource.getTemplate("asfdfasdfadsf", 10000).size());
	}

	@Test
	public void testGetCourse() {
		assertEquals("Test get Course", 1, courseResource.getCourse("sdafasdfasdf", 10000).size());
	}

}
