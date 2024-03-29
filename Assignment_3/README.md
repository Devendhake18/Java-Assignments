**Assignment 3:**

**Problem Statement:**
Write a menu-driven Java Program to study the concepts of classes, and array of objects/arraylist, instance members, and constructors in Java. Assignment description: Create a Student class describing attributes of a student like prn, name, DoB, marks etc. Create an array of objects of Student class and perform operations like Add students, Display, Search. (by prn, by name, by position), Update/Edit and Delete.

**Description:**

**Class Student:**

•	Constructor: Student(int prn, String name, String dob, float marks) - Initializes a student object.

•	Getters: (getPrn, getName, getDob, getMarks) - Access the value of student attributes.

•	Setters: (setPrn, setName, setDob, setMarks) - Modify the value of student attributes.

•	displayDetails() - Prints formatted details of a student object.

**Class StudentDetails:**

•	Constructor: StudentDetails() - Initializes the studentList.

•	addStudent() - Prompts the user for input and adds a new Student object to studentList.

•	displayStudents() - Iterates through studentList and displays details of each student.

•	searchByPrn(int prn) - Finds and displays a student based on their PRN.

•	searchByName(String name) - Finds and displays students matching a given name (case-insensitive).

•	searchByPosition(int position) - Retrieves and displays a student at a specific position in studentList.

•	updateStudent(int prn) - Finds a student by PRN and allows the user to update their name, date of birth, and marks.

•	deleteStudent(int prn) - Deletes a student from studentList based on their PRN.

**Class StudentDemo :**

•	Creates a StudentDetails object.

•	Provides a menu-driven interface for the user to interact with the student management system.


