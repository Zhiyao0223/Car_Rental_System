package car_rental;


import javax.swing.JOptionPane;


public class Payment extends PrintError{
    // Variable
    private String paymentId;
    private Booking booking;
    private String paymentMethod;
    private String date;
    private String time;

    // Constructor
    public Payment() {
        this.paymentId = null;
        this.booking = null;
        this.paymentMethod = null;
        this.date = null;
    }

    public Payment(String tmpPaymentId, Booking tmpBooking, String tmpPaymentMethod, String tmpDate, String tmpTime) {
        this.paymentId = tmpPaymentId;
        this.booking = tmpBooking;
        this.paymentMethod = tmpPaymentMethod;
        this.date = tmpDate;
        this.time = tmpTime;
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
    public String getDate() {
        return this.date;
    }

    public void setDate(String tmpDate) {
        this.date = tmpDate;
    }
    
    // Date
    public String getTime() {
        return this.time;
    }

    public void setTime(String tmpTime) {
        this.time = tmpTime;
    }

    // Extra Function
    public void printError(int errorNo) {
        if (errorNo == 1) JOptionPane.showMessageDialog(null, "Error: Payment cannot be found");
        else JOptionPane.showMessageDialog(null, "Unknown error occur");
    }
}
