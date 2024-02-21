package ch18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2 {

	public static void main(String[] args) throws Exception {
		String filePath = "C:/Users/Administrator/eclipse-workspace/ex/src/ch01/verify/Example.java";

		FileReader fr = new FileReader(filePath);

		BufferedReader br = new BufferedReader(fr);

		int rowNumber = 0;
		String rowData;

		while (true) {
			rowData = br.readLine();
			if (rowData == null) {  //문자열의 경우 null이 끝임
				break;
			}

			System.out.println(++rowNumber + " : " + rowData);
		}

		br.close();
		fr.close();
	}

}
