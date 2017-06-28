package com.rating.rest;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

/**
 * This class is a superclass.
 * All resource classes inherit from this superclass.
 * In a HashMap key (token) and value (associated session) are stored.
 *
 */
public class BaseResource {

	static HashMap<String, HttpSession> token2session = new HashMap<String, HttpSession>();

	/**
	 * Method to check whether token is valid.
	 * @param token unique token
	 * @return true when an associated session is found for the token
	 * @throws Exception if token is invalid and no current session is found
	 */
	static boolean isValid(String token) throws Exception {
		try {
			HttpSession s = token2session.get(token);
			return true;

		} catch (Exception e) {
			throw new Exception("Token is not valid");
		}
	}
}
