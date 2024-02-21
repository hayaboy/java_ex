package ch04;

import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {
		
		
		//입력
		
		Scanner scanner=new Scanner(System.in);
		
		//계속 돌아야함 while
//		String inputStr=scanner.nextLine();
//		System.out.println(inputStr.equals("q"));
		
		
		//계좌 잔고 balance
		
		int balance=0;
		
		//flag (판단의 기준) 변수
		
		boolean flag=true;
		while(flag) {
			System.out.println("---------------------");
			System.out.println("1.예금  2.출금   3.잔고 4.종료");
			String inputStr=scanner.nextLine();
//			int inputStr=scanner.nextInt();
			
			int inputNum=Integer.parseInt(inputStr);
			
			if(inputNum==1) {
				System.out.print("예금할 금액 : ");
//				int inputMoney=scanner.nextInt();
				int inputMoney=   Integer.parseInt(scanner.nextLine());
				balance = balance + inputMoney;
			}else if(inputNum==2) {
				System.out.print("출금할 금액 : ");
				int outputMoney=Integer.parseInt(scanner.nextLine());
				
				if(outputMoney > balance) {
					System.out.println("잔고 부족");
				}else{
					balance = balance - outputMoney;
				}				
			}else if(inputNum==3){
				System.out.println("잔고 :" +balance );
			}else if(inputNum==4){
				flag=false;
				System.out.println("프로그램 종료");
			}else {
				System.out.println("1,2,3,4만 넣으세요");
			}
		}
		
		
	}

}
