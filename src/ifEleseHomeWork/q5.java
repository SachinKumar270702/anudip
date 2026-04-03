package ifEleseHomeWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
