package ifEleseHomeWork;

import java.util.Scanner;

public class validCurrency {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the currency note for deposit: ");
        int note = sc.nextInt();
        
        // Check if the note is a valid currency
        if (note == 2000 || note == 500 || note == 200 || note == 100 || note == 50) {
            System.out.println(note + " is a VALID currency note for deposit.");
        } else {
            System.out.println(note + " is NOT a valid currency note. Valid notes are: 2000, 500, 200, 100, 50");
        }
        
        sc.close();
    }
}
