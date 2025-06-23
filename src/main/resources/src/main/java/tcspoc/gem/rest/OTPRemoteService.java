package tcspoc.gem.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/v1.0")
@RegisterRestClient
public interface OtpRemoteService {

    @GET
    @Path("/registration/v1.0/generate-otp")
    @Produces("application/json")
    Integer getOTP();

    @GET
    @Path("/registration/v1.0/verify-otp/{otp}")
    @Produces("application/json")
    Boolean verifyOTP(@PathParam("otp") String otp);

}