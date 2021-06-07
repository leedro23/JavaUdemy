package program;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial depositi? (Y/N): ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit: ");
			double initialDeposit = sc.nextDouble();
			 account = new Account(number, holder, initialDeposit);
		} else {
			 account = new Account(number, holder);
		}
		
		System.out.println(account);
		System.out.println(" ");
		
		System.out.print("Deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Update account: ");
		System.out.println(account);

		sc.close();
	}
}
