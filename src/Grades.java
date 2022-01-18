import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks out of 100 : ");
        int marks = in.nextInt();
        grade(marks);
    }
    static void grade(int num){
        if((num >= 91)){
            System.out.println("AA");
        }
        if((num >= 81) && (num <= 90)){
            System.out.println("AB");
        }
        if((num >= 71) && (num <= 80)){
            System.out.println("BB");
        }
        if((num >= 61) && (num <= 70)){
            System.out.println("BC");
        }
        if((num >= 51) && (num <= 60)){
            System.out.println("CD");
        }
        if((num >= 41) && (num <= 50)){
            System.out.println("DD");
        }
        if(num <= 40){
            System.out.println("FAIL");
        }
    }
}
