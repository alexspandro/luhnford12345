import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class Luhnford{
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
            if (userInput == salesReportOption){
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
