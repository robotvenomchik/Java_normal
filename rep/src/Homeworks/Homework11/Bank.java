package Homeworks.Homework11;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void createAccount(String fullName) {
        BankAccount account = new BankAccount(fullName, 0, false);
        accounts.add(account);
        System.out.println("Account created with name: " + fullName);
    }

    public BankAccount getAccount(String Fullname) {
        for (BankAccount account : accounts) {
            if (account.getName().equals(Fullname)) {
                return account;
            }
        }
        return null;
    }

    public void lockAccount(String fullName) {
        BankAccount account = getAccount(fullName);
        if (account != null) {
            account.lockAccount();
        } else {
            System.out.println("no acc");
        }
    }

    public void unlockAccount(String fullName) {
        BankAccount account = getAccount(fullName);
        if (account != null) {
            account.unlockAccount();
        } else {
            System.out.println("no acc");
        }
    }
}
