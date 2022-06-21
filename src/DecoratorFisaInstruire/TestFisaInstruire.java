package DecoratorFisaInstruire;



public abstract class TestFisaInstruire {

	public static void main(String[] args) {
		
		FisaInstruire fisaInsteuireAngajat = new AdaugaCursuriDecorator(new FisaInstruireTemp());
		
		fisaInsteuireAngajat.getDetaliiInstruire();
	}

}
