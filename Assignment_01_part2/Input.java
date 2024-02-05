package Assignment_01_part2;
import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    public int inputChoice() {
        int choice = sc.nextInt();
        return choice;
    }

    public double inputNumber() {
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();
        return number;
    }

    public double[] inputNumbers() {
        double []numbers = new double[2];
        System.out.println("Enter First Number: ");
        numbers[0] = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        numbers[1] = sc.nextDouble();
        return numbers;
    }

    // Updated method to allow entering 'end' to stop input
    public double[] inputString() {
        System.out.println("Enter numbers (type 'end' to stop): ");
        String input;
        int count = 0;

        double[] result = new double[20];

        while (true) {
            System.out.println("Enter your number: ");
            input = sc.next();

            if (input.equals("end")) {
                break;
            } else {
                try {
                    double num = Double.parseDouble(input);
                    result[count++] = num;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or 'end' to stop.");
                }
            }
        }

        return result;
    }

    // Close the Scanner object when it's no longer needed
    public void closeScanner() {
        sc.close();
    }
}
