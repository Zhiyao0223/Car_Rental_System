package car_rental;

public class Car {
    // Variable
    private String id;
    private String brand;
    private String model;
    private String gear;
    private String location;

    private String year;

    private String costHour;
    private String costDay;
    private String costWeek;
    private String mileage;

    private String status;

    // Constructor
    public Car() {
        this.id = null;
        this.brand = null;
        this.model = null;
        this.gear = null;
        this.location = null;
        this.year = "0";
        this.costDay = "0";
        this.costHour = "0";
        this.costWeek = "0";
        this.mileage = "0";
        this.status = "false";
    }

    public Car(String tmpId, String tmpBrand, String tmpModel, String tmpYear, String tmpGear, String tmpCostHour, String tmpCostDay, String tmpCostWeek, String tmpMileage, String tmpLocation, String tmpStatus) {
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
    public String getYear() {
        return this.year;
    }

    public void setYear(String tmpYear) {
        this.year = tmpYear;
    }

    // Cost per Hour
    public String getCostHour() {
        return this.costHour;
    }

    public void setCostHour(String tmpCostHour) {
        this.costHour = tmpCostHour;
    }

    // Cost per Day
    public String getCostDay() {
        return this.costDay;
    }

    public void setCostDay(String tmpCostDay) {
        this.costDay = tmpCostDay;
    }

    // Cost per Week
    public String getCostWeek() {
        return this.costWeek;
    }

    public void setCostWeek(String tmpCostWeek) {
        this.costWeek = tmpCostWeek;
    }

    // Cost per Week
    public String getMileage() {
        return this.mileage;
    }

    public void setMileage(String tmpMileage) {
        this.mileage = tmpMileage;
    }

    // Available Status
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String tmpStatus) {
        this.status = tmpStatus;
    }

}
