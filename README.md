# Account Number Validation

## Description
This Java program reads account numbers from accounts.txt and displays
whether each number is valid or invalid. Only valid accounts are written
to valid_accounts.txt, one per line.

## Validation rule
An account number must contain exactly six digits. The program adds the
first five digits and calculates the remainder using % 10. This remainder
must equal the sixth digit.

Example: 223355 is valid because 2 + 2 + 3 + 3 + 5 = 15,
and 15 % 10 = 5.

Account numbers are stored as strings to preserve leading zeros.

## How to run
1. Open the Maven project in NetBeans.
2. Ensure accounts.txt is in the project folder beside pom.xml.
3. Run ValidateCheckDigits.java.
4. View the results in the Output window.
5. Open valid_accounts.txt to view the valid accounts.

Each run replaces the previous output file.

## Testing
The supplied input contains 18 account numbers.

Expected results:
- 10 valid accounts.
- 8 invalid accounts.
- Only the 10 valid accounts appear in valid_accounts.txt.

Additional checks:
- 223355: valid, matching the assignment example.
- 123456: invalid check digit.
- 000011: valid, with leading zeros preserved.
- 246800: valid, with a remainder of zero.
- 12345: invalid because it has fewer than six digits.
- 12A455: invalid because it contains a letter.

## AI assistance
ChatGPT assisted with code logic structure and documentation and explaining
the file handling and check-digit calculation.
