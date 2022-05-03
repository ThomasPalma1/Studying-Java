package application;

import entities.BankAccount;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramBank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1001, "Jatto", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Thomas", 0.0, 500.0);

        //working with upcasting

        BankAccount acc1 = bacc;
        BankAccount acc2 = new BusinessAccount(1003, "Palma", 0.0, 200.0);
        BankAccount acc3 = new SavingsAccount(1004, "Bárbara", 0.0, 0.01);

        //working with downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
