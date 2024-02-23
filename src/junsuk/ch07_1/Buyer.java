package junsuk.ch07_1;

public class Buyer {
	int money = 1000;
	Product cart[] = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0;
	
	void buy(Product p) {
		//가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다
		if(this.money < p.price) {
			System.out.println("잔액이 부족하여 을 를 살수 없습니다 Computer");
			return;
		}else { 		//가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고
			this.money = this.money-p.price;
		}
		//장바구니에 구입한 물건을 담는다 add 메서드 호출
		add(p);
	}
	
	void add(Product p) {
		//1.1 i의 값이 장바구니의 크기보다 같거나 크면	
	
		if(i>=cart.length) {
			//1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다
			Product newCart[]=new Product[2*cart.length];
			
			System.arraycopy(cart,0,newCart,0,cart.length);
			cart=newCart;
//			//1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다
//			for(int i=0;i<cart.length;i++) {
//				//1.1.3  새로운 장바구니와 기존의 장바구니를 바꾼다
//				newCart[i]=cart[i];
//				cart[i]=newCart[i];
//			}
			
		}
		
		
		// 1.2 물건을 장바구니(cart) 에 저장한다 그리고 i의 값을 증가시킨다
		cart[i++]=p;
		
	}
	
	
	
	void summary() {
		
		int tot=0;
		//장바구니에 담긴 물건들의 목록을 만들어 출력한다
		for(int i=0;i<cart.length;i++) {
			
			if(cart[i]==null)
				break;

			System.out.print(cart[i].toString() + " : " + cart[i].price);
			
			tot += cart[i].price;
		}

		//장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
		System.out.println("장바구니에 담김 물건 총합 : "  + tot);
		
		System.out.println("남은금액" + money);
		// 물건을 사고 남은 금액(money) 를 출력
		
	}
	
	
	
	
	
	
	
	
	
	
}
