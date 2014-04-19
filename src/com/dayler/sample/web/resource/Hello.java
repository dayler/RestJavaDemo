/**
 * 
 */
package com.dayler.sample.web.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author asalazar
 *
 */
@Path("/hello")
public class Hello {

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String sayHello(@QueryParam("myName") String name) {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey " + name + "</hello>";
    }
}
