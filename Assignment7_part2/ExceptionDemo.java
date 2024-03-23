class FactorialException extends Exception {
    private int number;

    public FactorialException(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FactorialException: Number out of range - " + number;
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                if (num < 0 || num > 15) {
                    throw new FactorialException(num);
                }
                int factorial = factorial(num);
                System.out.println("Factorial of " + num + " is: " + factorial);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Invalid input - " + arg);
            } catch (FactorialException e) {
                System.out.println(e);
            }
        }
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
