package ch16;

import ch16.Button.ClickListener;

public class Ex5 {

	public static void main(String[] args) {		
		
		Button btnOk	=new Button();		
		
//		btnOk.setClickListener(
//				new ClickListener() {//
//					@Override
//					public void onClick() {//						
//						System.out.println("OK 버튼 클릭");//						
//					}					
//				}
//				);		
		
		btnOk.setClickListener(				
				() -> {
					System.out.println("OK 버튼 클릭###");
				}
				);		
		btnOk.click();
		
		System.out.println("===============");
		
		
		Button cancelBtn	=new Button();
		
		
		
		cancelBtn.setClickListener(				
				() -> {
					System.out.println("취소 버튼 클릭###");
				}
				);		
		cancelBtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
