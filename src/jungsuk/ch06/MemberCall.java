package jungsuk.ch06;

public class MemberCall {
	int iv = 10;
	static int cv = 20;

	int iv2 = cv;
	// static int cv2 = iv; // static 변수의 초기화에 인스턴스변수를 사용할 수 없다.

	static void staticMethod1() {
		System.out.println(cv);
		// System.out.println(iv); // B 라인
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // C 라인
	}

//	static void staticMethod2() {
//		staticMethod1();
//		instanceMethod1(); // D 라인
//		}

	void instanceMethod2() {
		staticMethod1(); // E 라인
		instanceMethod1();
	}

}
