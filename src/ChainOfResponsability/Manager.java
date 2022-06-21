package ChainOfResponsability;

public class Manager extends Decident {

	@Override
	public void HandleRequest(Cerere cerere) {
		// TODO Auto-generated method stub
		if(cerere.getTipCerere() == TipCerere.CONCEDIU) {
			System.out.println("Managerii pot aproba cererile de concedii");
		}
		else {
			successor.HandleRequest(cerere);
		}
	}
	
 
}
