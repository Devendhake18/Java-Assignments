**Assignment 5 Part 1:**

**Problem Statement:**

Implement the generic Shapes class as an interface s so that we can implement concrete classes like circle, triangle, rectangle class from it.

**Description:**

Implemented three different shapes: Circle, Triangle, and Rectangle. Each shape implements the Shape interface, which contains two methods: area() and perimeter(). These methods are used to calculate the area and perimeter of each shape.

1. ***Circle***:
    - The Circle class has a constructor that takes the radius as a parameter.
    - The area() method calculates the area of the circle using the formula: area = π \* radius \* radius.
    - The perimeter() method calculates the perimeter of the circle using the formula: perimeter = 2 \* π \* radius.
2. ***Triangle***:
    - The Triangle class has a constructor that takes the base, height, side1, and side2 as parameters.
    - The area() method calculates the area of the triangle using the formula: area = 0.5 \* base \* height.
    - The perimeter() method calculates the perimeter of the triangle using the formula: perimeter = base + side1 + side2.
3. ***Rectangle***:
    - The Rectangle class has a constructor that takes the length and width as parameters.
    - The area() method calculates the area of the rectangle using the formula: area = length \* width.
    - The perimeter() method calculates the perimeter of the rectangle using the formula: perimeter = 2 \* (length + width).
4. ***Main***:
    - The Main class contains the main() method, which is the entry point of the program.
    - The main() method prompts the user to select a shape (Circle, Triangle, or Rectangle) and then prompts the user to enter the necessary parameters for that shape.
    - The main() method then creates an instance of the selected shape and calls the area() and perimeter() methods to calculate and display the area and perimeter of the shape.

The main() method uses a switch statement to determine which shape the user has selected. It then prompts the user to enter the necessary parameters for that shape and creates an instance of the selected shape. Finally, it calls the area() and perimeter() methods to calculate and display the area and perimeter of the shape.

The Scanner class is used to read input from the user. The nextInt() method reads the next integer from the user, and the nextDouble() method reads the next double from the user. The close() method is used to close the scanner when the program is finished.
