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

import com.rating.domain.Kursvorlage;
import com.rating.domain.Student;

@Path("/prof")
public class ProfessorResource extends BaseResource {
	

	@POST
	@Produces("application/json")
	@Path("/createcourse")
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
	@Path("/deletecourse")
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
	@Path("/createcriteria")
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
	@Path("/deletecriteria")
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
	@Path("/creategroup")
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
	@Path("/deletegroup")
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
