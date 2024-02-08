package Assignment2_part2;

public class Main {

    public static void main(String[] args) {
        int[] arr = Input.getArrayInput();
        int minDistIndex = Part2.findSmallestDistanceNeighbors(arr);
        if (minDistIndex == -1) {
            System.out.println("No two neighboring numbers with the smallest distance to each other were found.");
        } else {
            System.out.println("The index of the first number in the pair of neighboring numbers with the smallest distance to each other is: " + minDistIndex);
        }
    }
}