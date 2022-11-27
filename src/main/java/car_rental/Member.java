package car_rental;

public class Member extends User{
    // Variable
    private String phoneNo;
    private String email;

    // Constructor
    public Member() {
        setId(null);
        setName(null);
        setPass(null);
    }

    public Member(String tmpId, String tmpName, String tmpPass) {
        setId(tmpId);
        setName(tmpName);
        setPass(tmpPass);
    }

    // Phone Number
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(String tmpPhoneNo) {
        this.phoneNo = tmpPhoneNo;
    }

    // Email
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String tmpEmail) {
        this.email = tmpEmail;
    }
}

