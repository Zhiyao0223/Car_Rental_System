package car_rental;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
        
        Member member = new Member("010110123456", "Ali", "1234", "1234567890", "ali@gmaid.com");
        new CustHomepage(member).setVisible(true);
    }
}
