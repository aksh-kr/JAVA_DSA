import java.util.Scanner;

public class EvenOddMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isEvenOdd(num));
    }
    static String isEvenOdd(int num){
        if(num%2==0){
            return "Even";
        }
        return "Odd";
    }
}
