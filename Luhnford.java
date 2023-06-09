import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Luhnford {
  public static void main(String[] args){
    Scanner daScan = new Scanner(System.in);
    System.out.println("Using cwd: " + System.getProperty("user.dir")); //gets cwd
    System.out.print("Generating new customer file...\nWhat do you want to name this file? ");
    String fileName = daScan.nextLine() + ".csv"; 
    System.out.print("Which existing folder would you like to assign the file to? ");
    String folderName = daScan.nextLine();
    String filePath = folderName + "\\" + fileName;

    // Get input values for customer information
    System.out.print("Enter First Name: ");
    String CustFirstName = daScan.nextLine();
    System.out.print("Enter Last Name: ");
    String CustLastName = daScan.nextLine();
    System.out.print("Enter City: ");
    String CustCity = daScan.nextLine();
    System.out.print("Enter Postal Code: ");
    String CustPCode = daScan.nextLine();
    System.out.print("Enter Credit Card Number: ");
    String CustCCard = daScan.nextLine();
    
// allows inputs to be used in the file
    createCustomerDataFile(filePath, custFirstName, custLastName, custCity, custPcode, custCCard);
  }

  public static void CustomerDataFile(filePath, custFirstName, custLastName, custCity, custPcode, custCCard)){
    try (FileWriter FileWrite = new FileWriter(filePath)) {
      FileWrite.write("NEW CUSTOMER PROFILE\n-------------");
      FileWrite.write("First Name: " + CustFirstName + "\n");
      FileWrite.write("Last Name: " + CustLastName + "\n");
      FileWrite.write("City: " + CustCity + "\n");
      FileWrite.write("Postal Code: " + CustPCode + "\n");
      FileWrite.write("Credit Card Number: " + CustCCard + "\n");
      System.out.println("FILE SAVED IN FOLDER: " + folderName);
    } catch (IOException e) {
      System.out.println("Error in the process: " + e.getMessage());
