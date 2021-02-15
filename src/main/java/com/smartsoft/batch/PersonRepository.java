package com.smartsoft.batch;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Stateless
public class PersonRepository {
	@EJB
	private PersonEjb pe;
@GET
@Path("/save")
public String save() {
	Person p = new Person();
	p.setAge(24);
	p.setFirstName("hamid");
	p.setLastName("abroshan");
	return"persisted";
}
}
