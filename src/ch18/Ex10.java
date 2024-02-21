package ch18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) throws Exception {

		//원본 파일 경로와 복사 파일 경로 입력 받고 원본 파일을 복사하는 프로그램(바이트 기반 스트림과 성능 향상 보조스트림 반드시 사용)
		
		//조건 : 
		//1)원본파일이 존재하지 않을 경우, " 원본 파일이 존재하지 않습니다."를 출력
		//2)복사파일 경로에서 디렉토리가 존재하지 않으면 경로상의 모든 디렉토리를 자동 생성
		//3)복사가 성공되었을 때 "복사가 성공되었습니다."를 출력
		
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("원본 파일 경로:");
		String inputPath=sc.nextLine();	
		System.out.print("복사 파일 경로:");
		String copyPath=sc.nextLine();
		
	
		try {
			//이미지 파일 읽기
			
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputPath));
			
			//이미지 파일 쓰기
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyPath));
			
			byte buff[]=new byte[100];
			
			while(true) {
				int data=bis.read(buff);
				if(data==-1) {
					break;
				}
				bos.write(buff, 0, data);
				
			}
			System.out.println("복사 성공");
			bis.close();
			bos.close();
		} catch (FileNotFoundException e) {
			System.out.println("원본 파일이 존재하지 않습니다.");
		}
		
		
		
	}

}
