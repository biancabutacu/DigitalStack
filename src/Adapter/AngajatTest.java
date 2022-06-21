package Adapter;


public class AngajatTest {

	public static void main(String[] args) {
		
String email = "marin.andreea@gmail.com";
		
		PunctajEvaluareCommiter punctajEvaluareCommiter = new PunctajEvaluareCommiter();
		
		punctajEvaluareCommiter.savePunctaj();
		
		punctajEvaluareCommiter = new PunctajEvaluareEmailAdapter(new PunctajEvaluareEmail(email));
		
		punctajEvaluareCommiter.savePunctaj();
	}

}
