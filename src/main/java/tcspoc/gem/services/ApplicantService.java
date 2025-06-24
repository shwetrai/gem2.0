package tcspoc.gem.services;

import tcspoc.gem.models.Applicant;
import tcspoc.gem.models.ApplicantRequest;
import tcspoc.gem.models.UpdateAccountNo;
import tcspoc.gem.models.UpdateBank;
import tcspoc.gem.models.UpdateEmail;
import tcspoc.gem.models.UpdateMobNotif;
import tcspoc.gem.models.UpdateName;
import tcspoc.gem.rest.ApplicantRemoteService;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ApplicantService {
    @Inject
    @RestClient
    ApplicantRemoteService applicationRemoteService;

    public Applicant createApplicant(ApplicantRequest request) {
        
        return applicationRemoteService.generateApplicantId(request);
    }

    public Applicant setMobileNotification(Applicant applicant) {
       
        String arn = applicant.getArn();
        UpdateMobNotif updateMobNotif = new UpdateMobNotif();
        updateMobNotif.setArn_mobile_notification_sent(true);

        return applicationRemoteService.updateMobileNotification(arn, updateMobNotif);
    }

    public Applicant updateApplicantName(Applicant applicant) {
        String arn = applicant.getArn();
        UpdateName update = new UpdateName();
        //update.setName(applicant.getName());
        update.setName("bob");
        return applicationRemoteService.updateName(arn, update);
    }

    public Applicant updateApplicantEmail(Applicant applicant) {
        String arn = applicant.getArn();
        UpdateEmail update = new UpdateEmail();
       // update.setEmail(applicant.getEmail());
       update.setEmail("bob@abc.com");
        return applicationRemoteService.updateEmail(arn, update);
    }

    public Applicant updateApplicantBank(Applicant applicant) {
        String arn = applicant.getArn();
        UpdateBank update = new UpdateBank();
        // update.setBank_name(applicant.getBank_name());
        update.setBank_name("Focus Bank");
        return applicationRemoteService.updateBank(arn, update);
    }

    public Applicant updateApplicantAccount(Applicant applicant) {
        String arn = applicant.getArn();
        UpdateAccountNo update = new UpdateAccountNo();
        // update.setAccount_no(applicant.getAccount_no());
         update.setAccount_no("1234567");
        return applicationRemoteService.updateAccount(arn, update);
    }

}
