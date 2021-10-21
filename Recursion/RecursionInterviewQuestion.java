public class RecursionInterviewQuestion {

    public static void main(String[] args) {
        // Question 1 answer test

        System.out.println("Sum of Digits: " + sumOfDigits(111));

        // Question 2 answer test
        System.out.println("Power: " + power(2, 20));
        
        // Question 3 answer test
        System.out.println("GCD: " + gcd(408, 108));
    }

    /** Question 1
     * How to find the sum of digits of positive integer numbers using recursion?
     *
     * For example:
     * if the given number is 54, the sum would be 5 + 4 = 9
     * if the given number is 1-, the sum would be 1 + 0 = 10
     * if the given number is 112, the sum would be 11 + 2, but 11 would be broken to 1 + 1. This 1 + 1 + 2 = 4
     */

    public static int sumOfDigits(int n){
        // base case and unintensional cases to prevent infinite loop
        if( n == 0 || n <0 ){
            return 0;
        }

        return n % 10 + sumOfDigits( n / 10 );
    }


    /*Question 2
     * How to calculate power of a number using recursion?
     * if given 2^4, then it is the same as 2x2x2x2 = 16
     */

    public static int power(int base, int exp){
        // unintentional case
        if ( exp < 0 || base < 0){
            return -1;
        }
        // base case
        if ( exp == 0){
            return 1;
        }

        // x^n = x*x^(n-1)
        return base * power(base, exp - 1);

    }

    /*Question 3
    * How to find the GCD ( Greatest Common Divisor ) of two numbers using recursion?
    * GCD is the largest positive integer that divides both numbers without a remainder
    * gcd(8,12) is 4
    * */

    /*For this question we are going to use Euclidean Algorithm
    * Euclodean Algorithm Does the following for gcd(48,18):
    * Step 1: 48/18 = 2 remainder 12
    * Step 2: 18/12 = 1 remainder 6
    * Step 3: 12/6 = 2 remainder 0
    *
    * Such that: gcd(a, 0) = a and gcd(a, b) = gcd( b, a mod b )
    * */

    public static int gcd(int a, int b){
        // unintentional cases
        if (a < 0 || b < 0){
            return -1;
        }
        // base case
        if( b == 0){
            return a;
        }

        // gcd(a, b) = gcd( b, a mod b )
        return gcd(b, a % b);

        
    }

}
