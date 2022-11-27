package car_rental;

public interface ValidateProcess {
    // Check blank input
    default boolean checkBlank(String tmp) {
        return false;
    }


}
