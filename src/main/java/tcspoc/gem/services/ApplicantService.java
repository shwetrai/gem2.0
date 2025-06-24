package tcspoc.gem.services;

import tcspoc.gem.models.Applicant;
import tcspoc.gem.models.ApplicantRequest;
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
        System.out.println("###### "+request.getMobile_no());
        return applicationRemoteService.generateApplicantId(request);
    }

    public Applicant setMobileNotification(String arn, boolean notificationSent) {
        Applicant update = new Applicant();
        update.setArn_mobile_notification_sent(notificationSent);
        return applicationRemoteService.updateMobileNotification(arn, update);
    }

    public Applicant updateApplicantName(String arn, String name) {
        Applicant update = new Applicant();
        update.setName(name);
        return applicationRemoteService.updateName(arn, update);
    }

    public Applicant updateApplicantEmail(String arn, String email) {
        Applicant update = new Applicant();
        update.setEmail(email);
        return applicationRemoteService.updateEmail(arn, update);
    }

    public Applicant updateApplicantBank(String arn, String bankName) {
        Applicant update = new Applicant();
        update.setBank_name(bankName);
        return applicationRemoteService.updateBank(arn, update);
    }

    public Applicant updateApplicantAccount(String arn, String accountNo) {
        Applicant update = new Applicant();
        update.setAccount_no(accountNo);
        return applicationRemoteService.updateAccount(arn, update);
    }

}
