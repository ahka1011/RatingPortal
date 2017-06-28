package com.rating.rest;

import java.io.UnsupportedEncodingException;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;

import com.rating.domain.User;

/**
 * This class provides the REST API for login and logout.
 * Inherits from {@link com.rating.rest.BaseResource}.
 * 
 * @author Burcu Kulaksiz
 *
 */
@Path("/session")
public class SessionResource extends BaseResource {

	@Context
	HttpServletRequest request;

	/**
	 * REST-API for login.
	 * When authentification is successful, a session will be started and a unique token generated.
	 * @param username user ID of student or professor
	 * @param password related password
	 * @return User object with user-related data from LDAP
	 * @throws NamingException if the authentication fails
	 * @throws UnsupportedEncodingException if the Character Encoding is not supported
	 */
	@POST
	@Produces("application/json")
	@Path("/login")
	public User Login(@FormParam("username") String username, @FormParam("password") String password)
			throws NamingException, UnsupportedEncodingException {

		HttpSession s = request.getSession();
		if (s != null) {
			s.invalidate();
		}

		User usr = LDAP_Entry.findUser(username, password);

		if (usr != null) {
			s = request.getSession(true);

			s.setAttribute("token", usr.getToken());
			s.setAttribute("user", usr);

			token2session.put(usr.getToken().toString(), s);
		}

		return usr;
	}

	/**
	 * REST-API for logout.
	 * Session is destroyed.
	 * @param token unique token
	 * @return true on successful logout
	 */
	@POST
	@Produces("application/json")
	@Path("/logout")
	public boolean Logout(@HeaderParam("token") String token) {
		try {
			if (isValid(token)) {
				HttpSession s = token2session.get(token);
				
				s.invalidate();
				
				token2session.remove(token);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
