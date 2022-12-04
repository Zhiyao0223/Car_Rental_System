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
        List<String[]> test = new ArrayList<String[]>();
        test.add(new String[] {"1", "2", "3", "4"});
        test.add(new String[] {"a", "b", "c", "d"});
        
        System.out.println(test.size());
        
        for (String[] tmp1 : test) {
            for (String tmpLine : tmp1) {
                System.out.println(tmpLine);
            }
            System.out.println();
        }
        
    }
}
