package ch09;

public class Chatting {
	
	
	class Chatt{
		
		void start() {
			
		}
		
		void sendMessage(String message) {
			System.out.println(message);
		}
		
		
	}
	
	
	void startChat(final String chatID) {
		//final String nickName=null;
		String nickName=chatID;
		
		
		//nickName은 final 특성을 갖기 때문에 startChat() 메소드에서 nickName = chatId와 같이 
		//값을 변경할 수 없다
		
		
		
		Chatt chat=new Chatt() {
			@Override
			void start() {
				while(true) {
					String inputData="안녕";
					String message="[" + nickName + " ]" + inputData;
					sendMessage(message);
				}
			}
		};
		
		
		chat.start();
		
	}
	
	
	

}
