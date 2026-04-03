package lab1;

public class ques1 {
    public static class Bank{
        double amount;
        public Bank(double amount){
            this.amount=amount;
        }
        public void withdraw(double withdrawalAmount) {
            String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
            System.out.println(message);
            if (withdrawalAmount <= amount) {
                amount -= withdrawalAmount;
            }
        }
        public void deposit(double depositAmount) {
            amount += depositAmount;
        }
    }
    public static void main(String[] args) {
        Bank bank = new Bank(10000);
        bank.withdraw(5000);
        bank.deposit(5000);
        System.out.println("Total balance: " + bank.amount);
    }
}
