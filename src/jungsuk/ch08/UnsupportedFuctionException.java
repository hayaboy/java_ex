package jungsuk.ch08;

public class UnsupportedFuctionException extends RuntimeException {

	static final private int ERR_CODE= 100;
	
	
	
	public UnsupportedFuctionException() {
		
	}
	
	
	public UnsupportedFuctionException(String msg, int err_code) {
		super(msg);
		 getMessage();
	}
	
	
	
	public int getErrorCode(){
		return ERR_CODE;
	}
	
	public String getMessage(){
		
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}
