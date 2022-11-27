package car_rental;

public abstract class User {
    // Variable
    private String id;
    private String password;
    private String name;

    // ID
    public String getId() {
        return this.id;
    }

    public void setId(String tmpId) {
        this.id = tmpId;
    }

    // Password
    public String getPass() {
        return this.password;
    }

    public void setPass(String tmpPass) {
        this.password = tmpPass;
    }

    // Name
    public String getName() {
        return this.name;
    }
    
    public void setName(String tmpName) {
        this.name = tmpName;
    }
}
