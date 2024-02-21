package jungsuk.ch06;

import java.util.Arrays;

public class Ex6_20_1 {

	//섞어라라는 기능을 가짐 함수를 정의\
	static int[] shuffle(int arr[]){
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			//섞어라...값 교환(임시방 만들고 바꿔치기)
			int tmp=0;
			int random=(int)(Math.random()*arr.length);
			
			tmp=arr[i];
			arr[random]=tmp;
			
			
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		//함수 호출
		//섞을 대상(를) 
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		int result[]=shuffle(original);
		//System.out.println(result);
	}

}
