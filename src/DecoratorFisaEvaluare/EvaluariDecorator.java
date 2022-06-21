package DecoratorFisaEvaluare;


import java.util.ArrayList;
import java.util.List;

import Resources.Angajati;

public class EvaluariDecorator extends FisaEvaluareDecorator {

	public EvaluariDecorator(FisaEvaluare decoratedFisaEvaluare) {
		super(decoratedFisaEvaluare);
		
	}
	
	@Override
	public void getEvaluare() {
		decoratedFisaEvaluare.getEvaluare();
		getAngajat(decoratedFisaEvaluare);
		evaluareCompetente(decoratedFisaEvaluare);
		setCalificativ(5.0);
	}

	private void getAngajat(FisaEvaluare decoratedFisaInstruire ) {
		
		System.out.println("Agajat: " + Angajati.Marin + " " + Angajati.Andreea);
	}
	
	private void evaluareCompetente(FisaEvaluare decoratedFisaInstruire ) {
		System.out.println("Competente de evaluat:");
		
		List<String>competente = new ArrayList<String>();
		competente.add("Intelegerea sabloanelor de proiectare");
		competente.add("Intelegerea diagramelor de clase");
		competente.add("Intelegerea diagramelor cazurilor de utilizare");
		
		for(String competenta: competente) {
			System.out.println(competenta);
		}	
	}
	private double setCalificativ(double calificativ ) {
		System.out.println("Calificativ final: "  + calificativ );
		return calificativ;
	}


}
