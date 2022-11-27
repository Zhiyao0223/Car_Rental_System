package car_rental;

import java.util.Date;

import javax.swing.JOptionPane;

public class Booking extends PrintError {
    // Variable
    private String rentId;
    private User user;
    private Car car;
    private Date date;


    // Constructor
    public Booking() {
        this.rentId = null;
        this.user = null;
        this.car = null;
        this.date = null;
    }

    public Booking(String tmpRentId, User tmpUser, Car tmpCar, Date tmpDate) {
        this.rentId = tmpRentId;
        this.user = tmpUser;
        this.car = tmpCar;
        this.date = tmpDate;
    }


    // RentId
    public String getRentId() {
        return this.rentId;
    }

    public void setRentId(String tmpRentId) {
        this.rentId = tmpRentId;
    }

    // User
    public User getUser() {
        return this.user;
    }

    public void setUser(User tmpUser) {
        this.user = tmpUser;
    }

    // Car
    public Car getCar() {
        return this.car;
    }

    public void setCar(Car tmpCar) {
        this.car = tmpCar;
    }

    // Date
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date tmpDate) {
        this.date = tmpDate;
    }


    // Extra function
    public void printError(int errorNo) {
        if (errorNo == 1) JOptionPane.showMessageDialog(null, "Error 1");
        else JOptionPane.showMessageDialog(null, "Unknown Error");
    }
}
