**Assignment 2** :

**Problem Statement** :

**Part 1:** Write a Java program that declares two arrays named 'even' and 'odd'.
 Accept numbers from the user and move them to respective arrays depending
 on whether they are even or odd.

**Description** :

**Input:** This is a class that has a method to get input from the user. The getInput() method prompts the user to enter the number of elements and the elements themselves. It then creates an array of integers of the specified size and initializes each element with the corresponding user input. Finally, it returns the array of integers.

**getInput():** This method is used to read input from the user. It first prompts the user to enter the number of elements they want to enter. After the user enters the number, the method creates an array of integers of that size. Then, for each element in the array, it prompts the user to enter the value for that element. Once all the elements have been initialized, the method returns the array of integers.

**Part1:** This is a class that has a method to separate the even and odd numbers from the input array. The part1() method creates two arrays, one for even numbers and one for odd numbers, and separates the numbers accordingly. It then prints the original array, the even array, and the odd array. This is useful for separating even and odd numbers, which may be needed for further processing or analysis.

**part1(int data[]):** This method takes an array of integers as input and separates the even and odd numbers. It initializes two arrays, one for even numbers and one for odd numbers, and two counters for the number of even and odd numbers. It then iterates through the input array and checks if each number is even or odd. If the number is even, it increments the even counter and stores the number in the even array. If the number is odd, it increments the odd counter and stores the number in the odd array. Finally, it prints the original array, the even array, and the odd array.

**Main:** This is the main class that initializes the Input and Part1 classes and calls their methods. The main() method creates an instance of the Input class and calls its getInput() method to initialize the input array. Then, it creates an instance of the Part1 class and calls its part1() method with the input array as the argument. By doing this, it separates the even and odd numbers and prints the arrays.
