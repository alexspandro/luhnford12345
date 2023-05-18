import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



    public static boolean isValidCreditCard(String creditCardNumber) {
        // Check if the credit card number is at least 9 digits in length
        if (creditCardNumber.length() < 9) {
            return false;
        }

        // Apply the Luhn Algorithm to the credit card number
        int total = 0;
        for (int i = creditCardNumber.length() - 2; i >= 0; i -= 2) {
            int digit = creditCardNumber.charAt(i) - '0';
            int product = digit * 2;
            if (product > 9) {
                product -= 9;
            }
            total += product;
        }
        for (int i = creditCardNumber.length() - 1; i >= 0; i -= 2) {
            int digit = creditCardNumber.charAt(i) - '0';
            total += digit;
        }

        // Check if the total modulo 10 is equal to zero
        return total % 10 == 0;
    }

    public static boolean isValidPostalCode(String postalCode) {
        // Check if the postal code has at least 3 characters
        if (postalCode.length() < 3) {
            return false;
        }

        // Open the postal codes file and search for a match
        File file = new File("postal_codes.csv");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Postal codes file not found.");
            return false;
        }
        boolean matchFound = false;
        while (scanner.hasNextLine() && !matchFound) {
            String line = scanner.nextLine();
            if (line.startsWith(postalCode.substring(0, 3))) {
                matchFound = true;
            }
        }
        scanner.close();

        // If a match is found, the postal code is valid
        return matchFound;
    }
}
