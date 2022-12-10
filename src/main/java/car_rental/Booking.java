package car_rental;

import java.util.Date;

import javax.swing.JOptionPane;

public class Booking extends PrintError {
    // Variable
    private String rentId;
    private Customer user;
    private Car car;
    private String startDate;
    private String endDate;
    private String totalCost;


    // Constructor
    public Booking() {
        this.rentId = null;
        this.user = null;
        this.car = null;
        this.startDate = null;
        this.endDate = null;
    }

    public Booking(String tmpRentId, Customer tmpUser, Car tmpCar, String tmpDate, String tmpEndDate, String tmpCost) {
        this.rentId = tmpRentId;
        this.user = tmpUser;
        this.car = tmpCar;
        this.startDate = tmpDate;
        this.endDate = tmpEndDate;
        totalCost = tmpCost;
    }


    // RentId
    public String getRentId() {
        return this.rentId;
    }

    public void setRentId(String tmpRentId) {
        this.rentId = tmpRentId;
    }

    // User
    public Customer getUser() {
        return this.user;
    }

    public void setUser(Customer tmpUser) {
        this.user = tmpUser;
    }

    // Car
    public Car getCar() {
        return this.car;
    }

    public void setCar(Car tmpCar) {
        this.car = tmpCar;
    }

    // Start Date
    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String tmpDate) {
        this.startDate = tmpDate;
    }
    
    // End Date
        // Start Date
    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String tmpDate) {
        this.endDate = tmpDate;
    }
    
    // Total Cost
    public String getTotalCost() {
        return this.totalCost;
    }
    
    public void setTotalCost(String tmpTotalCost) {
        totalCost = tmpTotalCost;
    }


    // Extra function
    public void printError(int errorNo) {
        if (errorNo == 1) JOptionPane.showMessageDialog(null, "Error 1");
        else JOptionPane.showMessageDialog(null, "Unknown Error");
    }
}
