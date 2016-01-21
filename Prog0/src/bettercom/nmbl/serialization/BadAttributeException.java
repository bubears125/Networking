package bettercom.nmbl.serialization;

public class BadAttributeException extends java.lang.Exception{
	
	private String attribute;
	
	public BadAttributeException(String message, String attribute){
		
	}
	
	public BadAttributeException(String message, String attribute, Throwable cause){
		
	}
	
	public String getAttribute(){
		return attribute;
	}
}
