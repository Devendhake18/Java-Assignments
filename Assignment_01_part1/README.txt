Assignment 1

Problem Statement: 
Part1: Implement a menu-driven Java program (like fib or factorial) to implement these input methods in java (command line args,
Scanner, BufferedReader, DataInputStream, Console)

Description:

Assignment1Part1 class: This class contains the main logic of the program. It has 4 methods (getDataBufferedReader, getDataScanner, getDataDataInputStream, and getDataConsole) to get the number from the user using different input methods.

getDataBufferedReader method: This method takes the number from the user using BufferedReader. It then calculates the factorial of the number using the Factorial class and displays the result.

getDataScanner method: This method takes the number from the user using Scanner. It then calculates the factorial of the number using the Factorial class and displays the result.

getDataDataInputStream method: This method takes the number from the user using DataInputStream. It then calculates the factorial of the number using the Factorial class and displays the result.

getDataConsole method: This method takes the number from the user using Console. It then calculates the factorial of the number using the Factorial class and displays the result.

main method: This is the main method of the program. It contains a do-while loop that keeps running until the user chooses to exit. Inside the loop, it displays the menu to the user and takes the user's choice as input. Based on the user's choice, it calls the appropriate getData* method to get the number from the user and calculate its factorial.

Factorial class: This class contains the calculateFactorial method that calculates the factorial of a given number. It takes an integer as input and returns the factorial as a long integer.

calculateFactorial method: This method calculates the factorial of a given number. It takes an integer as input and returns the factorial as a long integer. It uses a for loop to iterate from 1 to the number and multiplies the current factorial value with each integer in the range. The final factorial value is returned as the result.
