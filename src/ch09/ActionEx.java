package ch09;

public class ActionEx {

	public static void main(String[] args) {
		
		
		
		
		Action action = new Action() {

		@Override
		public void work() {
			System.out.println("복사함");
			
		}
		
	};
		
		action.work();

	}

}
