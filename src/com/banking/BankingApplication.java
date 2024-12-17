package com.banking;

import java.net.Socket;
import java.util.Scanner;

public class BankingApplication {
	int balance;
	int previousTransaction;
	String  customerId;
	String customerName;
	
	public BankingApplication(String customerId, String customerName) {
		
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public void deposit(int amount) {
		if (amount!=0) {
		balance=balance+amount;
		previousTransaction=amount;
		}
	}
		public void withdrawn(int amount) {
			if (amount!=0) {
				balance=balance-amount;
				previousTransaction=-amount;
			}
			
		}
		public void getpreviousTransaction() {
			if (previousTransaction>0) {
				System.out.println("amount deposit"+previousTransaction);
			}
			else if (previousTransaction<0) {
				System.out.println("withdrawn"+Math.abs(previousTransaction));
			}
			else
			{
				System.out.println("no transaction is occured");
			}
		}
		public void showMenu() {
			char option='\0';
			Scanner scan=new Scanner(System.in);
			System.out.println("------------");
			System.out.println("customername"+customerName);
			System.out.println("customer id"+customerId);
			System.out.println("A.check");
			System.out.println("B.deposit");
			System.out.println("C.withdrawn");
			System.out.println("D.previousTransaction");
			System.out.println("E.exit");
			System.out.println();
			
			do {
				System.out.println("enter the option");
				option =scan.next().charAt(0);
				switch (option) {
				case 'A':
					System.out.println("your balance is"+balance);
					break;
				case 'B':
					System.out.println("enter the deposit amount");
					int amount=scan.nextInt();
					deposit(amount);
					System.out.println(); 
					break;
				case 'C':
					System.out.println("enter the withdraw amount");
					int amount2=scan.nextInt();
					withdrawn(amount2);
					break;
				case 'D':
					System.out.println("previoustransaction");
					getpreviousTransaction();
					
					System.out.println();
					break;
				case 'E':
					System.out.println("----------");
					break;
					default:System.out.println("enter valid inputs");
				}
			}while(option!='E');
			
			
		}
	
}


		
		
	
	




