package ch05;

public class Ex8 {

	public static void main(String[] args) {
		
//		int arr2d[][]=new int[3][3];
//		
//		arr2d[0][0]=20;
		
		
		int arr2d[][]=new int[][]{
								{95,86},
								{83,92,96},
								{78,83,93,87,88}
								};
								
		//누적합
		int total=0;
		
		int cnt=0;
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				//System.out.printf("%d %d  ", i,j);
//				System.out.printf("%d ", arr2d[i][j]);
				total += arr2d[i][j];
				cnt++;
			}
			System.out.println();
		}
		System.out.println(cnt);
		System.out.println(total);
		
		double avg =  (double)total / cnt ;
		System.out.println(avg);

	}

}
