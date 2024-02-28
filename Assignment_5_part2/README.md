**Assignment 5 Part 2:**

**Problem Statement:**
Implement Employee as an abstract and derive 2 classes such as NormalEmployee and BonusEmployee from it and perform the salary calculations based on the formulas  as per the excel attachment


**Description:**

- ***Employee***:
   This is an abstract class containing details of an employee such as name, designation, department, bank name, date of joining, employee ID, total working days, loss of pay days, leaves taken, account number, UAN, PF number, ESINo, gross wage, basic wage, hra, conveyance allowance, medical allowance, other allowance, EPF, health insurance amount, PT, loan recovery, total deductions, net salary, total earnings, bonus, and bonus salary. It also contains getter and setter methods for all these fields.
- ***NormalEmployee***:
   This class extends the Employee class and contains the method theMonthly() to calculate the net salary of a normal employee. It calculates basic wage, hra, conveyance allowance, medical allowance, other allowance, total earnings, EPF, health insurance amount, PT, loan recovery, and total deductions based on the gross wage, total working days, loss of pay days, and other details provided.
- ***BonusEmployee***: This class also extends the Employee class and contains the method theMonthly() to calculate the net salary of a bonus employee. It calculates basic wage, hra, conveyance allowance, medical allowance, other allowance, total earnings, EPF, health insurance amount, PT, loan recovery, and total deductions based on the gross wage, total working days, loss of pay days, and other details provided. Additionally, it also calculates the bonus salary.
- ***Main***:
   This class contains the main method and takes inputs for gross wage, total working days, loss of pay days, and bonus (if any) from the user. It creates an object of NormalEmployee or BonusEmployee based on the bonus input and calls the theMonthly() method to calculate the net salary. It then prints the payslip with all the details using the printPaySlip() method.
- ***printPaySlip()***: This method prints the payslip for the employee with all the details such as employee name, ID, designation, department, date of joining, bank name, account number, gross wage, total working days, loss of pay days, allowances, deductions, and net salary. It also checks and prints whether the employee is a normal or bonus employee.
