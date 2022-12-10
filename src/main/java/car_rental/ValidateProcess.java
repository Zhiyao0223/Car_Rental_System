package car_rental;

import java.text.SimpleDateFormat;
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
    default boolean checkDate(String startDates, String endDates) {
        // Convert date
        Date startDate, endDate;
        
        try {
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(startDates);
            endDate = new SimpleDateFormat("dd/MM/yyyy").parse(endDates);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        
        // Check if end date bigger than start date
        int dateValidateNo = endDate.compareTo(startDate);
        
        System.out.println(endDate + " " + startDate);
        
        // Smaller
        if (dateValidateNo < 0) {
            JOptionPane.showMessageDialog(null, "End date must bigger than start date");
        }
        
        return (dateValidateNo >= 0);
    }
    
    
    // Check if car available on selected date
    default boolean checkAvailableStatus(List <String[]> lineArray, int indexNo, String carID, String startDates, String endDates) {
        /* 
        Parameter:
        lineArray : booking list
        indexNo : skip duplicate booking (only applicable in edit booking
        carId : Primary key of the car
        startDates : Booking start date
        endDates : Booking end date
        */
        
        // Check index
        int lineCounter = 0;
        
        // Convert string to date
        Date startDate, endDate, fileStartDate, fileEndDate;
        
        try {
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(startDates);
            endDate = new SimpleDateFormat("dd/MM/yyyy").parse(endDates);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

        // Loop over all car rows
        for (String[] lines: lineArray) {
            // Find selected car
            if (lines[2].equals(carID)) {
                // Dont check for same row
                if (lineCounter == indexNo) {
                    continue;
                }
                
                // Convert date in file
                try {
                    fileStartDate = new SimpleDateFormat("dd/MM/yyyy").parse(lines[3]);
                    fileEndDate = new SimpleDateFormat("dd/MM/yyyy").parse(lines[4]);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    return false;
                }
                
                // Start date or end date between other rent time
                if ((startDate.compareTo(fileStartDate) >= 0 && startDate.compareTo(fileEndDate) <= 0) ||
                        (endDate.compareTo(fileStartDate) >= 0 && endDate.compareTo(fileEndDate) <= 0)) {
                    JOptionPane.showMessageDialog(null, "Car is not available at that moment");
                    return false;
                }
                // Earlier start date but later end date
                else if (startDate.compareTo(fileStartDate) <= 0 && endDate.compareTo(fileEndDate) >= 0) {
                    JOptionPane.showMessageDialog(null, "Car is not available at that moment");
                    return false;
                }
            }
            lineCounter++;
        }
        
        return true;
    }
    
    
    // Check card
    default boolean checkCard(String tmpCardNo, String tmpCvc, String tmpExpiryDate) {
        // Check expiry date
        if (tmpExpiryDate.contains("/")) {
            if (tmpExpiryDate.length() != 5) return false;
            else if (!(checkInt(tmpExpiryDate.split("/")[0]) && checkInt(tmpExpiryDate.split("/")[1]))) return false;
        } 
        else {
            return false;
        }
        
        // Check card no and cvc
        if (!checkInt(tmpCardNo)) return false;
        else if (tmpCvc.length() != 3) return false;
        
        
        return true;
    }
    
    
    // Check ic
    default boolean checkIc(String tmpIc) {
        return ((tmpIc.length() == 12) && (checkInt(tmpIc)));
    }
    
    
}
