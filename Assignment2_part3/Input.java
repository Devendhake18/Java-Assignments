package Assignment2_part3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Input {
    public static String[] getArrayInput(Scanner scanner) {
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.next();
        }

        return array;
    }

    public static List<String> getArrayListInput(Scanner scanner) {
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrayList.add(scanner.next());
        }

        return arrayList;
    }
}