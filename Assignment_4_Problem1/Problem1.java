package Assignment_4_Problem1;

public class Problem1 {
    public static void printNumReverse (int num) {
        while (num > 0) {
            System.out.print(num % 10);
            num = num / 10;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        printNumReverse(234);
        System.out.println("Main End");
    }
}
