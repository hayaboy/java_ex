package jungsuk.ch06;

import java.util.Arrays;

public class Ex6_23_1 {
	
	static int max(int arr[]){
		//최대값(최대값 변수
		int maxValue=Integer.MIN_VALUE;
		
		if(arr==null || arr.length==0) {
			return -999999 ;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
		}
		
		
		return maxValue;
	}
	

	public static void main(String[] args) {
//		int[] data = {3,2,9,4,7};
//		System.out.println(Arrays.toString(data));
//		System.out.println("최대값:"+max(data));
//		int result=max(null);
//		System.out.println(result);
		
		int result=max(new int[]{});
		System.out.println(result);
//		int arr[]=new int[] {};
//		System.out.println(arr.length);
		
		
		
	}

}
