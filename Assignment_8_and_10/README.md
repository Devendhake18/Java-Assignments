**Assignment 8 and 10**

**Problem Statement**: 
***
  The application should allow users to input employee details such as employee ID, name, age, email, and department. Design a user-friendly interface using JavaFX that allows users to input employee details. Include text fields for entering employee ID, name, age, email and department. Add buttons for creating an employee table before registering an employee, viewing the list of registered employees, update information about employee based on Employee ID.
***

This Java program is a simple JavaFX application that implements a database system to manage employee information. The program uses JDBC to connect with a MySQL database.

***
There are several classes in this program, each with its own responsibility. Here's a brief description of each class and its methods:
i)` DBUtils:` This class contains utility methods for interacting with the database.  
        enter_to_database(Label notif, String employee_Id, String name, String email, String department, String age, ActionEvent event): This method inserts a new employee record into the database. It first checks if the employee ID already exists in the database. If it does, it displays a notification message. Otherwise, it inserts the new record.  
        details_changeScene(ActionEvent event, String fxmlFile): This method changes the current scene to the one specified by the fxmlFile parameter.  
        update(ActionEvent event ,String id, String name, String age, String dept, String email): This method updates an existing employee record in the database.  
ii) `LogInController:` This class is the controller for the login screen.  
        initialize(URL url, ResourceBundle resourceBundle): This method initializes the login screen. It sets up the action listener for the register button, which calls the enter_to_database method in the DBUtils class.  
iii) `MainApplication:` This class is the entry point for the JavaFX application.  
        start(Stage stage): This method sets up the primary stage for the application and loads the login screen.  
        main(String[] args): This method launches the JavaFX application.  
iV) `ViewDetailController:` This class is the controller for the screen that displays the list of employees and allows the user to update an existing employee record.  
        initialize(URL url, ResourceBundle resourceBundle): This method initializes the screen. It loads the employee data from the database and displays it in a table. It also sets up the action listener for the update button, which calls the update method in the DBUtils class.  
        rowClicked(MouseEvent event): This method is called when the user clicks on a row in the table. It displays the details of the selected employee in text fields.  
v) `ViewTable:` This class represents a single row in the employee table.  
        getEmp_id(), getName(), getEmail(), getDept(), getAge(): These methods return the corresponding column value for a row.  
***  
Overall, this program provides a simple interface for managing employee information in a database. However, there are some areas that can be improved, such as error handling and input validation.  
