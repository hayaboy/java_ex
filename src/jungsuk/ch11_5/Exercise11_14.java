package jungsuk.ch11_5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise11_14 {
	static ArrayList stuList = new ArrayList(); // 성적데이터를 저장할 공간
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			switch (displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				displayRecord();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다 .");
				System.exit(0);
			}
		}
	}

	static int displayMenu() {

		System.out.println("**************************************************");
		System.out.println("* 성적 관리 프로그램 *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println(" 1.학생성적 입력하기 ");
		System.out.println();
		System.out.println(" 2. 학생성적 보기 ");
		System.out.println();
		System.out.println(" 3.프로그램 종료 ");
		System.out.println();
		System.out.print(" 원하는 메뉴를 선택하세요.(1~3) : ");
		int menu = 0;

		do {

			try {
				menu = Integer.parseInt(s.nextLine().trim());

				if (1 <= menu && menu <= 3) {
					break;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("메뉴를 잘못 선택하셨습니다 다시 입력해주세요");
				System.out.print("원하는 메뉴 선택.(1~3) : ");
			}

		} while (true);

		return menu;
	}

	static void inputRecord() {
		System.out.println("1. 학생성적 입력하기 ");
		System.out.println(" 이름 반 번호 국어성적 영어성적 수학성적 의 순서로 공백없이 입력하세요.");
		System.out.println(" 입력을 마치려면 q를 입력하세요 메인화면으로 돌아갑니다.");

		while (true) {

			String input = s.nextLine().trim();
			Student stu = null;
			ArrayList arr = new ArrayList();
			if (!input.equalsIgnoreCase("q")) {
				System.out.print(">>");

				Scanner s2 = new Scanner(input);

				String temp = s2.nextLine();

				System.out.println("temp : " + temp);

				StringTokenizer token = new StringTokenizer(temp, ",");

				while (token.hasMoreTokens()) {
					// System.out.println(token.nextToken());
					String value = token.nextToken();
					arr.add(value);
				}

			} else {
				return;
			}
			// System.out.println(arr.get(0));
			String name = (String) arr.get(0);
			int ban = (int) arr.get(1);
			int no = Integer.parseInt((String) arr.get(2));
			int kor = Integer.parseInt((String) arr.get(3));
			int eng = Integer.parseInt((String) arr.get(4));
			int math = Integer.parseInt((String) arr.get(5));
			stu = new Student(name, ban, no, kor, eng, math);

			stuList.add(stu);
			System.out.println(" 입력을 마치려면 q .");
		}

	}

	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		int length = stuList.size();

		if (length > 0) {
			System.out.println();
			System.out.println(" 이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수 ");
			System.out.println("====================================================");
			for (int i = 0; i < length; i++) {
				Student student = (Student) stuList.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}
			System.out.println("====================================================");
			System.out.println(" 총점 : " + koreanTotal + " " + englishTotal + " " + mathTotal + " " + total);
			System.out.println();
		} else {
			System.out.println("====================================================");
			System.out.println(" 데이터가 없습니다 .");
			System.out.println("====================================================");
		}

	}

}
