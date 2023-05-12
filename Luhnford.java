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
        for (int z = 0 ; z < records; z++) {
            if (records[z] == "1"){
                oneCount = oneCount + 1;
            }
            else if (records[z] == "2"){
                twoCount = twoCount + 1;
            }
            else if (records[z] == "3"){
                threeCount = threeCount + 1;
            }
            else if (records[z] == "4"){
                fourCount = fourCount + 1;
            }
            else if (records[z] == "5"){
                fiveCount = fiveCount + 1;
            }
            else if (records[z] == "6"){
                sixCount = sixCount + 1;
            }
            else if (records[z] == "7"){
                sevenCount = sevenCount + 1;
            }
            else if (records[z] == "8"){
                eightCount = eightCount + 1;
            }
            else if (records[z] == "9"){
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
