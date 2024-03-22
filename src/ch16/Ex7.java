package ch16;

public class Ex7 {

	static int scores[] = { 10, 50, 3, 50, 90, -3,3 };

	static int maxOrMin(Operator operator) {

		int result = scores[0];

		for (int score : scores) {
			result = operator.appy(result, score);
		}

		return result;
	}

	public static void main(String[] args) {

		// 최대값
		int max = maxOrMin((x, y) -> {
			if (x > y) {
				return x;
			} else if (x < y) {
				return y;
			} else {
				return x;
			}
		});
		System.out.println(max);
		
		// 최소값
				int min = maxOrMin((x, y) -> {
					if (x > y) {
						return y;
					} else if (x < y) {
						return x;
					} else {
						return x;
					}
				});
				
		
				System.out.println("최소값 :" +  min);
		

	}

}
