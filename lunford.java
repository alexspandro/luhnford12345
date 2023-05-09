import java.util.Scanner

public class luhnford {
  public static void main(String[] args){
  Scanner daScan = new Scanner(System.in);
  String currentDir = System.getProperty("user.dir");
  System.out.println("Using cwd: " + currentDir); //gets cwd
  System.out.print("Generating new customer file...\nWhat do you want to name this file? ");
  String fileName = daScan.nextLine(); 
  System.out.print("Which existing folder would you like to assign the file to? ");
  String folderName = daScan.nextLine();
  String filePath = folderName + "\\" + fileName + ".txt";
  try:
    file = open(fileName, "w")
    file.writelines("NEW CUSTOMER PROFILE\n-------------")
    file.writelines("First Name: " + CustFirstName + "\n")
    file.writelines("Last Name: " + CustLastName + "\n")
    file.writelines("City: " + CustCity + "\n")
    file.writelines("Postal Code: " + CustPCode + "\n")
    file.writelines("Credit Card Number: " + CustCCard + "\n")
    print("FILE SAVED IN FOLDER:", folderName)
    finally:
      if file:
      file.close()
        
