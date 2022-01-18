import java.util.Scanner;

public class EligibleVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println(isEligible(age));
}
        static String isEligible(int age){
            if(age>= 18){
           return"Eligible";}
            return "Not Eligible";}
}