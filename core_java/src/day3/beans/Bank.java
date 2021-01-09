package day3.beans;

public class Bank {
private int accountNo;
private String Name;
private int balance;
private String accountType;

public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}

public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public Bank () {
	
}

public Bank(int accountNo, String name, int balance, String accountType) {
	super();
	this.accountNo = accountNo;
	Name = name;
	this.balance = balance;
	this.accountType = accountType;
}
@Override
public String toString() {
	return "Bank [accountNo=" + accountNo + ", Name=" + Name + ", balance=" + balance + ", accountType=" + accountType
			+ "]";
}


}
