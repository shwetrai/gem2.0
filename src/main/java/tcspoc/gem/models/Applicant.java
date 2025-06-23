package tcspoc.gem.model;

public class Applicant{

    private Integer mobile_no;
    private Integer otp;
    private String name;
    private String email;
    private String bank_name;
    private String account_no;
    private String pan;

    public Integer getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(Integer mobile_no) {
        this.mobile_no = mobile_no;
    }

    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
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

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

}