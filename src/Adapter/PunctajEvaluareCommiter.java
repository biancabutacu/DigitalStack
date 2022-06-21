package Adapter;


public class PunctajEvaluareCommiter {
Double punctaj;
	
	public PunctajEvaluareCommiter() {
		super();
	}

	public PunctajEvaluareCommiter(Double punctaj) {
		super();
		this.punctaj = punctaj;
	}
	
	
	public Double getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(Double punctaj) {
		this.punctaj = punctaj;
	}

	public void savePunctaj() {
		setPunctaj(6.00);
		if(punctaj<5) {
			System.out.println("Nu ai promovat cursul");
		}
		else if(punctaj >=5 && punctaj<=10) {
			System.out.println("Felicitari! Ai promovat cursul cu punctajul de: " + getPunctaj());
		}
	}

}
