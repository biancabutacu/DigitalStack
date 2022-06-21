package DecoratorFisaEvaluare;



public abstract class FisaEvaluareDecorator implements FisaEvaluare {

	protected FisaEvaluare decoratedFisaEvaluare;

	public FisaEvaluareDecorator(FisaEvaluare decoratedFisaEvaluare) {
		this.decoratedFisaEvaluare = decoratedFisaEvaluare;
	}
	public void getEvaluare() {
		decoratedFisaEvaluare.getEvaluare();
	}
	
	
}
