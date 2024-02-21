package ch06_1;

import java.util.Scanner;

public class BankApplication {

	static Scanner scanner = new Scanner(System.in);

	static Account accounts[] = new Account[100];

	public static void main(String[] args) {

//		Account account =new Account();

		// Scanner scanner=new Scanner(System.in);

		int menu = 0;

		boolean flag = true;
//		for(Account account : accounts) {
//			System.out.println(account);
//		}

		while (flag) {
			System.out.println("-----------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			menu = scanner.nextInt();
			if (menu == 1) {
				// 1. 계좌 생성
				createAccount();

			} else if (menu == 2) {
				// 2. 계좌 목록
				accList();
			} else if (menu == 3) {
				// 3. 예금(deposit)

				deposit();
			} else if (menu == 4) {
				// 4. 출금(withdraw)
				withdraw();

			} else if (menu == 5) {
				flag = false;
			} else {

			}

		}

		System.out.println("프로그램 종료");

	}

	static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.println("계좌번호:");

		// 현재 줄을 지나서 이 스캐너를 전진시키고 건너뛴 입력을 반환합니다. 이 메서드는 끝에 있는 줄 구분 기호를 제외하고 현재 줄의 나머지
		// 부분을 반환합니다.
		// 위치는 다음 줄의 시작 부분으로 설정됩니다.
		// Advances this scanner past the current line and returns the input that was
		// skipped.
		// String tempAccNo=scanner.nextLine();

		String tempAccNo = scanner.next();
		// System.out.println(tempAccNo);

		System.out.print("계좌주:");
		String tempAccName = scanner.next();
		System.out.print("초기입금액:");
		int tempBalance = scanner.nextInt();
		// int tempBalance=Integer.parseInt(scanner.next());
		Account tempAccount = new Account(tempAccNo, tempAccName, tempBalance);
//		System.out.println("계좌번호 " + account.getAccNo() + " 계좌주 " + account.getAccName() +" 초기입금액 " + account.getAccNo());

		for (int i = 0; i < accounts.length; i++) {

			// 반복문시에 null체크해서 null일 경우에만 들어가도록.....
			if (accounts[i] == null) {
				accounts[i] = tempAccount;
				System.out.println("결과: 계좌 생성됨");
				break;
			}

		}

	}

	static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.println("계좌번호:");
		String tempAccNo = scanner.next();
		for (int i = 0; i < accounts.length; i++) {

			// 반복문시에 null체크해서 null일 경우에만 들어가도록.....

			if (accounts[i] != null) {
				String accNo = accounts[i].getAccNo();
				if (accNo.equals(tempAccNo)) {
					System.out.println("찾음");
					System.out.print("예금액 : ");
					// 해당 계좌 찾은 후 그 계좌에서 예금을 해야함
					int inputMoney = scanner.nextInt();
					int accu = accounts[i].getBalance() + inputMoney;
					accounts[i].setBalance(accu);
					System.out.println("결과 : 예금 성공");
				} else {
					System.out.println("계좌 번호 없음");
				}

				// break;
			}

		}
		
	}

	static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.println("계좌번호:");
		
		String tempAccNo = scanner.next();

		for (int i = 0; i < accounts.length; i++) {

			// 반복문시에 null체크해서 null일 경우에만 들어가도록.....

			if (accounts[i] != null) {
				String accNo = accounts[i].getAccNo();
				if (accNo.equals(tempAccNo)) {
					System.out.println("찾음");
					System.out.print("출금액 : ");
					// 해당 계좌 찾은 후 그 계좌에서 출금을 해야함
					int outMoney = scanner.nextInt();
					int diff = accounts[i].getBalance() - outMoney;
					accounts[i].setBalance(diff);
					System.out.println("결과 : 출금 성공");
				} else {
					System.out.println("계좌 번호 없음");
				}

				// break;
			}

		}

	}

	static void accList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");

		
			for (int i = 0; i < accounts.length; i++) {

				if(accounts[i] != null) {
					System.out.println( accounts[i].getAccNo() +  "\t" + accounts[i].getAccName() +  "\t" +  accounts[i].getBalance() );	
				}
				
				
				

			
		}
		
	}

}
