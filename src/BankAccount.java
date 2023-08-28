public class BankAccount {
    private String clientName;
    private double balance;

    public BankAccount(String clientName, double balance) {
        this.clientName = clientName;
        this.balance = balance;
    }

    /*public void setBalance() {
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }*/

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount + ". Your current balance is: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdraw: " + amount + ". Your current balance is: " + balance);
        }
    }

    public void getBalance() {
        System.out.println("Your current amount is: " + balance);
    }

}