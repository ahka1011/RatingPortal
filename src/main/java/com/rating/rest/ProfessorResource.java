package com.rating.rest;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.rating.domain.Kursvorlage;
import com.rating.domain.Student;

@Path("/prof")
public class ProfessorResource extends BaseResource {
	/*
    @POST
    @Produces("application/json")
    @Path("/newcourse")
    public void newCourse(@HeaderParam("token") String token, @FormParam("kursName") String kursName,
            @FormParam("semester") String semester, @FormParam("kuerzel") String kuerzel) {
        try {
            if (isValid(token)) {
                DatabaseConnector.kursAnlegen(kursName, semester, kuerzel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */
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
    @Path("/templates/{kurs_nr}")
    public List<Kursvorlage> getTemplate(@HeaderParam("token") String token,
            @PathParam("kurs_nr") int kurs_nr) {
        List <Kursvorlage> c = null;
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
