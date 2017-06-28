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

import com.rating.domain.Course;
import com.rating.domain.Template;
import com.rating.domain.Student;

 /**	
 * Represents the REST-API. Here the methods are implemented.
 * @author Sakine Ayaz, Burcu Kulaksiz, Tuelin Duman
 * @version 28.06.2017 
 */

@Path("/courses")
public class CourseResource extends BaseResource {
	
	/**
	 * @author 
	 * @param token
	 * @param course_nr
	 * @param course_title
	 * @param semester
	 * @param username
	 */
	
	/* Professor can create a new template for his course*/
	@POST
	@Produces("application/json")
	@Path("/prof/createtemplate")
	public void newTemplate(@HeaderParam("token") String token, @FormParam("course_nr") int course_nr,
			@FormParam("course_title") String course_title, @FormParam("semester") String semester,
			@FormParam("username") String username) {
		try {
			if (isValid(token)) {
				DatabaseConnector.createTemplate(course_nr, course_title, semester, username);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param token
	 * @param course_nr
	 */
	
	/*Professor can delete a template*/
	@DELETE
	@Produces("application/json")
	@Path("/prof/deletetemplate/{course_nr}")
	public void deleteTemplate(@HeaderParam("token") String token,
			@PathParam("course_nr") int course_nr) {
		try {
			if (isValid(token)) {
				DatabaseConnector.deleteTemplate(course_nr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*Get the information from all created templates*/
	@GET
	@Produces("application/json")
	@Path("/prof/template/{course_nr}")
	public List<Template> getTemplate(@HeaderParam("token") String token, @PathParam("course_nr") int course_nr) {
		List<Template> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.template(course_nr);
				return c;
			} else {
				return c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	/** 
	 * Professor can create a new course.
	 * @author Tülin Duman
	 * @param token checks if the token is valid before executing the method
	 * @param course_nr is the ID of a course, every course has a unique number
	 * @param course_title the name of the course
	 * @param semester explains in which semester the course is offered
	 * @param username user ID of the student
	 */
	
	@POST
	@Produces("application/json")
	@Path("/prof/createcourse")
	public void newCourse(@HeaderParam("token") String token, @FormParam("course_nr") int course_nr,
			@FormParam("course_title") String course_title, @FormParam("semester") String semester,
			@FormParam("username") String username) {
		try {
			if (isValid(token)) {
				DatabaseConnector.createCourse(course_nr, course_title, semester, username);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Professor can delete a course.
	 * @autor Tülin Duman
	 * @param token checks if the token is valid before executing the method
	 * @param username user ID of the student
	 */
	
	@DELETE
	@Produces("application/json")
	@Path("/prof/deletecourse/{course_nr}")
	public void deleteCourse(@HeaderParam("token") String token,
			@PathParam("course_nr") int course_nr) {
		try {
			if (isValid(token)) {
				DatabaseConnector.deleteCourse(course_nr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Get the information from all created courses.
	 * @author Tülin Duman
	 * @param token checks if the token is valid before executing the method
	 * @param course_nr is the ID of a course, every course has a unique number
	 * @return
	 */
	/*Get the information from all created courses*/
	@GET
	@Produces("application/json")
	@Path("/prof/course/{course_nr}")
	public List<Template> getCourse(@HeaderParam("token") String token, @PathParam("course_nr") int course_nr) {
		List<Template> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.course(course_nr);
				return c;
			} else {
				return c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 
	 * @param token
	 * @param title
	 * @param weighting
	 * @param group_nr
	 */
	
	/*Professor can create new criteria*/
	@POST
	@Produces("application/json")
	@Path("/prof/createcriteria")
	public void newCriteria(@HeaderParam("token") String token, @FormParam("title") String title,
			@FormParam("weighting") double weighting, @FormParam("group_nr") int group_nr) {
		try {
			if (isValid(token)) {
				DatabaseConnector.createCriteria(title, weighting, group_nr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param token
	 * @param title
	 */
	
	/*Professor can delete a criteria*/
	@DELETE
	@Produces("application/json")
	@Path("/prof/deletecriteria")
	public void deleteCriteria(@HeaderParam("token") String token, @FormParam("title") String title) {
		try {
			if (isValid(token)) {
				DatabaseConnector.deleteCriteria(title);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param token
	 * @param group_nr
	 * @param title
	 * @param course_nr
	 */
	
	/*Professor can create a new group*/
	@POST
	@Produces("application/json")
	@Path("/prof/creategroup")
	public void newGroup(@HeaderParam("token") String token, @FormParam("group_nr") int group_nr, @FormParam("title") String title, @FormParam("course_nr") int course_nr) {
		try {
			if (isValid(token)) {
				DatabaseConnector.createGroup(group_nr, title, course_nr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param token
	 * @param title
	 */
	
	/*Professor can delete an existing group*/
	@DELETE
	@Produces("application/json")
	@Path("/prof/deletegroup")
	public void deleteGroup(@HeaderParam("token") String token, @FormParam("title") String title) {
		try {
			if (isValid(token)) {
				DatabaseConnector.deleteGroup(title);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param token
	 * @param group_nr
	 * @return
	 */
	
	/*Professor can get all student informations from a group*/
	@GET
	@Produces("application/json")
	@Path("/group/{group_nr}")
	public List<Student> ListOfStudentsFromCourse(@HeaderParam("token") String token,
			@PathParam("group_nr") int group_nr) {
		List<Student> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.searchforStudents(group_nr);
				return c;
			} else {
				return c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 
	 * @param token
	 * @param username
	 * @return
	 */
    
	/*Student can get a list of his joined courses*/
	@GET
	@Produces("application/json")
	@Path("/student/{username}")
	public List<Course> getCoursesOfStudent(@HeaderParam("token") String token,
			@PathParam("username") String username) {
		List<Course> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.searchforCoursesbyUsername(username);
				return c;
			} else {
				return c;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	/** Professor can get a list of his courses.
	 * @author Tülin Duman
	 * @param token checks if the token is valid before executing the method
	 * @param username user ID of the student
	 * @return a list of courses
	 */
	
	@GET
	@Produces("application/json")
	@Path("/prof/{username}")
	public List<Course> getCoursesOfProfessor(@HeaderParam("token") String token,
			@PathParam("username") String username) {
		List<Course> c = null;
		try {
			if (isValid(token)) {
				c = DatabaseConnector.searchforCoursesbyProf(username);
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
