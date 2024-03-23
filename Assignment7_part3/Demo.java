package Assignment7_part3;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Demo {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lineNumber = 1;
        try {
            System.out.print("Enter a string: ");
            String input = reader.readLine();
            if (!input.equals("India")) {
                throw new NoMatchException(lineNumber, input);
            }
            System.out.println("You entered 'India'.");
        } catch (NoMatchException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}