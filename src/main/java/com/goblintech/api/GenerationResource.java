package com.goblintech.api;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/*
* GenerationResource
*/
@Path("generation")
@RequestScoped
public class GenerationResource {
    
    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHello(){
        return Response.ok("hello").build();
    }
}
