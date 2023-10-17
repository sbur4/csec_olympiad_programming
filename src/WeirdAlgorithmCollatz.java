public class WeirdAlgorithmCollatz {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(n);

        while (n != 1) {
            if (n % 2 == 0) { // n is even
                n = n / 2;
            } else { // n is odd
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
    }
}