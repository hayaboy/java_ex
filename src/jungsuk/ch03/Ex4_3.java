package jungsuk.ch03;

public class Ex4_3 {

	public static void main(String[] args) {

		int tot1=0;
		int tot2=0;
		for(int i=1;i<=10;i++) {
			tot1=tot1+i;
			tot2=tot2+tot1;
		}

		System.out.println(tot2);
	}

}
