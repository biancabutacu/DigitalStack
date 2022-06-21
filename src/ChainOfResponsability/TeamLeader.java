package ChainOfResponsability;

public class TeamLeader extends Decident {

	@Override
	public void HandleRequest(Cerere cerere) {
		// TODO Auto-generated method stub
		if(cerere.getTipCerere() == TipCerere.EVALUARE) {
			System.out.println("TeamLeaderii pot aproba cererile de evaluare");
		}
		else {
			successor.HandleRequest(cerere);
		}
	
	}
	

}
