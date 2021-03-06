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

/**
 * This is the test class for the class CourseResource. In this test class several JUnit Tests
 * are implemented for the methods of the class CourseResource. 
 * For the JUnit tests, dummy data for student, professor, course, template and individual
 * assignment is created.
 * Using dummy data, the JUnit tests can be executed also by other team members. No certain
 * data is required for the execution of the JUnit Tests.
 * The version 4.12 from JUnit is used here.
 * 
 * @author Tolga Duman
 *
 */

public class CourseResourceTest {

	CourseResource courseResource;
		
	//Declaring dummy student data
	final String username_student = "stud1111";
	final String firstname_student = "student";
	final String lastname_student = "student_nachname";
	final String student_id = "12345";
	final String email_student = "stud1111@hs-karlsruhe.de";
	
	//Declaring dummy professor data
	final String username_prof = "prof1111";
	final String firstname_prof = "professor";
	final String lastname_prof = "professor_nachname";
	final String email_prof = "prof1111@hs-karlsruhe.de";
	
    //Executed before each test. It is used to prepare the test environment 
	//(e.g., read input data, initialize the class).
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

		//Inserting and deleting dummy student data
		try {
			final Session session1 = sessionFactory.openSession();
			transaction = session1.beginTransaction();
			
			// Deleting dummy student data from the database
			final String sql_delete_stundent = "DELETE FROM student WHERE iz_kuerzel='" + username_student + "'";
			final SQLQuery delete_query_student = session1.createSQLQuery(sql_delete_stundent);
			delete_query_student.executeUpdate();

			//Inserting dummy student data into the database
			final String sql_student = "INSERT INTO student(iz_kuerzel, vorname, nachname, matrk_num, email_adresse) VALUES ('"
					+ username_student + "', '" + firstname_student + "', '" + lastname_student + "', '" + student_id + "', '"
					+ email_student + "');";
			final SQLQuery query_student = session1.createSQLQuery(sql_student);
			query_student.executeUpdate();

			//Closing session
			session1.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		//Inserting and deleting dummy professor data
		try {
			final Session session1 = sessionFactory.openSession();
			transaction = session1.beginTransaction();

			// Deleting dummy professor data from the database
			final String sql_delete_prof = "DELETE FROM professor WHERE iz_kuerzel='" + username_prof + "'";
			final SQLQuery delete_query_prof = session1.createSQLQuery(sql_delete_prof);
			delete_query_prof.executeUpdate();

			//Inserting dummy professor data into the database
			final String sql_prof = "INSERT INTO professor(iz_kuerzel, vorname, nachname, email_adresse) VALUES ('"
					+ username_prof + "', '" + firstname_prof + "', '" + lastname_prof + "', '" + email_prof + "');";
			final SQLQuery query_prof = session1.createSQLQuery(sql_prof);
			query_prof.executeUpdate();

			//Closing session
			session1.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		//Inserting and deleting dummy course data 
		try {
			final Session session1 = sessionFactory.openSession();
			transaction = session1.beginTransaction();

			// Deleting dummy course data from the database
			final String sql_delete_course = "DELETE FROM kurse where iz_kuerzel='" + username_prof + "'";
			final SQLQuery delete_query_course = session1.createSQLQuery(sql_delete_course);
			delete_query_course.executeUpdate();

			//Inserting dummy data of professor into the database
			final String sql_course = "INSERT INTO kurse(kurs_nr,bezeichnung_kurs, semester_kurs, iz_kuerzel) VALUES (10000,'Planung', '2', '"
					+ username_prof + "');";
			final SQLQuery query = session1.createSQLQuery(sql_course);
			query.executeUpdate();

			//Closing session
			session1.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		//Inserting and deleting dummy single assignment data
		try {
			final Session session1 = sessionFactory.openSession();
			transaction = session1.beginTransaction();

			// Deleting dummy single assignment data from the database
			final String sql_delete_single_assignment = "DELETE FROM belegung_einzeln where iz_kuerzel='" + username_student + "'";
			final SQLQuery delete_query_single_assignment = session1.createSQLQuery(sql_delete_single_assignment);
			delete_query_single_assignment.executeUpdate();

			//Inserting dummy single assignment data into the database
			final String sql_single_assignment = "INSERT INTO belegung_einzeln(iz_kuerzel, matrk_num, bezeichnung_kurs, semester_kurs, einzeln_kriterium, einzeln_note) VALUES ('"
					+ username_student + "', 12345, 'Planung', '2', 'Test kurs', 0.1);";
			final SQLQuery query = session1.createSQLQuery(sql_single_assignment);
			query.executeUpdate();

			//Closing session
			session1.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		//Inserting and deleting dummy template data
		try {
			final Session session1 = sessionFactory.openSession();
			transaction = session1.beginTransaction();

			// Deleting dummy template data from the database
			final String sql_delete_template = "DELETE FROM kursvorlage WHERE iz_kuerzel='" + username_prof + "'";
			final SQLQuery delete_query = session1.createSQLQuery(sql_delete_template);
			delete_query.executeUpdate();

			//Inserting dummy template data into the database
			final String sql_template = "INSERT INTO kursvorlage(kurs_nr, bezeichnung_kurs, semester_kurs, iz_kuerzel) VALUES (10000, 'Test Kursvorlage', '2','"
					+ username_prof + "');";
			final SQLQuery query = session1.createSQLQuery(sql_template);
			query.executeUpdate();

			//Closing session
			session1.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
    
	//Test which should show all the courses of a logged student.
	//If there is a course for the student then the test is successful.
	@Test
	public void coursesOfStudentIsThere() {
		final String username_student_working = "stud1111";
		assertEquals("Kurse vom Studenten sollten da sein", 1,
				courseResource.getCoursesOfStudent("abcd1234", username_student_working).size());
	}
    
	//Test which should not show any course of a logged student.
	//If there is no course for the student then the test is successful.
	@Test
	public void coursesOfStudentIsNotThere() {
		final String username_student_not_working = "abcd1234";
		assertEquals("Kurse vom Studenten sollten nicht da sein", 0,
				courseResource.getCoursesOfStudent("asdfadsfasdf", username_student_not_working).size());
	}
    
	//Test which should show all the courses of a logged professor.
	//If there is a course for the professor then the test is successful.
	@Test
	public void coursesOfProfessorIsThere() {
		final String username_prof_working = "prof1111";
		assertEquals("Kurse vom Professor sollten da sein", 1,
				courseResource.getCoursesOfProfessor("abcd1234", username_prof_working).size());
	}
    
	//Test which should not show any course of a logged professor.
	//If there is no course for the professor then the test is successful.
	@Test
	public void coursesOfProfessorIsNotThere() {
		final String username_prof_not_working = "abcd1234";
		assertEquals("Kurse vom Professor sollte nicht da sein", 0,
				courseResource.getCoursesOfProfessor("abcdefgh", username_prof_not_working).size());
	}

	//Test which should show all the templates of a logged professor.
	//If there is a template for the professor then the test is successful.
	@Test
	public void getTemplateForProfessor() {
		assertEquals("Kursvorlage f�r Professor sollte da sein", 1, courseResource.getTemplate("asfdfasdfadsf", 10000).size());
	}
	
	//Test which should not show any template of a logged professor.
	//If there is no template for the professor then the test is successful.
	@Test
	public void noTemplateForProfessor() {
		assertEquals("Kursvorlage f�r Professor sollte nicht da sein", 0, courseResource.getTemplate("abcd1234", 10005).size());
	}
    
	//Test which should show all the courses of a logged professor.
	//If there is a course for the student then the test is successful.
	@Test
	public void getCertainCourseNrOfProfessor() {
		assertEquals("Kursnummer 10000 des Professors sollte da sein", 1, courseResource.getCourse("abcd1234", 10000).size());
	}
	
	//Test which should not show any course of a logged professor.
	//If there is no course for the student then the test is successful.
	@Test
	public void noCertainCourseNrOfProfessor() {
		assertEquals("Kursnummer 10005 des Professor sollte nicht da sein", 0, courseResource.getCourse("abcd1234", 10005).size());
	}
}
