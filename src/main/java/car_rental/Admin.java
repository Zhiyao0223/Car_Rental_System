package car_rental;

public class Admin extends User{
    private String username;
    
    // Constructor
    public Admin() {
        super(null, null, null);
        setUsername(null);
    }

    public Admin(String tmpId, String tmpUsername, String tmpName, String tmpPass) {
        super(tmpId, tmpName, tmpPass);
        setUsername(tmpUsername);
    }
    
    // Username
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String tmpUsername) {
        username = tmpUsername;
    }
}
