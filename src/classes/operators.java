package classes;

import java.util.Scanner;

public class operators {
    static void main() {
        //check is char is alphabet
        //1. use the alphabet range  ((value>='a' && value<='z') ||(value>='A' && value<='Z'))
        //1. use the unicode range  ((value>=65 && value<=90) ||(value>=97 && value<=122))
        Scanner sc=new Scanner(System.in);
//        char value=sc.next().charAt(0);;
//        System.out.println("given key is alphabet: "+((value>='a' && value<='z') ||(value>='A' && value<='Z')));
//        System.out.println("given value is number:"+(value>=48 && value<=57));
        // for numeric value: value>=48 && value<=57;


        //ternary Operator:

        //expression?true:false;
//        int salary=sc.nextInt();
//        int exp=sc.nextInt();
//        float bonus= (float) (exp>=20?0.20*salary:0.10*salary);
//        System.out.println("Your bonus is "+bonus);
        //1
        /*System.out.println("Enter your year");
        int year=sc.nextInt();
        System.out.println("is leap year? "+((year%4==0 || year%100!=0)||(year%400==0)));
        //3
        int age=sc.nextInt();
        System.out.println(age>=18?"can vote":"can't vote");
        //4
        char c=sc.next().charAt(0);
        System.out.println("is upper char: "+(c>='A'&&c<='Z'));
        //5
        int num=sc.nextInt();
        System.out.println(num<0?"negative":(num==0?"zero":"Positive"));
        //6
        int marks=sc.nextInt();
        System.out.println(marks<33?"Fail":"Pass");
        //7
        char v=sc.next().charAt(0);
        System.out.println("Is vowel? : "+((v=='a')||(v=='e')||(v=='i')||(v=='u')||(v=='o')));
        //8
        int isEven=sc.nextInt();
        System.out.println((isEven%2==0)?"even":"odd");*/
        //9
//        char key=sc.next().charAt(0);
//        System.out.println((((key>='a' && key<='z') ||(key>='A' && key<='Z'))?
//                ((key>='A' && key<='Z')?"UpperCase":"LowerCase"):
//                 ((key=='a'||(key=='e')||(key=='i')||(key=='u')||(key=='o')||
//                   (key=='A'||(key=='E')||(key=='I')||(key=='U')||(key=='O'))?"vowel":"consonant")));

        sc.close();


    }

}
