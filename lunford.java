import java.util.Scanner;

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
        return total % 10 == 0;
    }
}
