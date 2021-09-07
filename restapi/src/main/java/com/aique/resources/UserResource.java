package com.aique.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserResource {

    @GET
    @Path("/info/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserDetails(@PathParam("name") String user) {
        //implement logic here
        return Response.ok("API for getting information for user " + user).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addUser() {
        //implement logic here
        return Response.ok("Successfully added User via POST request").build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response addNewUser() {
        //implement logic here
        return Response.ok("Added new user").build();
    }

    @DELETE
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response deleteUser(@PathParam("name") String user) {
        return Response.ok("Successfully deleted user " + user).build();
    }
}

