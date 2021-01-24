package BankAccount;

public class Main {

    public static void main(String[] args){
        BankAccount bank = new BankAccount(200, 0.0);
        bank.depositFunds(70);
        bank.addInterest(1.15);
        System.out.println("Your balance is " + bank.getBalance());
    }
}
