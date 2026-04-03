package classes;
import java.util.Scanner;

//ctrl+shift+o to add or remove imports
public class usingScanner {
    static void main() {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter two number");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println("The value of a ="+a);
//        System.out.println("The value of b ="+b);
//        System.out.println("The value of a+b ="+(a+b));
//
//        System.out.println("Enter a char:");
//        char ch=sc.next().charAt(0);
//        System.out.println("char value"+ch);
//

        System.out.println("Enter your salary:");
        int salary=sc.nextInt();
        float bonus=((float)salary*15)/100;
        System.out.println("Your bonus is "+bonus);
        sc.close();
    }
}
