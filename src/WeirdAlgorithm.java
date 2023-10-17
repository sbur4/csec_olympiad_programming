import java.util.Objects;
import java.util.Scanner;

/**
 * Consider an algorithm that takes as input a positive integer n. If n is even,
 * the algorithm divides it by two, and if n is odd, the algorithm multiplies it
 * by three and adds one. The algorithm repeats this, until n is one. For
 * example, the sequence for n=3 is as follows: 3→10→5→16→8→4→2→1
 * <p>
 * Your task is to simulate the execution of the algorithm for a given value of
 * n.
 * <p>
 * Input:The only input line contains an integer n. Output: Print a line that
 * contains all values of n during the algorithm. Constraints: 1≤n≤106 Example -
 * Input: 3 / Output: 3 10 5 16 8 4 2 1
 */

public class WeirdAlgorithm {
    public static void main(String[] args) {
        int n = getUserInput();

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer (between 2 and 105):");

        while (true) {
            String input;
            input = scanner.nextLine().trim();

            if (Objects.isNull(input) || input.isEmpty()) {
                System.err.println("Input can't be empty! Please enter a valid integer between 2 and 105.");
            } else {
                Integer n1 = parseNum(input, scanner);
                if (n1 != null) {
                    return n1;
                }
            }
        }
    }

    private static Integer parseNum(String input, Scanner scanner) {
        int n;
        try {
            n = Integer.parseInt(input);

            if (n >= 2 && n <= 105) {
                return n;
            } else {
                System.err.println("Not available! Please enter a valid integer between 2 and 105.");
            }
        } catch (NumberFormatException exception) {
            System.err.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        return null;
    }
}