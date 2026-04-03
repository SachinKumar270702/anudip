package ifEleseHomeWork;

import java.util.Scanner;

public class q4 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String userName="Sachin@270702";
        String password="Sachin123";

        System.out.println("Enter your user name:");
        String inputUserName=sc.nextLine();
        if(userName.equalsIgnoreCase(inputUserName)){
            System.out.println("Enter your password:");
            String inputPassword=sc.nextLine();
            if(password.equals(inputPassword)){
                System.out.println("Login successful! Welcome, "+userName);
            }
            else{
                System.out.println("Incorrect password. Login failed.");
            }
        }else{
            System.out.println("Incorrect username. Login failed.");
        }
    }
}
