package jungsuk.ch07_2;

abstract class Unit {
	int x, y; // 현재 위치

	abstract void move(int x, int y);

	void stop() {
		
	};
}

class Marine extends Unit { // 보병
	// int x, y; // 현재 위치

	void stimPack() {
		/* . */} // 스팀팩을 사용한다

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub

	}


	
}

class Tank extends Unit { // 탱크

	void changeMode() {
		/* . */} // 공격모드를 변환한다

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub

	}

	
}

class Dropship extends Unit { // 수송선

	void load() {
		/* . */ } // 선택된 대상을 태운다

	void unload() {
		/* . */ } // 선택된 대상을 내린다

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub

	}

	
}

public class Ex7_17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
