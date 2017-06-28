package com.rating.domain;

/**
 * This class includes an encrypted password.
 * This is a precondition for the LDAP configuration and for the full functionality of user authentication.
 * 
 * @see com.rating.rest.LDAP_Entry#findUser(String, String)
 * 
 * @author Burcu Kulaksiz
 *
 */
public class Pwd {

	String pwd = "SHVzaEJhY3UyMDE0";

	public String getPwd() {
		return pwd;
	}
}

