package day3.java_OOP;
import day3.beans.Bank;

public class TestBank {

	public static void main(String[] args) {
		Bank b1 = new Bank(101, "Arpita", 45000, "Savings");
		Bank b2 = new Bank(102, "Bipasha", 425000, "Fixed Deposit");
		Bank b3 = new Bank(103, "Chaya", 45000, "Savings");
		Bank b4 = new Bank(104, "Dhananjay", 45000, "Savings");
		Bank b5 = new Bank(105, "Eril", 45000, "Savings");
		
		Bank[] arrayOfBank = {b1,b2,b3,b4,b5};
		
		TestBank tb1 = new TestBank();
		tb1.displayAllUsers(arrayOfBank);
		
	}

	public void displayAllUsers(Bank[] arrayOfBank) {
		for(Bank i : arrayOfBank) {
			System.out.println(i);
		}
	}
}
