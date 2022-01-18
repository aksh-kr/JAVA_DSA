import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        sum(num1, num2);
    }
    static void sum(int a, int b){
        int add= a+b;
        System.out.println("Sum = "+ add);
    }
}
