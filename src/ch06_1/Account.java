package ch06_1;

public class Account {
	
	private String accNo;
	private String accName;
	private int balance;
	
	public Account(String accNo, String accName, int balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	

}
