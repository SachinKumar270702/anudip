package ifEleseHomeWork;

import java.util.Scanner;

public class q7 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>90 && marks<100){
            System.out.println("A");
        }else if(marks>80 && marks<90){
            System.out.println("B");
        } else if (marks>70 && marks<80) {
            System.out.println("C");
        } else if (marks>60 && marks<70) {
            System.out.println("D");
        } else if (marks>50 && marks<60) {
            System.out.println("E");
        } else if (marks>0 && marks<50) {
            System.out.println("Fail");
        }else if(marks<0 && marks>100){
            System.out.println("Invalid Marks");
        }
    }
}
