package com.sapient.webServicie;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/login")
public class LoginWebService {
	@POST
	@Path("/setingDetails")
	@Produces(MediaType.TEXT_HTML)
	public String setDetails(@FormParam("fname") String fname, @FormParam("lname") String lname, @FormParam("email") String email,@FormParam("mobile") String mobile,@FormParam("password") String password,@FormParam("retype") String retype){
		
		
		
		return "";
	}

}
