package ChainOfResponsability;

public class Test {

	public static void main(String[] args) {
		
TeamLeader Crina = new TeamLeader();
Manager Andrei = new Manager ();
Director Costel = new Director();

Crina.setSuccessor(Andrei);
Andrei.setSuccessor(Costel);

System.out.println("----------");
Cerere cerere = new Cerere (TipCerere.CONCEDIU);
Crina.HandleRequest(cerere);


cerere = new Cerere (TipCerere.DISPONIBILIZARE);
Andrei.HandleRequest(cerere);

cerere = new Cerere (TipCerere.EVALUARE);
Costel.HandleRequest(cerere);
	
	}

}
