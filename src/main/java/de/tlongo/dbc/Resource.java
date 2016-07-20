/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tlongo.dbc;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author tomas
 */
@Path("/")
public class Resource {
    
    // This will be our factory.
    @Inject
    Instance<Name> factory;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/test")
    public String sayHi() {
        return String.format("Hi, my name ist %s%n", factory.get().getName());
    }
    
}
