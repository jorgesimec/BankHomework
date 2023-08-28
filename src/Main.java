import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String clientName = scanner.nextLine();

        //double balance = 0;

        //Instanciando la clase BankAccount
        BankAccount bankAccount = new BankAccount(clientName, 0);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Get Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int options = scanner.nextInt();


            switch (options) {
                case 1:
                    System.out.print("Enter an amount: ");
                    double deposit_amount = scanner.nextDouble();
                    bankAccount.deposit(deposit_amount);
                    break;
                case 2:
                    System.out.print("Enter an amount: ");
                    double withdraw_amount = scanner.nextDouble();
                    bankAccount.withdraw(withdraw_amount);
                    break;
                case 3:
                    bankAccount.getBalance();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

        System.out.println("See you next time.");
        scanner.close();
    }
}