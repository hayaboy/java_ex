package ch06;

public class Account {
	// 상수로 값을 고정하면
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	// 필
	private int balance;

	// 생

	// 메

	public void setBalance(int balance) {
		// 매개변수로 들어온 것이 음수값이 될 수 없고
		if (balance < Account.MIN_BALANCE) {
			//this.balance = Account.MIN_BALANCE;
			// 함수를 종료
			return;
		} else if (balance > Account.MAX_BALANCE) {
//			this.balance = Account.MAX_BALANCE;
			return;
		} else {
			this.balance = balance;
		}
	}

	public int getBalance() {
		return this.balance;
	}

}
