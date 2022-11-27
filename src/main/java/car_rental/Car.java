package car_rental;

public class Car {
    // Variable
    private String id;
    private String brand;
    private String model;
    private String gear;
    private String location;

    private int year;

    private double costHour;
    private double costDay;
    private double costWeek;
    private double mileage;

    private Boolean status;

    // Constructor
    public Car() {
        this.id = null;
        this.brand = null;
        this.model = null;
        this.gear = null;
        this.location = null;
        this.year = 0;
        this.costDay = 0;
        this.costHour = 0;
        this.costWeek = 0;
        this.mileage = 0;
        this.status = false;
    }

    public Car(String tmpId, String tmpBrand, String tmpModel, String tmpGear, String tmpLocation, int tmpYear, double tmpCostHour, double tmpCostDay, double tmpCostWeek, double tmpMileage, boolean tmpStatus) {
        this.id = tmpId;
        this.brand = tmpBrand;
        this.model = tmpModel;
        this.gear = tmpGear;
        this.location = tmpLocation;
        this.year = tmpYear;
        this.costDay = tmpCostDay;
        this.costHour = tmpCostHour;
        this.costWeek = tmpCostWeek;
        this.mileage = tmpMileage;
        this.status = tmpStatus;
    }

    // ID
    public String getId() {
        return this.id;
    }

    public void setId(String tmpId) {
        this.id = tmpId;
    }

    // Brand
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String tmpBrand) {
        this.brand = tmpBrand;
    }

    // Model
    public String getModel() {
        return this.model;
    }

    public void setModel(String tmpModel) {
        this.model = tmpModel;
    }

    // Gear
    public String getGear() {
        return this.gear;
    }

    public void setGear(String tmpGear) {
        this.gear = tmpGear;
    }

    // Location
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String tmpLocation) {
        this.location = tmpLocation;
    }

    // Year
    public int getYear() {
        return this.year;
    }

    public void setYear(int tmpYear) {
        this.year = tmpYear;
    }

    // Cost per Hour
    public double getCostHour() {
        return this.costHour;
    }

    public void setId(double tmpCostHour) {
        this.costHour = tmpCostHour;
    }

    // Cost per Day
    public double getCostDay() {
        return this.costDay;
    }

    public void setCostDay(double tmpCostDay) {
        this.costDay = tmpCostDay;
    }

    // Cost per Week
    public double getCostWeek() {
        return this.costWeek;
    }

    public void setCostWeek(double tmpCostWeek) {
        this.costWeek = tmpCostWeek;
    }

    // Cost per Week
    public double getMileage() {
        return this.mileage;
    }

    public void setMileage(double tmpMileage) {
        this.mileage = tmpMileage;
    }

    // Available Status
    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean tmpStatus) {
        this.status = tmpStatus;
    }

}
