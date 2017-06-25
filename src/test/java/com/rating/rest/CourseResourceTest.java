/*package com.rating.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.junit.Before;
import org.junit.Test;

import com.rating.domain.Student;

import junit.framework.Assert;

public class CourseResourceTest {

	CourseResource courseResource;
	
	@Before
	public void setUp() {
		courseResource = new CourseResource();
	}
	
	@Test
	public void whenNewCourseIsCalledShouldPutNewCourseIntoDatabase() {
		String token = "sdug";
		int kursNr = 200;
		String kursName = "skudgh";
		String semester = "kudgh";
		String kuerzel = "sdkugh";
		// Response response = courseResource.newCourse(token, kursNr, kursName, semester, kuerzel);
		// Assert.assertEquals(200, response.getStatus());
	}
	
	@Test
	public void whenListOfStudentsIsCalledThenReturnValidListOfStudents() {
		String token = "ksdughdkugh";
		int gruppen_nr = 1;
		List<Student> students = courseResource.ListOfStudentsFromCourse(token, gruppen_nr);
		List<Student> expected = new ArrayList<Student>();
		Student student = new Student("ahka1011", 
				"kaleem", "ahmed", 44525, "kaleem_ahmed95@live.de");
		System.out.println(student.getUsername());
		System.out.println(student.getFirstname());
		System.out.println(student.getLastname());
		expected.add(student);
		Assert.assertNotNull(students);
		Assert.assertEquals(expected, students);
	}
	
}
*/