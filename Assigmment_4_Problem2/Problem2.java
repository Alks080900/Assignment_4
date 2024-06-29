package Assigmment_4_Problem2;

public class Problem2{
    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        return countDigitsRecursive(n);
    }

    private static int countDigitsRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigitsRecursive(n / 10);
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        int n = 12345;
        int numberOfDigits = countDigits(n);
        System.out.println("Number of digits in " + n + " is: " + numberOfDigits);
        System.out.println("Main End");
    }

}

