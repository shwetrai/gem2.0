package tcspoc.gem.services;

import tcspoc.gem.models.OTPValue;
import tcspoc.gem.rest.OTPRemoteService;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class OTPService {

    @Inject
    @RestClient
    OTPRemoteService otpRemoteService;

    public OTPValue getOTP() {
        return otpRemoteService.getOTP();
    }

    public Boolean verifyOTP(String otp){
        return otpRemoteService.verifyOTP(otp);
    }
}