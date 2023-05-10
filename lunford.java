import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class luhnford {
  public static void main(String[] args){
    Scanner daScan = new Scanner(System.in);
    String currentDir = System.getProperty("user.dir");
    System.out.println("Using cwd: " + currentDir); //gets cwd
    System.out.print("Generating new customer file...\nWhat do you want to name this file? ");
    String fileName = (daScan.nextLine() + ".csv"); 
    System.out.print("Which existing folder would you like to assign the file to? ");
    String folderName = daScan.nextLine();
    String filePath = folderName + "\\" + fileName;
    try (FileWriter FileWrite = new FileWriter(fileName)) {
      FileWrite.write("NEW CUSTOMER PROFILE\n-------------");
      FileWrite.write("First Name: " + CustFirstName + "\n");
      FileWrite.write("Last Name: " + CustLastName + "\n");
      FileWrite.write("City: " + CustCity + "\n");
      FileWrite.write("Postal Code: " + CustPCode + "\n");
      FileWrite.write("Credit Card Number: " + CustCCard + "\n");
      System.out.println("FILE SAVED IN FOLDER:", folderName);
    catch IOException e) {
      System.out.println("Error in da process cuh. No capa cuh." + e.getMessage());
    }
    }
  }
}
