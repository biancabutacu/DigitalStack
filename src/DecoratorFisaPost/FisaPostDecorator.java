package DecoratorFisaPost;

public abstract class FisaPostDecorator implements FisaPost {
	
	protected FisaPost decoratedFisaPost;
	
	public FisaPostDecorator(FisaPost decoratedFisaPost ) {
		
		this.decoratedFisaPost = decoratedFisaPost;
	
	}
	
	public void getDetaliiPost() {
		
		decoratedFisaPost.getDetaliiPost();
	
	}

}
