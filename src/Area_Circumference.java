import java.util.Scanner;

public class Area_Circumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rad = in.nextInt();
        circum(rad);
        area(rad);
    }
    static void circum(int r){
        double c = 2 * 3.14 * r;
        System.out.println("Circumference = " + c);
    }

    static void area(int r){
        double a = 3.14 * r * r;
        System.out.println("Area = " + a);    }
}
