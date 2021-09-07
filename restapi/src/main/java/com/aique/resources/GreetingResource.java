package com.aique.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greet")
public class GreetingResource {

    /**
     * http://localhost:8080/api/greet/greetme
     * @return
     */
    @GET
    @Path("/greetme")
    @Produces(MediaType.TEXT_PLAIN)
    public String greetMe(){
        return "Hello from REST";
    }

    /**
     * http://localhost:8080/api/greet/hello
     * @return
     */

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(){
     return "Hello REST";
    }
}
