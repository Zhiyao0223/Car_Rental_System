package car_rental;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

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

    
    // Check Email Format
    default boolean checkEmail(String tmp) {
        return tmp.contains("@") && tmp.contains(".com");
    }
    
    
    // Check if integer only
    default boolean checkInt(String tmp) {
        try {
            Long.valueOf(tmp);
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    
    // Check year format
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
    
    
    // Compare date
    default boolean checkDate(Date startDate, Date endDate) {
        // Check if end date bigger than start date
        int dateValidateNo = endDate.compareTo(startDate);
        
        // Smaller
        if (dateValidateNo < 0) {
            JOptionPane.showMessageDialog(null, "End date must bigger than start date");
        }
        
        return (dateValidateNo >= 0);
    }
    
    
    // Check if car available on selected date
    default boolean checkAvailableStatus(List <String[]> lineArray, int indexNo, String carID, Date startDates, Date endDates) {
        // Check index
        int lineCounter = 0;

        // Loop over all car rows
        for (String[] lines: lineArray) {
            // Find selected car
            if (lines[2].equals(carID)) {
                Date fileStartDate = new Date(lines[3]);
                Date fileEndDate = new Date(lines[4]);
                
                // Start date between other rent time
                
                // 
            }
        }
        
        return true;
    }
    
}
