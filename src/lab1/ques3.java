package lab1;

import java.util.Scanner;

public class ques3 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        System.out.println("Enter the bit: ");
        int n=sc.nextInt();
        System.out.print(n+ " bit of "+num+" is Set to : ");
        System.out.print((num>>n)&1);
    }
}
