package ch13_1;



public class ContainerEx {

	public static void main(String[] args) {
		
		Container<String, String> container1	= new Container<String, String>();
		
		container1.set("홍길동", "도적");
		
		String name=container1.getKey();
		System.out.println(name);	
		
		String value=container1.getValue();
		System.out.println(value);
		
		
		
		Container<String, Integer> container2	= new Container<>();
		
		container2.set("홍길동", 35);
		
		String name2=container2.getKey();
		System.out.println(name2);	
		
		int age=container2.getValue();
		System.out.println(age);
		
	}

}
