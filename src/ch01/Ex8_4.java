package ch01;

class NumberException extends RuntimeException {
}

class InvalidNumberException extends NumberException {
}

class NotANumberException extends NumberException {
}

public class Ex8_4 {

	static void method() throws InvalidNumberException, NotANumberException {
		System.out.println("hi");
	}

	public static void main(String[] args) {
//		try {
//			method();
//		}catch(Exception e) {
//				
//		}

//		try {
//			method();
//		}catch(NumberException e) {
//				
//		}catch(Exception e) {
//			
//	}

//		try {
//			method();
//		} catch (Exception e) {
//		} catch (NumberException e) {
//		}

//		try {
//			method();
//		} catch (InvalidNumberException e) {
//		} catch (NotANumberException e) {
//		}

//		try {
//			method();
//		} catch (NumberException e) {
//		}

//		try {
//			method();
//		} catch (RuntimeException e) {
//		}

	}

}
