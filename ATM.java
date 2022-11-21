package Inheritance;

import java.util.Scanner;

public class ATM {
	private static String entry;
	public static void main (String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
		String pin = "08152003";
		String password = "81503";
		entry = keyboard.toString();
		System.out.println("Welcome to the Bank of Bellarmine.");
		System.out.println("Enter your Pin: ");
		System.out.println("Enter your Password: ");
		String pin1 = keyboard.nextLine();
		String password1 = keyboard.nextLine();
		
		if (password.equals(password1) && pin.equals(pin1))
		{
			System.out.println("\nPin and Password Accepted.");
		}
		else
		{
			System.out.println("\nIncorrect Pin or Password. Try Again.");
			System.out.println("Enter Your Pin: ");
			System.out.println("Enter Your Password: ");
			entry = keyboard.nextLine();
		}
		
	System.out.println("Checking or Savings?");
	entry = keyboard.nextLine();
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	do {
	
	if(entry.equals("checking"))
	{
		System.out.println("Choose 1 for Withdraw");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for Exit");
		System.out.println("Choose What Operation You Would Like: ");
		int choice1 = sc.nextInt();
		int balance=100000;
		switch(choice)
		{
		case 1: 
			System.out.println("Enter Money to be withdrawn: ");
			int withdraw = sc.nextInt();
			if(balance>=withdraw)
			{
				balance = balance-withdraw;
				System.out.println("Please Collect Your Money");
		}
			else
			{
				System.out.println("Insufficient Balance");
			}
			System.out.println("balance:" +balance);
			break;
		
		case 2:
			System.out.println("Enter Money to be Deposited: ");
			int deposit= sc.nextInt();
			balance = balance+deposit;
			System.out.println("Your Money Has Been Successfully Deposited");
			System.out.println("balance:" +balance);
			break;
		
		case 3:
			System.out.println("Balance: "+balance);
			break;
		
		case 4:
			System.exit(0);
	
		}
	}
	else
	{
		System.out.println("Choose 1 for Withdraw");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for Exit");
		System.out.println("Choose What Operation You Would Like: ");
		
		int choice2 = sc.nextInt();
		int balance=100000;
		switch(choice2)
		{
		case 1: 
			System.out.println("Enter Money to be withdrawn: ");
			int withdraw = sc.nextInt();
			if(balance>=withdraw)
			{
				balance = balance-withdraw;
				System.out.println("Please Collect Your Money");
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
			System.out.println("balance:" +balance);
			break;
		
		case 2:
			System.out.println("Enter Money to be Deposited: ");
			int deposit = sc.nextInt();
			balance = balance+deposit;
			System.out.println("Your Money Has Been Successfully Deposited");
			System.out.println("balance: "+balance);
			break;
		
		case 3:
			System.out.println("Balance: "+balance);
			System.out.println(balance);
			break;
	
		case 4:
			System.exit(0);
	
		}
	}
	}
	while(choice!=4);
	}
}


	



	


