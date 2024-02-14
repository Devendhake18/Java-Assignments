**Assignment 6 Part 1:**

**Problem Statement:** Implementation of Fixed and Growable Stack using Interface\_STK

**Descrption:**

In this code, we have two different implementations of a stack data structure: Fixed\_STK and Growable\_STK. Both implementations follow the Interface\_STK interface, which defines the methods that a stack should have: push, pop, displayStack, isOverflow, and isUnderflow.

The Fixed\_STK implementation uses a fixed-size array to store the elements of the stack. It has the following methods:

1. **push:** This method takes an integer as an argument and adds it to the top of the stack. If the stack is full (i.e., the top index is equal to the last index of the array), it throws an error message and terminates the program.
2. **pop:** This method removes the element at the top of the stack and returns it. If the stack is empty (i.e., the top index is -1), it throws an error message and terminates the program.
3. **displayStack:** This method prints the elements of the stack. If the stack is empty, it prints a message and terminates the program.
4. **isOverflow:** This method checks if the stack is full. It returns true if the top index is equal to the last index of the array, and false otherwise.
5. **isUnderflow:** This method checks if the stack is empty. It returns true if the top index is -1, and false otherwise.

The Growable\_STK implementation uses an ArrayList to store the elements of the stack. It has the same methods as the Fixed\_STK implementation, with the following differences:

1. **push:** This method takes an integer as an argument and adds it to the top of the stack. If the stack is full (i.e., the ArrayList is at its maximum capacity), it automatically increases its capacity.
2. **pop:** This method removes the element at the top of the stack and returns it. If the stack is empty, it throws an error message and terminates the program.
3. **displayStack:** This method prints the elements of the stack. If the stack is empty, it prints a message and terminates the program.
4. **isOverflow:** This method always returns false, because an ArrayList can grow indefinitely.
5. **isUnderflow:** This method checks if the stack is empty. It returns true if the ArrayList is empty, and false otherwise.

In the main method of the StackDemo class, we create instances of both implementations and use them to demonstrate their functionality. We push some elements onto the stacks, display the elements, pop an element, and then display the remaining elements.

The InterfaceDemo class demonstrates the use of an interface. It defines an interface called Interface1 with two methods: method1 and method2. The InterfaceImplementation class implements this interface by providing implementations for both methods. In the main method of the InterfaceDemo class, we create an instance of the InterfaceImplementation class and call both methods.
