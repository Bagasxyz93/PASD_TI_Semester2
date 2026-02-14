public class gktau {
    public static void main(String[] args) {
        int n = 5; // Example value for n
        int result = calculateGKTau(n);
        System.out.println("gktau(" + n + ") = " + result);
    }

    public static int calculateGKTau(int n) {
        if (n <= 0) {
            return 0; // Base case for non-positive integers
        }
        if (n == 1) {
            return 1; // Base case for n=1
        }
        // Recursive case: gktau(n) = gktau(n-1) + gktau(n-2)
        return calculateGKTau(n - 1) + calculateGKTau(n - 2);
    }
}