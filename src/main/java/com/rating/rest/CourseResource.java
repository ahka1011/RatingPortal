package com.rating.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.rating.domain.Template;
import com.rating.domain.Student;

@Path("/courses")
public class CourseResource extends BaseResource {
	
	@POST
	@Produces("application/json")
	@Path("/prof/createcourse")
	public void newCourse(@HeaderParam("token") String token, @FormParam("course_nr") int course_nr,
			@FormParam("course_title") String course_title, @FormParam("semester") String semester,
			@FormParam("username") String username) {
		try {
			if (isValid(token)) {
				DatabaseConnector.kursAnlegen(course_nr, course_title, semester, username);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Produces("application/json")
	@Path("/prof/deletecourse")
	public void deleteCourse(@HeaderParam("token") String token,
			@FormParam("username") String username) {
		try {
			if (isValid(token)) {
				DatabaseConnector.kursLöschen(username);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@POST
	@Produces("application/json")
	@Path("/prof/createcriteria")
	public void newCriteria(@HeaderParam("token") String token, @FormParam("title") String title,
			@FormParam("weighting") double weighting, @FormParam("group_nr") int group_nr) {
		try {
			if (isValid(token)) {
				DatabaseConnector.kriteriumAnlegen(title, weighting, group_nr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Produces("application/json")
	@Path("/prof/deletecriteria")
	public void deleteCriteria(@HeaderParam("token") String token, @FormParam("title") String title) {
		try {
			if (isValid(token)) {
				DatabaseConnector.kriteriumLöschen(title);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Produces("application/json")
	@Path("/prof/creategroup")
	public void newGroup(@HeaderParam("token") String token, @FormParam("group_nr") int group_nr, @FormParam("title") String title, @FormParam("course_nr") int course_nr) {
		try {
			if (isValid(token)) {
				DatabaseConnector.gruppenAnlegen(group_nr, title, course_nr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@POST
	@Produces("application/json")
	@Path("/prof/deletegroup")
	public void deleteGroup(@HeaderParam("token") String token, @FormParam("title") String title) {
		try {
			if (isValid(token)) {
				DatabaseConnector.gruppenLöschen(title);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GET
	@Produces("application/json")
	@Path("/group/{group_nr}")
	public List<Student> ListOfStudentsFromCourse(@HeaderParam("token") String token,
			@PathParam("group_nr") int group_nr) {
		List<Student> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.studentenZuKursSuchen(group_nr);
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
	@Path("/student/{username}")
	public List<Template> getCoursesOfStudent(@HeaderParam("token") String token,
			@PathParam("username") String username) {
		List<Template> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.studentKursListeSuchen(username);
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
	@Path("/prof/{username}")
	public List<Template> getCoursesOfProfessor(@HeaderParam("token") String token,
			@PathParam("username") String username) {
		List<Template> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.dozentKursListeSuchen(username);
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
	@Path("/prof/template/{course_nr}")
	public List<Template> getTemplate(@HeaderParam("token") String token, @PathParam("course_nr") int course_nr) {
		List<Template> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.vorlage(course_nr);
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
