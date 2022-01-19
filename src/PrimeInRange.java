import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter lower and upper limits: ");
        int lower = in.nextInt();
        int upper = in.nextInt();
        Prime(lower, upper);
    }
    static void Prime(int a, int b){
        int i;
        for(i =a; i<= b; i++){
            int c = 2;
            while(c <= i){
                if(i % c == 0){
                   break;
                }
                c++;
                System.out.print(i+" ");
                break;
            }
        }
    }
}
