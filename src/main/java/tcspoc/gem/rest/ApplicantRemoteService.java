package tcspoc.gem.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import tcspoc.gem.models.Applicant;
import tcspoc.gem.models.ApplicantRequest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "https://gem-backend-gem.apps.itz-mcyk8s.infra01-lb.dal14.techzone.ibm.com")
public interface ApplicantRemoteService {

    @POST
    @Path("/registration/v1.0/generate-applicant-id")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant generateApplicantId(ApplicantRequest request);

    @PUT
    @Path("/registration/v1.0/notify-applicant/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updateMobileNotification(@PathParam("arn") String arn, Applicant update);

    @PUT
    @Path("/registration/v1.0/save-name/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updateName(@PathParam("arn") String arn, Applicant update);

    @PUT
    @Path("/registration/v1.0/save-email/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updateEmail(@PathParam("arn") String arn, Applicant update);

    @PUT
    @Path("/registration/v1.0/save-bank/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updateBank(@PathParam("arn") String arn, Applicant update);

    @PUT
    @Path("/registration/v1.0/save-account/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updateAccount(@PathParam("arn") String arn, Applicant update);

}
