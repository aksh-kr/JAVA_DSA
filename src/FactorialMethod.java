import java.util.Scanner;

public class FactorialMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num >= 0)
        System.out.println("Factorial = " + Factorial(num));
    }
    static int Factorial(int num) {
        int fact = 1;
        if (num > 0) {
            for (int i = num; i > 0; i--) {
                fact *= i;
            }
            return fact;
        }
//       if (num < 0) {
//            System.out.println("Factorial of negative numbers doesn't exist!");
//        }
//        if (num == 0) {
        return 1;
        }
}
