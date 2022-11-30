package car_rental;

public class Admin extends User{
    private String username;
    
    // Constructor
    public Admin() {
        setId(null);
        setName(null);
        setPass(null);
        setUsername(null);
    }

    public Admin(String tmpId, String tmpUsername, String tmpName, String tmpPass) {
        setId(tmpId);
        setName(tmpName);
        setPass(tmpPass);
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
