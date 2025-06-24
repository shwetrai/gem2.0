package tcspoc.gem.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import tcspoc.gem.models.OTPValue;
import tcspoc.gem.models.OTPVerification;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;


@RegisterRestClient(baseUri="https://gem-backend-gem.apps.itz-mcyk8s.infra01-lb.dal14.techzone.ibm.com")
public interface OTPRemoteService {

    @GET
    @Path("/registration/v1.0/generate-otp")
    @Produces("application/json")
    OTPValue getOTP();

    @GET
    @Path("/registration/v1.0/verify-otp/{otp}")
    @Produces("application/json")
    OTPVerification verifyOTP(@PathParam("otp") Integer otp);

}