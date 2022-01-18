import java.util.Scanner;

public class MaxnMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println("Max = " + isMax(num1, num2, num3));
        System.out.println("Min = " + isMin(num1, num2, num3));
    }
    static int isMax(int a, int b, int c){
    if(a>b){
        if(a>c){
            return a;
        }
        return c;
    }
    if(b>c){
        return b;
    }
    return c;
    }

    static int isMin(int a, int b, int c){
        if(a<b){
            if(a<c){
                return a;
            }
            return c;
        }
        if(b<c){
            return b;
        }
        return c;
    }
}
