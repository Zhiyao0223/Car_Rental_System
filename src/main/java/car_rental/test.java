package car_rental;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class test implements FileProcess {
    public static void main(String[] args) {
        String test = "Status - True";
        System.out.println(test.split(" - ")[1]);
    }
}
