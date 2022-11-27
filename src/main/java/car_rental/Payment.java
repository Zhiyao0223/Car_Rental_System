package car_rental;

import java.util.Date;

import javax.swing.JOptionPane;

public class Payment extends PrintError{
    // Variable
    private String paymentId;
    private Booking booking;
    private String paymentMethod;
    private Date date;


    // Constructor
    public Payment() {
        this.paymentId = null;
        this.booking = null;
        this.paymentMethod = null;
        this.date = null;
    }

    public Payment(String tmpPaymentId, Booking tmpBooking, String tmpPaymentMethod, Date tmpDate) {
        this.paymentId = tmpPaymentId;
        this.booking = tmpBooking;
        this.paymentMethod = tmpPaymentMethod;
        this.date = tmpDate;
    }


    // PaymentId
    public String getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(String tmpPaymentId) {
        this.paymentId = tmpPaymentId;
    }

    // Booking reference
    public Booking getBooking() {
        return this.booking;
    }

    public void setBooking(Booking tmpBooking) {
        this.booking = tmpBooking;
    }

    // Payment Method
    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String tmpPaymentMethod) {
        this.paymentMethod = tmpPaymentMethod;
    }

    // Date
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date tmpDate) {
        this.date = tmpDate;
    }

    
    // Extra Function
    public void printError(int errorNo) {
        if (errorNo == 1) JOptionPane.showMessageDialog(null, "Error 1");
        else JOptionPane.showMessageDialog(null, "Unknown Error");
    }
}
