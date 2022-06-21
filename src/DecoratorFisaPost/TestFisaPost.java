package DecoratorFisaPost;

public class TestFisaPost {

	public static void main(String[] args) {
		
		FisaPost fisaPostAngajat = new AdaugaCaracteristiciDecorator(new FisaPostTemp());
		
		fisaPostAngajat.getDetaliiPost();
	}

}
