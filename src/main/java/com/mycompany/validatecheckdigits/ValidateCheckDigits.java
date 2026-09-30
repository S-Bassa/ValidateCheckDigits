package com.mycompany.validatecheckdigits;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Validates account numbers read from a text file.
 *
 * @author Siraaj Bassa
 */
public class ValidateCheckDigits {

    public static void main(String[] args) {
        System.out.println("Account Number Validation");

        File inputFile = new File("accounts.txt");
        File outputFile = new File("valid_accounts.txt");

        try (Scanner input = new Scanner(inputFile);
                PrintWriter output = new PrintWriter(outputFile)) {

            while (input.hasNextLine()) {
                String accountNumber = input.nextLine();

                if (isValid(accountNumber)) {
                    System.out.println(accountNumber + " - Valid");
                    output.println(accountNumber);
                } else {
                    System.out.println(accountNumber + " - Invalid");
                }
            }

            System.out.println("Valid accounts saved to valid_accounts.txt.");

        } catch (FileNotFoundException e) {
            System.out.println("Could not open the input or output file.");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Checks the account's format and final check digit.
     *
     * @param accountNumber account number to validate
     * @return true if the account number is valid
     */
    public static boolean isValid(String accountNumber) {
        if (!accountNumber.matches("[0-9]{6}")) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int digit = accountNumber.charAt(i) - '0';
            sum += digit;
        }

        int lastDigit = accountNumber.charAt(5) - '0';

        return sum % 10 == lastDigit;
    }
}