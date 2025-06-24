package tcspoc.gem.services;

import tcspoc.gem.models.OTPValue;
import tcspoc.gem.models.OTPVerification;
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

    public OTPVerification verifyOTP(OTPValue otpValue){
        Integer otp = otpValue.getOtp();
        return otpRemoteService.verifyOTP(otp);
    }
}