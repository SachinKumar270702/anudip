package ifEleseHomeWork;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        if(n<0)
            System.out.println("Negative");
        else
            System.out.println("Positive");
    }
}
