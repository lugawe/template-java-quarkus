package template.quarkus.server.resource;

import jakarta.ws.rs.*;

@Path("/hello")
public class HelloResource {

    public HelloResource() {}

    @GET
    public String sayHello(@QueryParam("name") String name) {

        return "Hello " + name;
    }
}
