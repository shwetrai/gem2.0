package tcspoc.gem.models;

import java.time.Instant;

public class Applicant {

    private String arn;
    private String process_id;
    private Boolean arn_mobile_notification_sent;
    private String name;
    private String email;

    private String account_no;
    private Boolean pan_verified;
    private Boolean arn_pan_notification_sent;
    private Instant created_at;
    private Boolean mobile_verified;
    private String application_id;
    private Integer mobile_no;
    private String bank_name;
    private String pan;
    private Instant updated_at;

    public String getArn() {
        return arn;
    }

    public void setArn(String arn) {
        this.arn = arn;
    }

    public String getProcess_id() {
        return process_id;
    }

    public void setProcess_id(String process_id) {
        this.process_id = process_id;
    }

    public Boolean isArn_mobile_notification_sent() {
        return arn_mobile_notification_sent;
    }

    public void setArn_mobile_notification_sent(Boolean arn_mobile_notification_sent) {
        this.arn_mobile_notification_sent = arn_mobile_notification_sent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public Boolean isPan_verified() {
        return pan_verified;
    }

    public void setPan_verified(Boolean pan_verified) {
        this.pan_verified = pan_verified;
    }

    public Boolean isArn_pan_notification_sent() {
        return arn_pan_notification_sent;
    }

    public void setArn_pan_notification_sent(Boolean arn_pan_notification_sent) {
        this.arn_pan_notification_sent = arn_pan_notification_sent;
    }

    public Instant getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Instant created_at) {
        this.created_at = created_at;
    }

    public Boolean isMobile_verified() {
        return mobile_verified;
    }

    public void setMobile_verified(Boolean mobile_verified) {
        this.mobile_verified = mobile_verified;
    }

    public String getApplication_id() {
        return application_id;
    }

    public void setApplication_id(String application_id) {
        this.application_id = application_id;
    }

    public Integer getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(Integer mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Instant getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Instant updated_at) {
        this.updated_at = updated_at;
    }
}