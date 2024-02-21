package jungsuk.ch06;

public class Ex6_23 {

	static int maxValue = Integer.MIN_VALUE;
	static int minValue = Integer.MIN_VALUE;

	static int max(int arr[]) throws Exception{
		
		if(arr==null || arr.length==0) {
			maxValue = -999999;
		}
		

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}

		}

		return maxValue;
	}

	public static void main(String[] args) {

		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		try {
			System.out.println("최대값 :" + max(data));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("최대값 :" + max(null));
		} catch (Exception e) {
			//System.out.println("매개 변수로 널은 안됨");
		}
		try {
			System.out.println("최대값 :" + max(new int[] {}));
		} catch (Exception e) {
			System.out.println("매개 변수로 널은 안됨");
		}
	}

}
