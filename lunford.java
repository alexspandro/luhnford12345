import java.util.Scanner

public class luhnford {
  public static void main(string[] args){
  Scanner daScan = new Scanner(System.in);

  folder = os.getcwd()
  fileName = input("Generating new customer file...\nWhat do you want to name this file? ")
  folderName = input("Which existing folder would you like to assign the file to? ")
  fileCreateNew = folder + folderName + "\\" + fileName + ".txt"
  file = ("")
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
        
