package DecoratorFisaInstruire;

public abstract class FisaInstruireDecorator implements FisaInstruire {

	protected FisaInstruire decoratedFisaInstruire;
	
	public FisaInstruireDecorator(FisaInstruire decoratedFisaInstruire) {
		
		this.decoratedFisaInstruire = decoratedFisaInstruire;
	
	}
	public void getDetaliiInstruire() {
		decoratedFisaInstruire.getDetaliiInstruire();
	}

}
