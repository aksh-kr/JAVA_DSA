import java.util.Scanner;

public class ContinuedSum {
    public static void main(String[] args) {
        int num=1, sum=0;
        while(num!=0){
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        sum += num;
        }
        System.out.println("Sum = " + sum);
    }
}
