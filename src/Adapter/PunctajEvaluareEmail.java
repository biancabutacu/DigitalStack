package Adapter;


public class PunctajEvaluareEmail {
public String emailAddress;

	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public PunctajEvaluareEmail(String emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}
	
	public void EmailPunctaj() {
		
		System.out.println("Email este: " + getEmailAddress());
	}

}
