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
    default List<String[]> readFile(String file) {
        // Initialise variable
        List<String[]> fileLine = new ArrayList<String[]>();

        String line = null;
        int arrayMaxSize = -1;
        

        // Initialise file path
        String path = String.format("src/main/resources/text_file/%s", file);

        // Count total line in file
        try {
            File scanFiles = new File(path);
            Scanner scan = new Scanner(scanFiles);
            
            // Loop until border line to check data range
            while(scan.hasNextLine()) {
                line = scan.nextLine();
                arrayMaxSize += 1;
                
                // Check if border line
                if (line.equals("#-------------------------")) break;   
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
//        System.out.println("Max size " + arrayMaxSize);
        
        // Initialise array to store car data
        String[] tmpArray = new String[arrayMaxSize];
        
        // Read file line by line
        try {
            File readFiles = new File(path);
            Scanner s = new Scanner(readFiles);
            
            int lineCounter = -1;
            
            while (s.hasNextLine()) {
                line = s.nextLine();
                lineCounter += 1;

                // Check if empty line in text file
                if (!line.isEmpty() && lineCounter == arrayMaxSize) {
                    
                    fileLine.add(tmpArray);
                    
                    lineCounter = -1;
                    tmpArray = new String[arrayMaxSize];
                    continue;
                }
                
                // Check if border line
                if (line.equals("#-------------------------")) continue;
                
                tmpArray[lineCounter] = line;
//                System.out.println(tmpArray[lineCounter]);
            }
            s.close();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return fileLine;
    }

    
    // Add data into file
    default void appendFile(String[] lineData, String file) {
        // Add prefix to line to append into file
        String[] newLineArray = addPrefix(lineData, file);
        
        // Initialise file path
        String path = String.format("src/main/resources/text_file/%s", file);

        try {
//            File delete = new File(path);
//            delete.delete();

            PrintWriter pw = new PrintWriter(new FileOutputStream(path, true));
            for (String lines :newLineArray) {
                pw.append(lines);
                pw.append("\n");
            }
            pw.append("#-------------------------\n");
            pw.close();

            JOptionPane.showMessageDialog(null, "Update Success!");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    
    // Edit data in file
    default void editFile(String[] newLine, String file) {
        // Declare empty list to store lines in file
        List<String> fileLines = new ArrayList<String>();
        
        // Initialise file path
        String path = String.format("src/main/resources/text_file/%s", file);
        
        // Add prefix
        String[] newData = addPrefix(newLine, file);

        try {
            File files = new File(path);
            Scanner s = new Scanner(files);
            
            String tmpLine = null;
            while (s.hasNextLine()) {
                tmpLine = s.nextLine();
                
                // Check if border line
                if (tmpLine.equals("#-------------------------")) {}
                // Check for ID row as it cannot be modified
                else if (tmpLine.split(" - ")[1].equals(newLine[0])) {
                    for (String tmp : newData) {
                        System.out.println(tmp);
                        fileLines.add(tmp);
                        tmpLine = s.nextLine();
                    }
                    fileLines.add(tmpLine);
                    continue;
                    
                }
                fileLines.add(tmpLine);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Errorrr " + e);
        }
        
        
        // Write data into text file
        try {
            // Declare PrintWriter for editing
            PrintWriter pw = new PrintWriter(path);
            
            for (String tmpLines : fileLines) {
                System.out.println(tmpLines);
                pw.append(tmpLines);
                pw.append("\n"); 
            }

            pw.close();
            JOptionPane.showMessageDialog(null, "Edit success!");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    
    // Delete data from file
    default void deleteFile(String idNo, int dataLength, String file) {
        // Initialise variable
        List<String> fileLine = new ArrayList<String>();
        String line = null;

        // Initialise file path
        String path = String.format("src/main/resources/text_file/%s", file);

        try {
            // Initialise file variable
            File scanFiles = new File(path);
            Scanner s = new Scanner(scanFiles);

            // Read through every line in text file
            while(s.hasNextLine()) {
                line = s.nextLine();

                // Check if border line
                if (line.equals("#-------------------------")) {}
                // // Check if row number index meet file pointer
                else if (line.split(" - ")[1].equals(idNo)) {
                    for (int  i = 0; i < dataLength; i++) {
                        s.nextLine();
                    }
                    continue;
                }

                System.out.println(line);
                // Check if empty line in text file
                fileLine.add(line);
            }
             s.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "New Issue at text files weh " + e);
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
            JOptionPane.showMessageDialog(null, "Delete success");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in writing file: " + e);
        }
    }

    
    // Add prefix into raw data to add into text file
    default String[] addPrefix(String[] oldData, String fileNames) {
        String[] newLineArray = new String[oldData.length];
        if (fileNames.equals("admin.txt")) {
            newLineArray[0] = "ID - " + oldData[0];
            newLineArray[1] = "Username - " + oldData[1];
            newLineArray[2] = "Name - " + oldData[2];
            newLineArray[3] = "Password - " + oldData[3];
            
        }
        else if (fileNames.equals("booking.txt")) {
            newLineArray[0] = "Rent ID - " + oldData[0];
            newLineArray[1] = "User ID - " + oldData[1];
            newLineArray[2] = "Car ID - " + oldData[2];
            newLineArray[3] = "Start Date - " + oldData[3];
            newLineArray[4] = "End Date - " + oldData[4];
            newLineArray[5] = "Total Cost - RM" + oldData[5];
        }
        else if (fileNames.equals("cars.txt")) {
            newLineArray[0] = "Car ID - " + oldData[0];
            newLineArray[1] = "Car Brand - " + oldData[1];
            newLineArray[2] = "Car Model - " + oldData[2];
            newLineArray[3] = "Year Made - " + oldData[3];
            newLineArray[4] = "Gear - " + oldData[4];
            newLineArray[5] = "Cost per Hour - RM" + oldData[5];
            newLineArray[6] = "Cost per Day - RM" + oldData[6]; 
            newLineArray[7] = "Cost per Week - RM" + oldData[7]; 
            newLineArray[8] = "Mileage - RM" + oldData[8]; 
            newLineArray[9] = "Location - RM" + oldData[9]; 
            newLineArray[10] = "Available Status - RM" + oldData[10]; 
        }
        else if (fileNames.equals("payment.txt")) {
            newLineArray[0] = "Payment ID - " + oldData[0];
            newLineArray[1] = "Rent ID - " + oldData[1];
            newLineArray[2] = "Payment Method - " + oldData[2];
            newLineArray[3] = "Date - " + oldData[3];
            newLineArray[4] = "Time - " + oldData[4];   
        }
        else if (fileNames.equals("user.txt")) {
            newLineArray[0] = "User ID - " + oldData[0];
            newLineArray[1] = "Username - " + oldData[1];
            newLineArray[2] = "Password - " + oldData[2];
            newLineArray[3] = "Phone Number - " + oldData[3];
            newLineArray[4] = "Email - " + oldData[4]; 
        }
        else if (fileNames.equals("test.txt")) {
            newLineArray[0] = "ID - " + oldData[0];
            newLineArray[1] = "Username - " + oldData[1];
            newLineArray[2] = "Name - " + oldData[2];
            newLineArray[3] = "Password - " + oldData[3];
        }
        else {
            JOptionPane.showMessageDialog(null, "Error in locating file.");
            return null;
        }
        return newLineArray;
    }
}
