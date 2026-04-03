package lab1;

import java.util.Scanner;

public class ques2 {

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second Number: ");
        int b=sc.nextInt();
        System.out.print("The maximum between "+a+" and "+b+" is: ");
        System.out.println((a>b)?a:b);

    }
}
