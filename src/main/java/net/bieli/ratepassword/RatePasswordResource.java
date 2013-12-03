package net.bieli.ratepassword;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "ratepassword" path)
 */
@Path("ratepassword")
//@Path("ratepassword/{password: [a-zA-Z][a-zA-Z_0-9]*}")
public class RatePasswordResource {

    private static final String DEFAULT_RATE_MSG = "1";

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
//@GET @Path("/{password}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getRatePassword(
//@PathParam("password") String password
    ) {
        return DEFAULT_RATE_MSG;
    }
}
