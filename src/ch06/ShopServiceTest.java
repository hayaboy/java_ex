package ch06;

public class ShopServiceTest {

	public static void main(String[] args) {
	
		//new ShopService();

		
		ShopService obj1=ShopService.getInstance();
		
		System.out.println(obj1); //6f2b958e
		
		ShopService obj2=ShopService.getInstance();
		
		System.out.println(obj2); //6f2b958e
		
		if(obj1==obj2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
	}

}
