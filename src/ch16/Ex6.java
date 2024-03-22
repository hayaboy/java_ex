package ch16;

public class Ex6 {
	
	
	static double calc(Function fun) {
		return fun.apply(10,4);
	}
	

	public static void main(String[] args) {
		
		
		double result=calc(
				(x, y) ->{ return (x /y); }
			);
		
		
		System.out.println(result);

	}

}
