package jungsuk.ch07;

class Unit {
}

class AirUnit extends Unit {
}

class GroundUnit extends Unit {
}

class Tank extends GroundUnit {
	void m1(){
		System.out.println("hi");
	}
}

class AirCraft extends AirUnit {
}

public class Ex7_15 {

	public static void main(String[] args) {
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		u=(Unit)ac;
		
//		GroundUnit gu=(GroundUnit) u;
//		AirUnit au = ac;
//		t=(Tank)u;
//		t.m1();  //자손타입으로 형변환은 허용되지 않으므로 실행시 에러가 발생한다.
		
		System.out.println("---------");
		//많일 자식의 것을  사용하고자 하면 자식 생성자를 이용하여 자식 주소 참조후 형변환해서 사용 
		u= new Tank();
		t=(Tank)u;
		t.m1();
		
		//GroundUnit gu = t;
	}

}
