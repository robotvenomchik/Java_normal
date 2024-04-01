public class Homework20 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        ATMTransaction transaction1 = new ATMTransaction(account, true, 500);
        ATMTransaction transaction2 = new ATMTransaction(account, false, 200);
        ATMTransaction transaction3 = new ATMTransaction(account, true, 800);
        ATMTransaction transaction4 = new ATMTransaction(account, true, 300);

        transaction1.start();
        transaction2.start();
        transaction3.start();
        transaction4.start();
        BankAccount account2 = new BankAccount(500);

        ATMTransaction transaction12 = new ATMTransaction(account2, true, 500);
        ATMTransaction transaction22 = new ATMTransaction(account2, false, 200);
        ATMTransaction transaction32 = new ATMTransaction(account2, false, 800);
        ATMTransaction transaction42 = new ATMTransaction(account2, true, 300);

        transaction12.start();
        transaction22.start();
        transaction32.start();
        transaction42.start();
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance after withdrawal: " + balance);
        } else {
            System.out.println(" Not enough money in " + Thread.currentThread().getName() + " to withdraw " + amount);
        }
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
        balance += amount;
        System.out.println("Remaining balance after deposit: " + balance);
    }
}

class ATMTransaction extends Thread {
    private BankAccount account;
    private boolean isWithdraw;
    private double amount;

    public ATMTransaction(BankAccount account, boolean isWithdraw, double amount) {
        this.account = account;
        this.isWithdraw = isWithdraw;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isWithdraw) {
            synchronized(account) {
                account.withdraw(amount);
            }
        } else {
            synchronized(account) {
                account.deposit(amount);
            }
        }
    }
}

