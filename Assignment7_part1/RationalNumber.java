package Assignment7_part1;

import java.util.Scanner;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Addition
    public RationalNumber add(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Subtraction
    public RationalNumber subtract(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Multiplication
    public RationalNumber multiply(RationalNumber other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Division
    public RationalNumber divide(RationalNumber other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Comparison
    public int compareTo(RationalNumber other) {
        int thisValue = this.numerator * other.denominator;
        int otherValue = other.numerator * this.denominator;
        return Integer.compare(thisValue, otherValue);
    }

    // Convert to floating point
    public double toDouble() {
        return (double) numerator / denominator;
    }

    // Absolute value
    public RationalNumber abs() {
        return new RationalNumber(Math.abs(numerator), Math.abs(denominator));
    }

    // Simplify the rational number
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
    }

    // Calculate greatest common divisor
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        try {
            if (args.length != 4) {
                throw new IllegalArgumentException("Exactly 4 arguments are required.");
            }

            int num1 = Integer.parseInt(args[0]);
            int den1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            int den2 = Integer.parseInt(args[3]);

            RationalNumber rational1 = new RationalNumber(num1, den1);
            RationalNumber rational2 = new RationalNumber(num2, den2);

            System.out.println("Rational 1: " + rational1.getNumerator() + "/" + rational1.getDenominator());
            System.out.println("Rational 2: " + rational2.getNumerator() + "/" + rational2.getDenominator());
            System.out.println("Addition: " + rational1.add(rational2).getNumerator() + "/" + rational1.add(rational2).getDenominator());
            System.out.println("Subtraction: " + rational1.subtract(rational2).getNumerator() + "/" + rational1.subtract(rational2).getDenominator());
            System.out.println("Multiplication: " + rational1.multiply(rational2).getNumerator() + "/" + rational1.multiply(rational2).getDenominator());
            System.out.println("Division: " + rational1.divide(rational2).getNumerator() + "/" + rational1.divide(rational2).getDenominator());
            System.out.println("Comparison: " + rational1.compareTo(rational2));
            System.out.println("Rational 1 to double: " + rational1.toDouble());
            System.out.println("Rational 2 to double: " + rational2.toDouble());
            System.out.println("Absolute value of rational 1: " + rational1.abs().getNumerator() + "/" + rational1.abs().getDenominator());
            System.out.println("Absolute value of rational 2: " + rational2.abs().getNumerator() + "/" + rational2.abs().getDenominator());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input: Please provide integers as arguments.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
