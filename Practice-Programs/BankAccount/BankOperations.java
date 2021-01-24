package BankAccount;

public class BankOperations {

    private int balance;
    private double interest;

    public BankOperations() {
        balance = 0;
        interest = 0.0;
    }

    public BankOperations(int initialBalance, double initialInterest){
        balance = initialBalance;
        interest = initialInterest;

    }

    public void depositFunds(int amount) {
        balance = balance + amount;
    }

    public void withdrawFunds(int amount){
        balance = balance - amount;
    }

    public void addInterest(double interest){
        balance = (int) (balance * interest);
    }

    public int getBalance(){
        return balance;
    }


}
