package DecoratorFisaEvaluare;



public class TestFisaEvaluare {

	public static void main(String[] args) {
		FisaEvaluare fisaEvaluareAngajat = new EvaluariDecorator(new FisaEvaluareTemp());
		
		fisaEvaluareAngajat.getEvaluare();
		
	}

}
