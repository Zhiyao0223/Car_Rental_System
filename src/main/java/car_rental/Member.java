package car_rental;

public class Member extends User{
    // Variable
    private String phoneNo;
    private String email;

    // Constructor
    public Member() {
        super(null, null, null);
        setPhoneNo(null);
        setEmail(null);
    }

    public Member(String tmpId, String tmpName, String tmpPass, String tmpPhoneNo, String tmpEmail) {
        super(tmpId, tmpName, tmpPass);
        phoneNo = tmpPhoneNo;
        email = tmpEmail;
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

