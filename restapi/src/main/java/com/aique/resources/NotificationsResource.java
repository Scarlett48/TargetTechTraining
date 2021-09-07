package com.aique.resources;

import com.aique.domain.Notification;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/notifications")
public class NotificationsResource {
    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Service online").build();
    }

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNotification(@PathParam("id") int id) {
        return Response.ok()
                .entity(new Notification(id, "john", "test notification"))
                .build();
    }

    @POST
    @Path("/post/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postNotification(Notification notification) {
         System.out.println("Notification ID : "+notification.getId()+" Name : "+notification.getName());
        return Response.status(201).entity(notification).build();
    }

    @PUT
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createNotification(Notification notification) {
        //implement logic here
        System.out.println("Notification ID : "+notification.getId()+" Name : "+notification.getName());
        //save notification data into database....
        return Response.ok("Created Notification").entity(notification).build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteNotification(@PathParam("id") int id) {
        Notification n = new Notification(id,"App Notification","Deleting message");
        return Response.ok().entity(n).build();
    }
}
