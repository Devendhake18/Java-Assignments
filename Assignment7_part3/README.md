**Assignment 7 Part 3:**

**Title:** Define an exception class called “NOMATCHEXCP” that is thrown when the string from the keyboard is not equal to “India”. Write a Demo program using try-catch block that shows the use of this user-defined exception. Class NOMATCHEXCP should have a parameterized constructor and the exception message generated should show the line number and the erroneous String that was inputted by the user.

1. `public class Demo:`

- This class contains the main method, which serves as the entry point of the program.
- It reads input from the user using BufferedReader.
- It checks if the input string equals "India" and throws a NoMatchException if it doesn't.
- It catches NoMatchException and IOException and prints appropriate error messages.

2. `public static void main(String\[\] args):`

- The main method initializes a BufferedReader to read input from the console.
- It prompts the user to enter a string.
- It reads the input string using reader.readLine().
- If the input string is not equal to "India", it throws a NoMatchException.
- It catches NoMatchException and IOException and prints error messages accordingly.

3. `class NoMatchException extends Exception:`

- This class defines a custom exception named NoMatchException, which extends the built-in Exception class.
- It contains private attributes lineNumber and erroneousString to store the line number and the erroneous string.
- The constructor NoMatchException(int lineNumber, String erroneousString) initializes the exception with the line number and the erroneous string.
- The getMessage() method overrides the getMessage() method of the Exception class to provide a custom error message, indicating the line number and the expected string versus the erroneous string.
