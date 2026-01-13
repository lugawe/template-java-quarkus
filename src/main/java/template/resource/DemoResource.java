package template.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import template.data.DemoRecord;
import template.service.DemoService;

@Path("/demo")
public class DemoResource {

    @Inject
    private DemoService demoService;

    public DemoResource() {}

    @GET
    public Response getDemoRecord() {

        DemoRecord demoRecord = demoService.getDemoRecord();

        return Response.ok(demoRecord).build();
    }
}
