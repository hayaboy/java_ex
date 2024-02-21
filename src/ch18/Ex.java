package ch18;

import java.io.BufferedReader;

import java.io.FileReader;

public class Ex {

	
	public static void main(String[] args) throws Exception{
		String filePath="C:/Users/Administrator/eclipse-workspace/ex/src/ch01/verify/Example.java";
		
	
			FileReader fr =   new FileReader(filePath);
			
			BufferedReader br	= new BufferedReader(fr);
			
			int rowNumber = 0 ;
			String rowData;
			
			while(true) {
				int data=br.read();
				if(data==-1) {
					break;
				}
		
				
				System.out.print((char)data);
			}
		
			br.close();
			fr.close();
	}
}
