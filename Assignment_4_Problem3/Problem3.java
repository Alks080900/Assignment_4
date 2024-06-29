package Assignment_4_Problem3;

public class Problem3 {


    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sumArray(arr, n - 1);
    }

        public static void main(String[] args) {
            System.out.println("Main Start");
            int[] arr = {1, 2, 3};
            int n = arr.length;
            int sum = sumArray(arr, n);
            System.out.println("Sum of array elements: " + sum);
            System.out.println("Main End");
        }
    }
