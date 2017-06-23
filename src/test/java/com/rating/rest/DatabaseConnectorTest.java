package com.rating.rest;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatabaseConnectorTest {

	@Test
	public void studentKursListeSuchenStudentDa() {
		final String iz_kuerzel_working = "ahka1011";
		assertEquals("Student sollte da sein", 1, DatabaseConnector.studentKursListeSuchen(iz_kuerzel_working).size());
	
	}

	
	@Test
	public void studentKursListeSuchenStudentNichtDa() {
		final String iz_kuerzel_not_working = "asadfhakdsf";
		assertEquals("Student sollte nicht da sein", 0, DatabaseConnector.studentKursListeSuchen(iz_kuerzel_not_working).size());
	}
	
	
	@Test
	public void dozentKursListeSuchenDa() {
		final String iz_kuerzel_working = "stin0001";
		assertEquals("Student sollte da sein", 6, DatabaseConnector.dozentKursListeSuchen(iz_kuerzel_working).size());
	
	}

	
	@Test
	public void dozentKursListeSuchenNichtDa() {
		final String iz_kuerzel_not_working = "asadfhakdsf";
		assertEquals("Student sollte nicht da sein", 0, DatabaseConnector.dozentKursListeSuchen(iz_kuerzel_not_working).size());
	}
}
