package Adapter;

public class PunctajEvaluareEmailAdapter extends PunctajEvaluareCommiter{
	
	PunctajEvaluareEmail punctajEvaluareEmail;

	public PunctajEvaluareEmailAdapter(PunctajEvaluareEmail punctajEvaluareEmail) {
		super();
		this.punctajEvaluareEmail = punctajEvaluareEmail;
	}
	
	public void savePunctaj() {
		this.punctajEvaluareEmail.EmailPunctaj();
	}

}
