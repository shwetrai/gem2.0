package tcspoc.gem.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import tcspoc.gem.models.Applicant;
import tcspoc.gem.models.ApplicantRequest;
import tcspoc.gem.models.UpdateAccountNo;
import tcspoc.gem.models.UpdateBank;
import tcspoc.gem.models.UpdateEmail;
import tcspoc.gem.models.UpdateMobNotif;
import tcspoc.gem.models.UpdateName;
import tcspoc.gem.models.UpdatePAN;
import tcspoc.gem.models.UpdatePANNotification;
import jakarta.ws.rs.*;
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
    Applicant updateMobileNotification(@PathParam("arn") String arn, UpdateMobNotif update);

    @PUT
    @Path("/registration/v1.0/save-name/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updateName(@PathParam("arn") String arn, UpdateName update);

    @PUT
    @Path("/registration/v1.0/save-email/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updateEmail(@PathParam("arn") String arn, UpdateEmail update);

    @PUT
    @Path("/registration/v1.0/save-bank/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updateBank(@PathParam("arn") String arn, UpdateBank update);

    @PUT
    @Path("/registration/v1.0/save-account/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updateAccount(@PathParam("arn") String arn, UpdateAccountNo update);


    @PUT
    @Path("/registration/v1.0/verify-pan/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updatePAN(@PathParam("arn") String arn, UpdatePAN update);

    @PUT
    @Path("/registration/v1.0/notify-pan-verification/{arn}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Applicant updatePANNotification(@PathParam("arn") String arn, UpdatePANNotification update);


}
