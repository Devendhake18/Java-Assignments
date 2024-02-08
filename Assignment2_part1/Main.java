package Assignment2_part1;
public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        int[] data = input.getInput();
        Part1 part1 = new Part1();
        part1.part1(data);
    }
}