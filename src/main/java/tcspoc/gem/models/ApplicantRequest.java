package tcspoc.gem.models;

public class ApplicantRequest {

    private String process_id;
    private String mobile_no;
    private boolean mobile_verified;


    public String getProcess_id() {
        return process_id;
    }

    public void setProcess_id(String process_id) {
        this.process_id = process_id;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public boolean isMobile_verified() {
        return mobile_verified;
    }

    public void setMobile_verified(boolean mobile_verified) {
        this.mobile_verified = mobile_verified;
    }
}