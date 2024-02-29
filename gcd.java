
// Mistake on the title don't have time to change it SumofMultiplesof7
public class gcd {
   // Prints the sum multiple of 7
    public static void main(String[] args) {
        System.out.println(sumofMOf7(30, 40));
    }

    // sumOfMOf7(int n1, int n2) takes two integers n1 and n2 as input
    //where n1 is less than or equal to n2
    // returns the sum of 7 between n1 and n2
    //If n1 is greater than n2 the function returns 0 indicating that there are no numbers between n1 and n2 that are multiples of 7
    //If n1 is a multiple of 7 the function returns n1 plus the sum of all numbers between n1 + 1 and n2 that are multiples of 7
    //If n1 is not a multiple of 7, the function returns the sum of all numbers between n1 + 1 and n2 that are multiples of 7
    // This helps multiplies the sum of 7 using this code

    static int sumofMOf7(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        }
        if (n1 % 7 == 0) {
            return n1 + sumofMOf7(n1 + 1, n2);
        }
        return sumofMOf7(n1 + 1, n2);
    }


}
