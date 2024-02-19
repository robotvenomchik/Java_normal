package Homeworks.Homework11;

public class BankAccount {
    private String fullName;
    private double money;

    private boolean IsLocked;

    public BankAccount(String fullName, double money, boolean isLocked) {
        this.fullName = fullName;
        this.money = money;
        IsLocked = isLocked;
    }

    public String getName() {
        return fullName;
    }

    public double getMoney() {
        return money;
    }

    public boolean isLocked() {
        return IsLocked;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setLocked(boolean locked) {
        IsLocked = locked;
    }

    public void addMoney(double moneyToAdd){
        if (!IsLocked){
            this.money+=moneyToAdd;
        }
        else {
            System.out.println("blocked cannot add");
        }
    }
    public void withDrawMoney(double moneyToMinus){
        if (!IsLocked){
            if (moneyToMinus<=this.money){
                this.money-=moneyToMinus;
            }
            else System.out.println("not enough momey");
        }
        else System.out.println("blocked cannot withdraw");

    }
    public void transfer(BankAccount person, double moneyToTransfer){
        if(!IsLocked && !person.isLocked()){
            if (moneyToTransfer<=this.money){
                withDrawMoney(moneyToTransfer);
                person.addMoney(moneyToTransfer);
                System.out.println("Transfer completed");
            }
        }else {
            System.out.println("blocked no transfer completed");
        }
    }
    public double moneyStatus(){
        return this.money;
    }
    public void lockAccount(){
        this.IsLocked=true;
    }
    public void unlockAccount() {
        this.IsLocked = false;
        System.out.println("Account unlocked");
    }
}
