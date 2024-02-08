package Assignment2_part1;
import java.util.Scanner;

public class Input {
    public int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] data = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }
        scanner.close();
        return data;
    }
}