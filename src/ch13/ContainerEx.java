package ch13;

public class ContainerEx {

	public static void main(String[] args) {
		
		Container<String> container1	= new Container<>();
		
		container1.setT("홍길동");
		
		String str=container1.getT();
		System.out.println(str);
		
Container<Integer> container2	= new Container<>();
		
		container2.setT(6);
		
		int num1=container2.getT();
		System.out.println(num1);
	}

}
