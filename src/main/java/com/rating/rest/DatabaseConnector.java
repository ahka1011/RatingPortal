package com.rating.rest;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.rating.domain.*;

public class DatabaseConnector {

	static SessionFactory sessionFactory = null;
	static {
		Configuration config = new Configuration();
		config.configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(config.getProperties());
		MetadataSources metadataSources = new MetadataSources();
		metadataSources.addAnnotatedClass(Kursvorlage.class);
		metadataSources.addAnnotatedClass(Professor.class);
		metadataSources.addAnnotatedClass(Student.class);
		Metadata metadata = metadataSources.buildMetadata(builder.build());
		sessionFactory = metadata.buildSessionFactory();
	}

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

	@SuppressWarnings({ "deprecation", "rawtypes", "finally" })
	public static boolean kursAnlegen(int kursNr, String kursName, String semester, String kuerzel) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		boolean b = false;
		try {
			String sql = "INSERT INTO kursvorlage(Kurs_nr, Bezeichnung_kurs, Semester_kurs, Iz_kuerzel) values ('"
					+ kursNr + "', '" + kursName + "', '" + semester + "', '" + kuerzel + "')";
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
	
	//Testkommentar
	public static boolean kriteriumAnlegen(String bezeichnung, double gewichtung, int gruppen_nr) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		boolean b = false;
		try {
			String sql = "INSERT INTO kriterium(bezeichnung, gewichtung, gruppen_nr) values ('"
					+ bezeichnung + "', '" + gewichtung + "', '" + gruppen_nr + "'')";
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


	// toDo
	@SuppressWarnings("finally")
	public static List<Kursvorlage> studentKursListeSuchen(String iz_kuerzel) {

		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<Kursvorlage> k = new ArrayList<Kursvorlage>();
		try {
			String sql = "SELECT kursvorlage.kurs_nr, kursvorlage.bezeichnung_kurs, kursvorlage.semester_kurs, Kursvorlage.iz_kuerzel  FROM  kursvorlage join belegung_einzeln on belegung_einzeln.bezeichnung_kurs = kursvorlage.bezeichnung_kurs  WHERE belegung_einzeln.iz_kuerzel = '"
					+ iz_kuerzel + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Kursvorlage.class);

			List results = query.list();
			for (int i = 0; i < results.size(); i++) {
				k.add((Kursvorlage) results.get(i));
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

	// toDo
	public static List<Kursvorlage> dozentKursListeSuchen(String iz_kuerzel) {

		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<Kursvorlage> k = new ArrayList<Kursvorlage>();

		try {
			String sql = "SELECT * FROM Kursvorlage WHERE iz_kuerzel = '" + iz_kuerzel + "';";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Kursvorlage.class);

			List results = query.list();
			for (int i = 0; i < results.size(); i++) {
				k.add((Kursvorlage) results.get(i));
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

	// toDo
	public static List<Student> studentenZuKursSuchen(int gruppen_nr) {

		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<Student> s = new ArrayList<Student>();
		try {
			String sql = "SELECT Student.iz_kuerzel, Student.vorname, Student.nachname, Student.matrk_num, Student.email_adresse FROM Belegung_Gruppe join Student on Student.matrk_num = Belegung_Gruppe.matrk_num WHERE Belegung_Gruppe.gruppen_nr = '"
					+ gruppen_nr + "';";
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

	// toDo
	public static List<Kursvorlage> vorlage(int kurs_nr) {

		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		List<Kursvorlage> k = new ArrayList<Kursvorlage>();

		try {
			String sql = "SELECT * FROM Kursvorlage WHERE kurs_nr = '" + kurs_nr + "';";

			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Kursvorlage.class);

			List results = query.list();
			for (int i = 0; i < results.size(); i++) {
				k.add((Kursvorlage) results.get(i));
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
}
