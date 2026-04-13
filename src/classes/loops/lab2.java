package classes.loops;

import java.util.Scanner;

public class lab2 {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        //Q1.
//        System.out.println("Enter a number");
//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println("Sum of the first n numbers: "+sum);

        //Q2:
//        System.out.println("Enter a number: ");
//        int x=sc.nextInt();
//
//        for (int i=1;i<=10;i++) {
//            System.out.println(x+" x "+i+" = "+(x*i));
//        }

        //Q3:
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        int copy=n;
//        int rev=0;
//        while (n!=0) {
//            int digit = n % 10;
//            rev = rev * 10 + digit;
//            n /= 10;
//        }
//        System.out.println("original Number: "+copy);
//        System.out.println("Reversed Number: "+rev);

        //Q4:
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        int factorial=1;
//        for (int i=1;i<=n;i++) {
//            factorial=factorial*i;
//        }
//        System.out.println("Factorial of "+n+" is: "+factorial);

        //Q5:
//        System.out.println("Enter the number of terms: ");
//        int n=sc.nextInt();
//        if(n>=1) System.out.print(0 + " ");
//        if(n>=2) System.out.print(1 + " ");
//        int a=0, b=1;
//        for(int i=3;i<=n;i++){
//            int c = a + b;
//            System.out.print(c + " ");
//            a = b;
//            b = c;
//        }
        //Q6:
//        System.out.println("Enter first number: ");
//        int a=sc.nextInt();
//        System.out.println("Enter second number: ");
//        int b=sc.nextInt();
//        System.out.println("the Gcd of the two number is: ");
//        for (int i = Math.min(a, b); i > 0; i--) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

        //Q7:not answer:
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        System.out.println("Binary of "+n+" is: ");
//
//        }

        //Q8:freq of number
        /*System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int[] freq = new int[10];
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            freq[digit]++;
            temp /= 10;
        }
        System.out.println("Digit frequencies in " + n + ":");
        for(int i=0; i<10; i++){
            if(freq[i] > 0){
                System.out.println("Digit " + i + ": " + freq[i]);
            }
        }*/

        //Q9:not done:

        //Q10:
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        int sqr=n*n;
//        int lastDigOfN=n%10;
//        int lastDigOfSqr=sqr%10;
//        if(lastDigOfN==lastDigOfSqr){
//            System.out.println(n+" is an automorphic number.");
//        } else {
//            System.out.println(n+" is not an automorphic number.");
//        }

        //Q11:
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        int trailingZero=0;
//        while(n>0 && n%10 == 0){
//            trailingZero++;
//            n /=10;
//        }
//        System.out.println("Number of trailing zero: "+trailingZero);

        //Q12:pascals triangle

        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int num=1;
            for(int j=0; j<=i; j++){
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }

        //Q13:

//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n-1; i>=1; i--){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Q16:
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        int copy=n;
//        int sum=0;
//        int mul=1;
//        while(n>0){
//            sum=sum+(n%10);
//            mul=mul*(n%10);
//            n=n/10;
//        }
//        if(sum==mul){
//            System.out.println(copy+" is a spy number.");
//        } else {
//            System.out.println(copy+" is not a spy number.");
//        }
        //Q17:

//        System.out.println("Enter the number :");
//        int n = sc.nextInt();
//        boolean hasZero = false;
//        int temp = n;
//        while(temp > 0){
//            if(temp % 10 == 0){
//                hasZero = true;
//                break;
//            }
//            temp /= 10;
//        }
//        if(hasZero){
//            System.out.println(n + " is a duck number.");
//        } else {
//            System.out.println(n + " is not a duck number.");
//        }

        //Q18:
//        System.out.println("Enter a number: ");
//        int n=sc.nextInt();
//        int copy=n;
//        int sum=0;
//        for(int i=n;i>=1;i--){
//            int num=n%10;
//            sum= (int) Math.pow(num,i);
//            n=n/10;
//        }
//        if(sum==n){
//            System.out.println(copy+" is Disarium number");
//        }else{
//            System.out.println(copy+" is not Disarium number");
//        }
        //Q19:
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        String s = String.valueOf(n);
//        int len = s.length();
//        boolean isCircular = true;
//        for(int i = 0; i < len; i++){
//            String rot = s.substring(i) + s.substring(0, i);
//            int rotNum = Integer.parseInt(rot);
//            if(!isPrime(rotNum)){
//                isCircular = false;
//                break;
//            }
//        }
//        if(isCircular){
//            System.out.println(n + " is a circular prime.");
//        } else {
//            System.out.println(n + " is not a circular prime.");
//        }

        //Q20:not done

        //Q21:not done
        //Q22: question not understandable

        //Q23: Mini Bank System
//        double balance = 0;
//        int choice;
//
//        while(true){
//            System.out.println("\n MINI BANK SYSTEM ");
//            System.out.println("1. Deposit");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Check Balance");
//            System.out.println("4. Exit");
//            System.out.println("Enter your choice: ");
//            choice = sc.nextInt();
//
//            switch(choice){
//                case 1:
//                    System.out.println("Enter amount to deposit: ");
//                    double depositAmount = sc.nextDouble();
//                    if(depositAmount > 0){
//                        balance += depositAmount;
//                        System.out.println("Successfully deposited: " + depositAmount);
//                        System.out.println("Current balance: " + balance);
//                    } else {
//                        System.out.println("Invalid amount! Please enter a positive value.");
//                    }
//                    break;
//
//                case 2:
//                    System.out.println("Enter amount to withdraw: ");
//                    double withdrawAmount = sc.nextDouble();
//                    if(withdrawAmount > 0 && withdrawAmount <= balance){
//                        balance -= withdrawAmount;
//                        System.out.println("Successfully withdrawn: " + withdrawAmount);
//                        System.out.println("Current balance: " + balance);
//                    } else if(withdrawAmount > balance){
//                        System.out.println("Insufficient balance! Available balance: " + balance);
//                    } else {
//                        System.out.println("Invalid amount! Please enter a positive value.");
//                    }
//                    break;
//
//                case 3:
//                    System.out.println("Current balance: " + balance);
//                    break;
//
//                case 4:
//                    System.out.println("Thank you for using Mini Bank System. Goodbye!");
//                    return;
//
//                default:
//                    System.out.println("Invalid choice! Please try again.");
//            }
//        }
        //Q24
//        System.out.println("Enter month (1-12): ");
//        int month = sc.nextInt();
//        System.out.println("Enter year: ");
//        int year = sc.nextInt();
//
//        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
//                "July", "August", "September", "October", "November", "December"};
//        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        // Check for leap year
//        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
//            daysInMonth[2] = 29;
//        }
//
//        // Get day of week for first day of month (0=Sun, 1=Mon, etc.)
//        java.util.Calendar cal = java.util.Calendar.getInstance();
//        cal.set(year, month - 1, 1);
//        int firstDay = cal.get(java.util.Calendar.DAY_OF_WEEK) - 1;
//        int days = daysInMonth[month];
//
//        System.out.println("\n" + monthNames[month] + " " + year);
//        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
//
//        // Print spaces for days before month starts
//        for(int i = 0; i < firstDay; i++){
//            System.out.print("    ");
//        }
//
//        // Print dates
//        int dayCounter = firstDay;
//        for(int i = 1; i <= days; i++){
//            System.out.printf("%3d", i);
//            dayCounter++;
//            if(dayCounter % 7 == 0){
//                System.out.println();
//            } else {
//                System.out.print(" ");
//            }
//        }

        //pattern 1:
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=i;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
        //pattern 2:
//        int n=sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //pattern 3:
//        int n=sc.nextInt();
//        int num=1;
//        for (int i = 1; i <= n; i++) {
//            for(int j=1;j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }

        //pattern 4
//        int n=sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for(int j=i;j>=1;j--){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        //pattern 6
//        int n=sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = (n - i); j >= 1; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //pattern 7
//        int n=sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (n - i); j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //pattern 9:
        int ne=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

