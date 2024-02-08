package Assignment2_part3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Convert array to ArrayList");
            System.out.println("2. Convert ArrayList to array");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    String[] array = Input.getArrayInput(scanner);
                    List<String> arrayList = Converter.arrayToArrayList(array);
                    System.out.println("Original array:");
                    System.out.println(Arrays.toString(array));
                    System.out.println("Array converted to ArrayList:");
                    System.out.println(arrayList);
                    break;
                case 2:
                    List<String> userArrayList = Input.getArrayListInput(scanner);
                    String[] newArray = Converter.arrayListToArray(userArrayList);
                    System.out.println("Original ArrayList:");
                    System.out.println(userArrayList);
                    System.out.println("ArrayList converted to array:");
                    System.out.println(Arrays.toString(newArray));
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}