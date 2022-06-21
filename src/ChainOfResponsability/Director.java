package ChainOfResponsability;

public class Director extends Decident{
    private String nume;
	@Override
	public void HandleRequest(Cerere cerere) {
		// TODO Auto-generated method stub
		if(cerere.getTipCerere() == TipCerere.DISPONIBILIZARE) {
			System.out.println("Directorii pot aproba cererile de disponibilizare"+getNume());
		}
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	

}
