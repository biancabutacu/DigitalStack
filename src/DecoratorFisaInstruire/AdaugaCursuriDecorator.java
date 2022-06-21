package DecoratorFisaInstruire;

import java.util.ArrayList;
import java.util.List;

import Resources.Angajati;

public class AdaugaCursuriDecorator extends FisaInstruireDecorator {

	public AdaugaCursuriDecorator(FisaInstruire decoratedFisaInstruire) {
		super(decoratedFisaInstruire);
		
	}
	
	@Override
	public void getDetaliiInstruire() {
		decoratedFisaInstruire.getDetaliiInstruire();
		getAngajat(decoratedFisaInstruire);
		adaugaCursuri(decoratedFisaInstruire);
		modificaDetalii(decoratedFisaInstruire);
	}
	
	private void getAngajat(FisaInstruire decoratedFisaInstruire ) {
		
		System.out.println("Agajat: " + Angajati.Marin + " " + Angajati.Andreea);
	}
	
	protected void adaugaCursuri(FisaInstruire decoratedFisaInstruire ) {
		System.out.println("Cururi de urmat: ");
		List<String>cursuriList = new ArrayList<String>();
		cursuriList.add("BackEnd");
		cursuriList.add("FrontEnd");
		cursuriList.add("Securitatea sistemelor informationale");
		
		for(String cursuri: cursuriList) {
			System.out.println(cursuri);
		}	
	}
	
	private void modificaDetalii(FisaInstruire decoratedFisaInstruire ) {

	}
}
