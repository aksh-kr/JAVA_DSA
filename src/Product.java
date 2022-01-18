import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        product(num1, num2);
    }
    static void product(int a, int b){
        int multiple = a * b;
        System.out.println("Product = "+ multiple);
    }
}
