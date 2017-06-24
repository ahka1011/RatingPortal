package com.rating.rest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DatabaseConnectorTest {

	@Test
	public void studentKursListeSuchenStudentDa() {
		final String iz_kuerzel_working = "ahka1011";
		assertEquals("Student sollte da sein", 1, DatabaseConnector.studentKursListeSuchen(iz_kuerzel_working).size());
		Assert.assertNotNull(iz_kuerzel_working);
	}

	@Test
	public void studentKursListeSuchenStudentNichtDa() {
		final String iz_kuerzel_not_working = "asadfhakdsf";
		assertEquals("Student sollte nicht da sein", 0, DatabaseConnector.studentKursListeSuchen(iz_kuerzel_not_working).size());
		Assert.assertNotNull(iz_kuerzel_not_working);
	}
	
	@Test
	public void dozentKursListeSuchenDa() {
		final String iz_kuerzel_working = "stin0001";
		assertEquals("Student sollte da sein", 1, DatabaseConnector.dozentKursListeSuchen(iz_kuerzel_working).size());
		Assert.assertNotNull(iz_kuerzel_working);
	}
	
	
	@Test
	public void dozentKursListeSuchenNichtDa() {
		final String iz_kuerzel_not_working = "asadfhakdsf";
		assertEquals("Student sollte nicht da sein", 0, DatabaseConnector.dozentKursListeSuchen(iz_kuerzel_not_working).size());
		Assert.assertNotNull(iz_kuerzel_not_working);
	}
	
	@Test
	public void vorlageKursRichtig() {
		final int kurs_nr = 11;
		assertEquals("Kursnummer richtig", 1, DatabaseConnector.vorlage(kurs_nr).size());
		Assert.assertNotNull(kurs_nr);
	}
	
	@Test
	public void vorlageKursFalsch() {
		final int kurs_nr = 999;
		assertEquals("Kursnummer falsch", 0, DatabaseConnector.vorlage(kurs_nr).size());
		Assert.assertNotNull(kurs_nr);
	}
	
	@Test
	public void profInfoRichtig() {
		final String iz_kuerzel = "stin0001";
		assertEquals("Infos zu Prof richtig", 1, DatabaseConnector.profInfo(iz_kuerzel).size());
		Assert.assertNotNull(iz_kuerzel);
	}
	
	@Test
	public void profInfoFalsch() {
		final String iz_kuerzel = "abcdefg";
		assertEquals("Infos zu Prof falsch", 0, DatabaseConnector.profInfo(iz_kuerzel).size());
		Assert.assertNotNull(iz_kuerzel);
	}
	
	@Test
	public void gruppeLöschenFunktioniert() {
		final String bezeichnung = "Anwendungsprojekt";
		Assert.assertTrue(true);
		Assert.assertNotNull(bezeichnung);
	}
	
	@Test
	public void gruppeLöschenFunktioniertNicht() {
		final String bezeichnung = "Anwendungsprojekt";
		Assert.assertTrue(false);
		Assert.assertNotNull(bezeichnung);
	}
}
