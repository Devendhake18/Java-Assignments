**Assignment 2** :

**Problem Statement** :

**Part 3** :  Write a Java program to convert an array into ArrayList and vice versa.

**Description:**

**Converter class:**

**arrayToArrayList(String[] array):** This method takes an array of strings as input and converts it into an ArrayList. It returns the converted ArrayList.

arrayListToArray(List\<String\> arrayList): This method takes an ArrayList of strings as input and converts it into an array. It returns the converted array.

Input class:

**getArrayInput(Scanner scanner):** This method takes a Scanner object as input. It prompts the user to enter the number of elements and the elements themselves. It returns an array of strings containing the user input.

**getArrayListInput(Scanner scanner):** This method takes a Scanner object as input. It prompts the user to enter the number of elements and the elements themselves. It returns an ArrayList of strings containing the user input.

Main class:

**main(String[] args):** This is the main method of the program. It creates a Scanner object to read user input. It then displays a menu to the user and prompts them to choose an option. Based on the user's choice, it calls the appropriate method from the Converter or Input class. The program continues to run until the user chooses the "Exit" option.
