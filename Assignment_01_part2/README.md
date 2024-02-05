**Assignment 1 Part 2:**

**Problem Statement:** 
Part2: Implement a simple menu driven calculator in java to implement add, sub, multiplication, div, sqrt, power, mean, variance. Implement a separate Calculator class to include all related function inside that class. (Mean calculation: program reads numbers from the keyboard, summing them in the process until the user enters the string "end". It then stops input & displays the avg. of numbers)

 
 **Calculator Class:**

**addition(double n1, double n2):** This method takes two double values as input and returns their sum as a double value.

**subtract(double n1, double n2):** This method takes two double values as input and returns their difference as a double value.

**multiply(double n1, double n2):** This method takes two double values as input and returns their product as a double value. Note: There is a mistake in the method name and implementation, it should return n1 \* n2 instead of n1 + n2.

**divide(double n1, double n2):** This method takes two double values as input and returns their quotient as a double value. If the second value is zero, it prints an error message and returns Double.NaN.

**sqrt(double n1):** This method takes a double value as input and returns its square root as a double value.

**power(double base, double exponent):** This method takes two double values as input and returns the first value raised to the power of the second value as a double value**.**

**mean(double[] nums):** This method takes an array of double values as input, calculates their mean (average), and returns the result as a double value.

**variance(double[] nums):** This method takes an array of double values as input, calculates their variance (a measure of how spread out the values are), and returns the result as a double value.

**Input class:**

**inputChoice():** This method prompts the user to enter a choice (integer) and returns it as an integer value.

**inputNumber():** This method prompts the user to enter a number (double) and returns it as a double value.

**inputNumbers():** This method prompts the user to enter two numbers (double) and returns them as an array of two double values.

**inputString():** This method prompts the user to enter a series of numbers (double) one by one, until the user types "end". It returns the series as an array of double values.

**closeScanner():** This method closes the Scanner object when it's no longer needed.

**OperationDemo class:**

**main(String[] args):** This is the main method of the program. It creates objects for the Calculator and Input classes, and prompts the user to choose an operation (addition, subtraction, etc.). Based on the user's choice, it performs the corresponding calculation using the Calculator object and prints the result. If the user chooses to calculate the mean or variance, it uses the Input object to get the array of numbers and calculates the mean or variance using the Calculator object. The program runs in a loop until the user chooses to exit.
