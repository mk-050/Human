package jp.co.diworks.action;

public class HumanName {
	
	private String firstName;
	public String lastName;
	
	
	public String getName() {
		firstName = "山田";
	    lastName = "太郎";
		
		String myName = firstName + lastName;
		return myName;
	}

}
