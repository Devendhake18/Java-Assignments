**Assignment 7 Part 2:**

**Title:** Write a Java Program to find the factorial of ‘n’ integers (as command line arguments CLA). Write your own exception “FactorialException” to validate integer values to be in certain range. Sample call: java ExceptionDemo 8 –  
6 14 abcd 5
<br/>1) Static main method invokes another method “factorial()”  
<br/>2) CLA which are strings but interpreted as integer values.  
<br/>3) The user-defined exception class
<br/>FactorialException  should have proper constructors / overridden toString() method to display exception message along with the  
wrong input number that had generated the exception.  
<br/>NumberFormatException (ill-formed CLA)  
<br/>And  
<br/>Your Exception class.
FactorialException  ( n&lt;0 and n&gt;15)

1. `class FactorialException extends Exception:`
    - This class defines a custom exception named FactorialException, which extends the built-in Exception class.
    - It contains a private attribute number to store the number causing the exception.
    - The constructor FactorialException(int number) initializes the exception with the out-of-range number.
    - The toString() method overrides the toString() method of the Exception class to provide a custom string representation of the exception, indicating that the number is out of range.
2. `public class ExceptionDemo:`
    - This class contains the main method and the factorial method.
3. `public static void main(String\[\] args):`
    - The main method takes an array of strings as input arguments.
    - It iterates through each argument and tries to parse it into an integer.
    - If parsing succeeds, it checks whether the number is within the range \[0, 15\]. If not, it throws a FactorialException.
    - It then calculates the factorial of the number using the factorial method and prints the result.
    - It catches NumberFormatException if the argument cannot be parsed into an integer and prints an appropriate error message.
    - It catches FactorialException if the number is out of range and prints the custom exception message.
4. `public static int factorial(int n):`
    - This method calculates the factorial of a given integer n.
    - It is a recursive method that calls itself with n - 1 until n becomes 0.
    - The base case is when n is 0, in which case it returns 1.
    - Otherwise, it recursively calculates n \* factorial(n - 1) and returns the result.
