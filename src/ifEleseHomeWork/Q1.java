package ifEleseHomeWork;

import java.util.Scanner;

public class Q1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
