package car_rental;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Log {
    // Variable
    private String dateTime;
    private Admin admin;
    private String page;

    // Constructor
    public Log() {
        this.dateTime = null;
        this.admin = null;
        this.page = null;
    }

    public Log(Admin tmpAdmin, String tmpPage) {
        this.dateTime = setDateTime();
        this.admin = tmpAdmin;
        this.page = tmpPage;
    }

    // Datetime
    public String getDateTime() {
        return this.dateTime;
    }

    public String setDateTime() {
        SimpleDateFormat ft = new SimpleDateFormat ("'['yyyy-MM-dd hh:mm:ss a zzz']'");
        Date tmpDate = new Date();

        return ft.format(tmpDate);
    }

    // Admin
    public Admin getAdmin() {
        return this.admin;
    }

    public void setAdmin(Admin tmpAdmin) {
        this.admin = tmpAdmin;
    }

    // Page
    public String getPage() {
        return this.page;
    }

    public void setPage(String tmpPage) {
        this.page = tmpPage;
    }

    //
    // Extra Function
    //
    public void writeLog(int logNo) {
        // Initialise string
        String logString = null;
        String adminName = admin.getName();

        // Check log number and change string value
        // Login
        if (logNo == 1) {
            logString = String.format("%s %s login.", setDateTime(), adminName);
        }
        // Logout
        else if (logNo == 2) {
            logString = String.format("%s %s logout.", setDateTime(), adminName);
        }
        // Add data
        else if (logNo == 3) {
            logString = String.format("%s %s add a new data in %s.", setDateTime(), adminName, page);
        }
        // Edit Data
        else if (logNo == 4) {
            logString = String.format("%s %s edit an existing data in %s.", setDateTime(), adminName, page);
        }
        // Delete Data
        else if (logNo == 5) {
            logString = String.format("%s %s delete a row of data from %s", setDateTime(), adminName, page);
        }
        else {
            logString = "Unknown Error";
        }

        // Append into log file
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File("src/main/resources/text_file/test.txt"), true));
            pw.append(logString);
            pw.append("\n");

            pw.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
}
