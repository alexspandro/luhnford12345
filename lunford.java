import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
class Luhnford{
     public static void main(String[] args){
        Scanner daScan = new Scanner(System.in);
        System.out.println("Using cwd: " + System.getProperty("user.dir")); //gets cwd
        System.out.print("Generating new customer file...\nWhat do you want to name this file? ");
        String fileName = daScan.nextLine() + ".csv"; 
        System.out.print("Which existing folder would you like to assign the file to? ");
        String folderName = daScan.nextLine();
        String filePath = folderName + "\\" + fileName;

     public class CreditCardValidationSystem {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             System.out.print("Enter a credit card number: ");
             String creditCardNumber = scanner.nextLine();
             boolean isValid = isValidCreditCard(creditCardNumber);
             if (isValid) {
                 System.out.println("The credit card number is valid.");
             } else {
                 System.out.println("The credit card number is invalid.");
             }
             scanner.close();
         }

         public static boolean isValidCreditCard(String creditCardNumber) {
             // Check if the credit card number is at least 9 digits in length
             if (creditCardNumber.length() < 9) {
                 return false;
             }

             // Apply the Luhn Algorithm to the credit card number
             int total = 0;
             for (int i = creditCardNumber.length() - 2; i >= 0; i -= 2) {
                 int digit = Integer.parseInt(String.valueOf(creditCardNumber.charAt(i)));
                 int product = digit * 2;
                 if (product > 9) {
                     product -= 9;
                 }
                 total += product;
             }
             for (int i = creditCardNumber.length() - 1; i >= 0; i -= 2) {
                 int digit = Integer.parseInt(String.valueOf(creditCardNumber.charAt(i)));
                 total += digit;
             }

             // Check if the total modulo 10 is equal to zero
             return total % 10 .equals 0;
         }
     }

        /* Get input values for customer information
        * System.out.print("Enter First Name: ");
        * String CustFirstName = daScan.nextLine();
        * System.out.print("Enter Last Name: ");
        * String CustLastName = daScan.nextLine();
        * System.out.print("Enter City: ");
        * String CustCity = daScan.nextLine();
        * System.out.print("Enter Postal Code: ");
        * String CustPCode = daScan.nextLine();
        * System.out.print("Enter Credit Card Number: ");
        * String CustCCard = daScan.nextLine();
        */

        createCustomerDataFile(filePath, custFirstName, custLastName, custCity, custPcode, custCCard);

      public static void createCustomerDataFile(String filePath, custFirstName, custLastName, custCity, custPcode, custCCard)){
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
        }
      }
    }
    public static void benford(){
        File file = new File("sales.csv");
        String path = file.getAbsolutePath();
        Scanner sc = new Scanner(new File(path + file));
        ArrayList<String[]> records = new ArrayList<String[]>();
        String[] record = new String[1621];
        while (sc.hasNext()){
            record = sc.nextLine().split(",");
            records.add(record);
        }
        records.remove(0);
        int i = 0;
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        int fiveCount = 0;
        int sixCount = 0;
        int sevenCount = 0;
        int eightCount = 0;
        int nineCount = 0;
        for (int z = 0 ; z < records.size; z++) {
            if (records[z] .equals "1"){
                oneCount = oneCount + 1;
            }
            else if (records[z].equals "2"){
                twoCount = twoCount + 1;
            }
            else if (records[z].equals "3"){
                threeCount = threeCount + 1;
            }
            else if (records[z].equals "4"){
                fourCount = fourCount + 1;
            }
            else if (records[z].equals "5"){
                fiveCount = fiveCount + 1;
            }
            else if (records[z].equals "6"){
                sixCount = sixCount + 1;
            }
            else if (records[z].equals "7"){
                sevenCount = sevenCount + 1;
            }
            else if (records[z].equals "8"){
                eightCount = eightCount + 1;
            }
            else if (records[z].equals "9"){
                nineCount = nineCount + 1;
            }
            else{
                System.out.println("No");
            }
        }
        int totalCount = oneCount + twoCount + threeCount + fourCount + fiveCount + sixCount + sevenCount + eightCount + nineCount;
        System.out.println(oneCount);
        System.out.println(twoCount);
        System.out.println(threeCount);
        System.out.println(fourCount);
        System.out.println(fiveCount);
        System.out.println(sixCount);
        System.out.println(sevenCount);
        System.out.println(eightCount);
        System.out.println(nineCount);
        System.out.println(totalCount);
        int onePrcnt = (oneCount/totalCount)*100;
        int twoPrcnt = (twoCount/totalCount)*100;
        int threePrcnt = (threeCount/totalCount)*100;
        int fourPrcnt = (fourCount/totalCount)*100;
        int fivePrcnt = (fiveCount/totalCount)*100;
        int sixPrcnt = (sixCount/totalCount)*100;
        int sevenPrcnt = (sevenCount/totalCount)*100;
        int eightPrcnt = (eightCount/totalCount)*100;
        int ninePrcnt = (nineCount/totalCount)*100;
        sc.close();
    }
    public static void printMenu(){
        System.out.println("Customer and Sales System");
        System.out.println("1. Enter Customer Information");
        System.out.println("2. Generate Customer Data File");
        System.out.println("3. Report on Total Sales");
    }
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int userInput = 0;
        int salesReportOption = 3;
        int exitCondition = 9;
        while (userInput != exitCondition){
            printMenu();
            userInput = reader.nextInt();
            if (userInput .equals salesReportOption){
                benford();
            }
            else{
                if (userInput != exitCondition){
                    System.out.println("Please enter a valid number from 1-9");
                }
            }
        }
        reader.close();
    }
}
