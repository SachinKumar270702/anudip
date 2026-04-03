package ifEleseHomeWork;

import java.util.Scanner;

public class atmDispenser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Amount: ");
        int amount = sc.nextInt();
        
        int originalAmount = amount;
        
        // Currency denominations array
        int[] denominations = {2000, 500, 200, 100, 50};
        int[] notes = new int[5];
        
        System.out.println("\nCurrency Denomination");
        System.out.println("====================");
        
        // Calculate notes for each denomination
        for (int i = 0; i < denominations.length; i++) {
            notes[i] = amount / denominations[i];
            if (notes[i] > 0) {
                int totalValue = notes[i] * denominations[i];
                System.out.println(denominations[i] + " X " + notes[i] + " = " + totalValue);
                amount = amount - totalValue;
            }
        }
        
        // Print remaining amount if any
        if (amount > 0) {
            System.out.println("\nRemaining amount that cannot be dispensed: " + amount);
        } else {
            System.out.println("\nTotal amount dispensed: " + originalAmount);
        }
        
        sc.close();
    }
}

