package application;

import java.util.Scanner;

import entities.Account;

public class ProgramAccount {
	// name of this file was supposed to be 'program' but I don't want to have to
	// rearrange what I've already organized

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n)");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.print("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.print("Updated account data: ");
		System.out.println(account);

		sc.close();
	}

}
