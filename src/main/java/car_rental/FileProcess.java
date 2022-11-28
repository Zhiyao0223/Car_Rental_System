package car_rental;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public interface FileProcess {
    // Read file
    default List<String> readFile(String file) {
        // Initialise variable
        List<String> fileLine = new ArrayList<String>();
        String line = null;

        // Initialise file path
        String path = String.format("src/main/resources/text_file/%s", file);

        // Read file line by line
        try {
            File readFiles = new File(path);
            Scanner s = new Scanner(readFiles);

            while (s.hasNextLine()) {
                line = s.nextLine();

                // Check if empty line in text file
                if (!line.isEmpty()) fileLine.add(line);
            }
            s.close();
        }
        catch(Exception e) {
            System.out.println("Error has occured. Error code:" + e); 
        }

        return fileLine;
    }

    // Rewrite file
    default void writeFile(String[] lineData, String file) {
        // Initialise file path
        String path = String.format("src/main/resources/text_file/%s", file);

        try {
            File delete = new File(path);
            delete.delete();

            PrintWriter pw = new PrintWriter(path);
            for (String lines :lineData) {
                pw.append(lines);
                pw.append("\n");
            }
            pw.close();

            JOptionPane.showMessageDialog(null, "Update Success!");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    // Append data to file
    default void appendFile(String newLine, String file) {
        // Initialise file path
        String path = String.format("src/main/resources/text_file/%s", file);

        // Write data into text file
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File(path), true));
            pw.append(newLine);
            pw.append("\n");

            pw.close();
            JOptionPane.showMessageDialog(null, "Add success!");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    // Delete data from file
    default void deleteFile(int lineNo, String file) {
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
