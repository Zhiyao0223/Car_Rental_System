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

public class test {
    public static void main(String[] args) {
        String file = "test.txt";
        int lineNo = 2;

        // Initialise variable
        List<String> fileLine = new ArrayList<String>();
        String line = null;
        int lineCounter = -1;

        // Initialise file path
        String path = String.format("src/main/resources/text_file/%s", file);

        try {
            // Initialise file variable
            File scanFiles = new File(path);
            Scanner s = new Scanner(scanFiles);

            // Read through every line in text file
            while(s.hasNextLine()) {
                line = s.nextLine();
                lineCounter++;

                // // Check if row number index meet file pointer
                if ((lineNo-1) == lineCounter) {  
                    continue;
                }
                System.out.println(line);
                // Check if empty line in text file
                fileLine.add(line);
            }
             s.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "New Issue at text files weh");
        }
        
        // Rewrite into file
        try {
            File delete = new File(path);
            delete.delete();
            PrintWriter pw = new PrintWriter(path);
            for (int i = 0; i < fileLine.size(); i++) {
                pw.append(fileLine.get(i));
                pw.append("\n");
            }
            
            pw.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in writing file: " + e);
        }
    }
}
