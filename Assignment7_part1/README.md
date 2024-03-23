**Assignment 7 Part 1:**

**Title:** Rational Number Operations .

The RationalNumber class represents a rational number, which is a number that can be expressed as the ratio of two integers, a numerator and a denominator. The class provides methods for performing arithmetic operations on rational numbers, such as addition, subtraction, multiplication, and division. It also includes methods for comparing two rational numbers, converting a rational number to a floating-point number, and finding the absolute value of a rational number.

Here is a description of each method or function in the RationalNumber class:

- `RationalNumber(int numerator, int denominator):` Constructs a new RationalNumber object with the specified numerator and denominator. The denominator must not be zero.
- `getNumerator():` Returns the numerator of this rational number.
- `getDenominator():` Returns the denominator of this rational number.
- `add(RationalNumber other):` Adds this rational number to another rational number and returns the result as a new RationalNumber object.
- `subtract(RationalNumber other):` Subtracts another rational number from this rational number and returns the result as a new RationalNumber object.
- `multiply(RationalNumber other):` Multiplies this rational number by another rational number and returns the result as a new RationalNumber object.
- `divide(RationalNumber other):` Divides this rational number by another rational number and returns the result as a new RationalNumber object. The denominator of the other rational number must not be zero.
- `compareTo(RationalNumber other):` Compares this rational number to another rational number. Returns a negative integer, zero, or a positive integer as this rational number is less than, equal to, or greater than the other rational number.
- `toDouble():` Converts this rational number to a floating-point number and returns the result.
- `abs():` Returns the absolute value of this rational number as a new RationalNumber object.
- `simplify():` Simplifies this rational number by dividing both the numerator and the denominator by their greatest common divisor (gcd).
- `gcd(int a, int b):` Calculates the greatest common divisor (gcd) of two integers usingthe Euclidean algorithm.
- `main(String\[\] args):` The main method of the program. It takes four command-line arguments representing the numerator and denominator of two rational numbers, creates two RationalNumber objects with the given values, and then performs arithmetic operations on them. It also checks the comparison, conversion to floating-point numbers, and absolute value of the rational numbers
