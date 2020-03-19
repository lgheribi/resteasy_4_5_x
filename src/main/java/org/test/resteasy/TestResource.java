package org.test.resteasy;

import org.apache.commons.io.input.NullInputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class TestResource {
    @GET
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    @Path("/{size}")
    public Response donwload(@PathParam("size") long size) {
        return Response.ok(new NullInputStream(size)).build();
    }
}
