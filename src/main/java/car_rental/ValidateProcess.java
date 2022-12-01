package car_rental;

public interface ValidateProcess {
    // Check blank input
    default boolean checkBlank(String tmp) {
        return (!tmp.isBlank());
    }
    
    
    // Check Phone Number
    default boolean checkPhoneNo(String tmp) {
        // Check length of string and if string contain only digit
        return ((tmp.length() == 10 | tmp.length() == 11) && (checkInt(tmp)));
    }

    
    // Check Email
    default boolean checkEmail(String tmp) {
        return tmp.contains("@") && tmp.contains(".com");
    }
    
    
    // Check if integer only
    default boolean checkInt(String tmp) {
        try {
            Long.valueOf(tmp);
        } catch (Exception e){
            return false;
        }
        return true;
    }
    
    
    // Check year
    default boolean checkYear(String tmp) {
        try {
            Integer.parseInt(tmp);
            
            if (tmp.length() != 4) return false;
            if (tmp.indexOf(0) == 2 | tmp.indexOf(0) == 1) return false;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
    
}
