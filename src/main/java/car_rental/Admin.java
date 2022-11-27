package car_rental;

public class Admin extends User{
    // Constructor
    public Admin() {
        setId(null);
        setName(null);
        setPass(null);
    }

    public Admin(String tmpId, String tmpName, String tmpPass) {
        setId(tmpId);
        setName(tmpName);
        setPass(tmpPass);
    }
}
