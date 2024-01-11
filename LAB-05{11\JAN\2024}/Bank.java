import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful");
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successful");
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String customerName, int accountNumber, String accountType, double balance) {
        super(customerName, accountNumber, accountType, balance);
    }

    void compoundInterest() {
        double rate = 0.05;
        double time = 1.0;
        double interest = balance * Math.pow(1 + rate, time) - balance;
        balance += interest;
        System.out.println("Interest of " + interest + " added");
    }

    void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successful");
    }
}

class CurrentAccount extends Account {
    double minimumBalance = 1000;
    double serviceCharge = 50;

    CurrentAccount(String customerName, int accountNumber, String accountType, double balance) {
        super(customerName, accountNumber, accountType, balance);
    }

    void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successful");
    }

    void imposeServiceCharge() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge of " + serviceCharge + " imposed");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter account type (Savings/Current): ");
        String accountType = scanner.next();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Account account;
        if (accountType.equals("Savings")) {
            account = new SavingsAccount(customerName, accountNumber, accountType, balance);
        } else {
            account = new CurrentAccount(customerName, accountNumber, accountType, balance);
        }

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Display balance");
            System.out.println("3. Compute and deposit interest");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 2:
                    account.displayBalance();
                    break;
                case 3:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).compoundInterest();
                    } else {
                        System.out.println("Interest not available for current account");
                    }
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    if (account instanceof CurrentAccount) {
                        ((CurrentAccount) account).imposeServiceCharge();
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
