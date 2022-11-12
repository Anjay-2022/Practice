package bankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
	ArrayList<Accountdetails> accountdetail = new ArrayList<Accountdetails>();

	public void createAccount() {
		Scanner read = new Scanner(System.in);
		Accountdetails account = new Accountdetails();

		System.out.println("Enter name of account");
		account.setName(read.next());
		System.out.println("Enter Account number");
		account.setAccountnumber(read.nextLong());
		System.out.println("Enter Address");
		account.setAddress(read.next());
		System.out.println("Enter Mobile number");
		account.setMobileno(read.nextLong());
		System.out.println("Enter the amount which u want to deposit for first time ");
		account.setDeposit(read.nextInt());

		accountdetail.add(account);
	}

	public void depositMoney() {
		Scanner read = new Scanner(System.in);
		Accountdetails account = new Accountdetails();

		if (accountdetail.size() > 0) {
			System.out.println("Enter the Account number to deposit money");
			long number = read.nextLong();
			boolean check = false;

			for (int i = 0; i < accountdetail.size(); i++) {
				if (accountdetail.get(i).getAccountnumber() == number) {
					check = true;
					System.out.println("Enter the amount which u want to deposit in account ");
					accountdetail.get(i).setDeposit(read.nextInt());
					System.out.println("Money Deposited... ");
					break;
				}
			}
			if (check == false)
				System.out.println("Account not found in Directory");

		} else
			System.out.println("Directory of Accounts is empty");
	}

	public void moneyWithdraw() {
		Scanner read = new Scanner(System.in);
		Accountdetails account = new Accountdetails();

		if (accountdetail.size() > 0) {
			System.out.println("Enter the Account number to withdraw money");
			long number = read.nextLong();
			boolean check = false;

			for (int i = 0; i < accountdetail.size(); i++) {
				if (accountdetail.get(i).getAccountnumber() == number) {
					check = true;
					System.out.println("Enter the amount which u want to withdraw in account ");
					accountdetail.get(i).setWithdraw(read.nextInt());
					System.out.println("Money Withdrawed... ");
					break;
				}
			}
			if (check == false)
				System.out.println("Account not found in Directory");

		} else
			System.out.println("Directory of Account is empty");

	}

	public void display() {
		if (accountdetail.size() > 0) {
			for (Accountdetails i : accountdetail)
				System.out.println(i);
		} else
			System.out.println("Account directory is empty");

	}
	
	public void editDetails() {
		Scanner read = new Scanner(System.in);
		Accountdetails account = new Accountdetails();
		if (accountdetail.size() > 0) {
		System.out.println("Enter the Account details which u want to edit");
		long number = read.nextLong();
		boolean check = false;

		for (int i = 0; i < accountdetail.size(); i++) {
			if (accountdetail.get(i).getAccountnumber() == number) {
				check = true;
				System.out.println(
						"Choose the option for edit \n1.Account Name\n2.Address\n3.Mobile number");
				int option = read.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter First name to edit");
					accountdetail.get(i).setName(read.next());
					break;
				case 2:
					System.out.println("Enter Address to edit");
					accountdetail.get(i).setAddress(read.next());
					break;
				case 3:
					System.out.println("Enter Mobile number  to edit");
					accountdetail.get(i).setMobileno(read.nextInt());
					break;
				}
				System.out.println("Account details edited and Saved succesfully in Directory");
			}
		}
		if (check == false) {
			System.out.println("Account  not found in Directory");
		}

	} else
		System.out.println("Directory is empty");
		
	}

	public void deleteAccount() {
		Scanner read = new Scanner(System.in);

		if (accountdetail.size() > 0) {
			System.out.println("Enter the Account number to delete");
			long number = read.nextLong();
			boolean check = false;

			for (int i = 0; i < accountdetail.size(); i++) {
				if (accountdetail.get(i).getAccountnumber() == number) {
					check = true;
					Accountdetails account = accountdetail.get(i);
					accountdetail.remove(account);
					System.out.println("Employee details deleted...");
					break;
				}
			}
			if (check == false)
				System.out.println("Account not found in Directory");

		} else
			System.out.println("Directory of Account is empty");

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Bank Account Program ");
		BankAccount account = new BankAccount();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println(
					"Choose the option \n1.Create new account\n2.Deposit money\n3.Money withdrawal\n4.Delete account\n5.Edit account details\n6.Display details\n7.Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				account.createAccount();
				break;
			case 2:
				account.depositMoney();
				break;
			case 3:
				account.moneyWithdraw();
				break;
			case 4:
				account.deleteAccount();
				break;
			case 5:
				account.editDetails();
				break;
			case 6:
				account.display();
				break;
			case 7:
				run = false;
				break;
			default:
				System.out.println("choose correct option");
			}
		}

	}

}
