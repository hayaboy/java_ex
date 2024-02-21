package ch11;

public class Ex11_5 {

//	static void method2() throws Exception{
//		Test.method1();
//		
//	}
	
	public static void main(String[] args) {

		Test test=new Test();		

		// 1)
//		try {
//			test.method1();
//		} catch (NumberFormatException | ClassNotFoundException e) {
//			
//		}

		// 2)
		try {
			test.method1();
		} catch (ClassNotFoundException e) {
			
		} catch (Exception e) {
			
		}

		
		//3)
//		try {
//			test.method1();
//		} catch (Exception e) {
//
//		}
		
		
		
		
		
		
	}

}
