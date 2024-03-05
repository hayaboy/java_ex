package jungsuk.ch09;

public class Exercise9_4 {

	static void printGraph(int[] dataArr, char ch) {
		
		if(dataArr != null && dataArr.length != 0) {
		
			for(int i=0;i<dataArr.length;i++) {
//				System.out.print(dataArr[i]);
				for(int j=0;j<dataArr[i];j++) {
					System.out.print(ch);
				}
				System.out.println(dataArr[i]);
			}
		}
		
		
	}

	public static void main(String[] args) {
//		printGraph(new int[] { 3, 7, 1, 4 }, '*');
		printGraph(null, '*');
		printGraph(new int[] {}, '*');
	}

}
