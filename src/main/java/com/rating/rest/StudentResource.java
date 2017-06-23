package com.rating.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.rating.domain.Template;
import com.rating.domain.Student;

@Path("/stud")
public class StudentResource extends BaseResource{
	
	@GET
    @Produces("application/json")
    @Path("course/group/{gruppen_nr}")
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
    @Path("/courses/{iz_kuerzel}")
    public List<Template> getCoursesOfStudent(@HeaderParam("token") String token,
            @PathParam("iz_kuerzel") String iz_kuerzel) {
        List<Template> c = null;
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

}
