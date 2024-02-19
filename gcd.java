public class gcd {
   // Prints the sum of 7
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 70;
        int result = sumMOf7(n1, n2);
        System.out.println("Sum of multiples of 7 between " + n1 + " and " + n2 + ": " + result);
    }

    // This helps multiplies the sum of 7 using this code
    static int sumMOf7(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        } else {
            return (n1 % 7 == 0 ? n1 : 0) + sumMOf7(n1 + 1, n2);
        }
    }

}
