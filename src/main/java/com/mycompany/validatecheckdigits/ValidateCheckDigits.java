package com.mycompany.validatecheckdigits;

import java.io.File;
import java.io.FileNotFoundException;
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

        try (Scanner input = new Scanner(inputFile)) {
            while (input.hasNextLine()) {
                String accountNumber = input.nextLine();
                System.out.println(accountNumber);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find accounts.txt.");
        }
    }
}