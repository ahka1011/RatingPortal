package com.rating.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.rating.domain.Kursvorlage;
import com.rating.domain.Professor;
import com.rating.domain.Student;

@Path("/courses")
public class CourseResource extends BaseResource {

	/*
	 * static HashMap<String, List<CourseDetailStudent>>
	 * izkuerzelStudent2courseDetail = new HashMap<String,
	 * List<CourseDetailStudent>>(); static HashMap<String,
	 * List<CourseOverviewProfessor>> izkuerzelProfessor2courseDetail = new
	 * HashMap<String, List<CourseOverviewProfessor>>();
	 * 
	 * class CourseDetailStudent { int id; String name; String izKuerzel;
	 * List<Student> studenten; Professor prof; public CourseDetailStudent(int
	 * kurs_nr, String iz_kuerzel) { List<Kursvorlage> k =
	 * DatabaseConnector.vorlage(kurs_nr); prof = new Professor(); prof =
	 * DatabaseConnector.profInfo(iz_kuerzel); studenten = new
	 * ArrayList<Student>(); studenten =
	 * DatabaseConnector.studentenZuKursSuchen(izKuerzel); id = k.getKurs_nr();
	 * } } class CourseOverviewProfessor { List<CourseDetailProfessor> kurse;
	 * Professor prof; public CourseOverviewProfessor(String iz_kuerzel) { kurse
	 * = new ArrayList<CourseDetailProfessor>(); prof =
	 * DatabaseConnector.profInfo(iz_kuerzel); } } class CourseDetailProfessor {
	 * int id; String name; String izKuerzel; List<Student> studenten; Professor
	 * prof; public CourseDetailProfessor(String iz_kuerzel, String kurs_nr) {
	 * Kursvorlage k = DatabaseConnector.vorlage(kurs_nr); prof = new
	 * Professor(); prof = DatabaseConnector.profInfo(iz_kuerzel); studenten =
	 * new ArrayList<Student>(); studenten =
	 * DatabaseConnector.studentenZuKursSuchen(izKuerzel); id = k.getKurs_nr();
	 * } }
	 * 
	 * @GET
	 * 
	 * @Produces("application/json")
	 * 
	 * @Path("/student/details/{id}") public List<CourseDetailStudent>
	 * getCourseDetailsStudent(@HeaderParam("token") String token,
	 * 
	 * @PathParam("id") String id) { try { if (isValid(token)) {
	 * List<CourseDetailStudent> c = izkuerzelStudent2courseDetail.get(id);
	 * return c; } else { return null; } } catch (Exception e) {
	 * e.printStackTrace(); } return null; }
	 * 
	 * @GET
	 * 
	 * @Produces("application/json")
	 * 
	 * @Path("/prof/details/{id}") public List<CourseOverviewProfessor>
	 * getCourseDetailsProfessor(@HeaderParam("token") String token,
	 * 
	 * @PathParam("id") String id) { try { if (isValid(token)) {
	 * List<CourseOverviewProfessor> c =
	 * izkuerzelProfessor2courseDetail.get(id); return c; } else { return null;
	 * } } catch (Exception e) { e.printStackTrace(); } return null; }
	 * 
	 */
	@POST
	@Produces("application/json")
	@Path("/prof/createcourse")
	public void newCourse(@HeaderParam("token") String token, @FormParam("kursNummer") int kursNr,
			@FormParam("kursName") String kursName, @FormParam("semester") String semester,
			@FormParam("kuerzel") String kuerzel) {
		try {
			if (isValid(token)) {
				DatabaseConnector.kursAnlegen(kursNr, kursName, semester, kuerzel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Produces("application/json")
	@Path("/prof/deletecourse")
	public void deleteCourse(@HeaderParam("token") String token,
			@FormParam("kuerzel") String kuerzel) {
		try {
			if (isValid(token)) {
				DatabaseConnector.kursLöschen(kuerzel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@POST
	@Produces("application/json")
	@Path("/prof/createcriteria")
	public void newCriteria(@HeaderParam("token") String token, @FormParam("bezeichnung") String bezeichnung,
			@FormParam("gewichtung") double gewichtung, @FormParam("gruppen_nr") int gruppen_nr) {
		try {
			if (isValid(token)) {
				DatabaseConnector.kriteriumAnlegen(bezeichnung, gewichtung, gruppen_nr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Produces("application/json")
	@Path("/prof/deletecriteria")
	public void deleteCriteria(@HeaderParam("token") String token, @FormParam("bezeichnung") String bezeichnung) {
		try {
			if (isValid(token)) {
				DatabaseConnector.kriteriumLöschen(bezeichnung);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Produces("application/json")
	@Path("/prof/creategroup")
	public void newGroup(@HeaderParam("token") String token, @FormParam("gruppen_nr") int gruppen_nr, @FormParam("bezeichnung") String bezeichnung, @FormParam("kurs_nr") int kurs_nr) {
		try {
			if (isValid(token)) {
				DatabaseConnector.gruppenAnlegen(gruppen_nr, bezeichnung, kurs_nr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Produces("application/json")
	@Path("/prof/deletegroup")
	public void deleteGroup(@HeaderParam("token") String token, @FormParam("bezeichnung") String bezeichnung) {
		try {
			if (isValid(token)) {
				DatabaseConnector.gruppenLöschen(bezeichnung);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GET
	@Produces("application/json")
	@Path("/group/{gruppen_nr}")
	public List<Student> ListOfStudentsFromCourse(@HeaderParam("token") String token,
			@PathParam("gruppen_nr") int gruppen_nr) {
		List<Student> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.studentenZuKursSuchen(gruppen_nr);
				return c;
			} else {
				return c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@GET
	@Produces("application/json")
	@Path("/student/{iz_kuerzel}")
	public List<Kursvorlage> getCoursesOfStudent(@HeaderParam("token") String token,
			@PathParam("iz_kuerzel") String iz_kuerzel) {
		List<Kursvorlage> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.studentKursListeSuchen(iz_kuerzel);
				return c;
			} else {
				return c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@GET
	@Produces("application/json")
	@Path("/prof/{iz_kuerzel}")
	public List<Kursvorlage> getCoursesOfProfessor(@HeaderParam("token") String token,
			@PathParam("iz_kuerzel") String iz_kuerzel) {
		List<Kursvorlage> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.dozentKursListeSuchen(iz_kuerzel);
				return c;
			} else {
				return c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@GET
	@Produces("application/json")
	@Path("/prof/template/{kurs_nr}")
	public List<Kursvorlage> getTemplate(@HeaderParam("token") String token, @PathParam("kurs_nr") int kurs_nr) {
		List<Kursvorlage> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.vorlage(kurs_nr);
				return c;
			} else {
				return c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
}
