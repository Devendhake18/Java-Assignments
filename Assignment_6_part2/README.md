**Assignment 6 Part 2:**

**Problem Statement:** Multiple Interface.

**Description:**

This code consists of two classes: Main and Result. The Main class contains the main method, which is the entry point of the program. It takes user input for the student's name, roll number, mark 1, and mark 2. It then creates an object of the Result class, passing the user input as arguments. The Result class extends the Student class and implements the InterfaceExam interface. It has two methods: displayExamDetails and Percent\_cal.

- **displayExamDetails**  **method:** is used to display the student's details, including their name, roll number, mark 1, mark 2, and percentage. It is called after the object of the Result class is created.
- **Percent\_cal**  **method** : calculates the percentage of the student's marks. It takes two arguments: mark1 and mark2. The percentage is calculated by adding the two marks and dividing the sum by 2.
- **Student**  **class:** is a simple class with five fields: name, rollNo, mark1, mark2. It has a constructor that takes four arguments and initializes the fields accordingly.
- **InterfaceExam:** interface contains two methods: displayExamDetails and Percent\_cal. The Result class implements this interface, meaning it must provide implementations for both methods.
- The Scanner object is created in the main method and is used to read the student's name, roll number, mark 1, and mark 2.
- **displayExamDetails**  **method:** is called after the Result object is created. It displays the student's name, roll number, mark 1, mark 2, and percentage.
- **Percent\_cal**  **method:** is called within the displayExamDetails method to calculate the percentage of the student's marks. The percentage is then displayed.
