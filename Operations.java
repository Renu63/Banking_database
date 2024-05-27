package banking;

import java.util.Scanner;

public class operation {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	public void createacc() {

		System.out.println("Enter Account Number: ");
		ac.setAccno(sc.nextInt());

		System.out.println("Enter Customer Name: ");
		ac.setCustomerName(sc.next());

		System.out.println("Enter Address: ");
		ac.setAddress(sc.next());

		System.out.println("Enter Balance: $");
		double d = sc.nextDouble();

		while (true) {
			if (d > 499) {
				ac.setBalance(d);
				break;
			} else {
				System.out.println("Balance should be equal to 500 or more than 500");
				System.out.println("Please enter again:- ");
				d = sc.nextDouble();
			}
		}
		System.out.println("Account created sccessfully");

	}

	public void accountDetails() {
		System.out.println("ënter a account number :");

		if (ac.getAccno() == sc.nextInt()) {
			System.out.println("Your account number is : " + ac.getAccno());
			System.out.println("Your name is : " + ac.getCustomerName());
			System.out.println("Your address is : " + ac.getAddress());
			System.out.println("Your account balance is : " + ac.getBalance());

		} else {
			System.out.println("Enter a correct account number \n please try again..");
		}
	}

	public void BalanceInfo() {
		System.out.println("Enter a account number :- ");

		if (ac.getAccno() == sc.nextInt()) {

			System.out.println("Your account balance is :- " + ac.getBalance());

		} else {
			System.out.println("Enter a correct account number \n please try again..");
		}

	}

	public void deposit() {
		System.out.println("Enter account number to deposit money :-");
		if (ac.getAccno() == sc.nextInt()) {
			System.out.println("Enter amount to deposit:- ");
			ac.setBalance(ac.getBalance() + sc.nextDouble());

			System.out.println("Amount deposited sucessfully. \nYour available balance is : " + ac.getBalance());

		} else {
			System.out.println("Please enter correct account number ");
		}
	}

	public void Withdraw() {
		System.out.println("Enter account number to withdraw money:- ");
		if (ac.getAccno() == sc.nextInt()) {
			System.out.println("Enter amount to withdraw ");
			double wd = sc.nextDouble();

			if ((ac.getBalance() - wd) != 500 && (ac.getBalance() - wd) > wd) {
				ac.setBalance(ac.getBalance() - wd);
				System.out.println("Amount withdrawl sucessfully..\nYour available balance is :- " + ac.getBalance());

			} else {
				System.out.println("Insufficient Fund..");
				System.out.println("PLease enter correct amount:- ");
			}
		} else {
			System.out.println("Please enter correct account number:- ");
		}
	}
}
