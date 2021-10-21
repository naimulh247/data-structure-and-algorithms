public class RecursionInterviewQuestion {

    public static void main(String[] args) {
        // Question 1 answer
        System.out.println(sumOfDigits(111));
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
    *
    *
    * */
}
