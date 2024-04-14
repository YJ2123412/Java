package Excp;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1326318052697684665L;
	private String message;
	
	public CustomException() {
		
	}
	
	public CustomException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
