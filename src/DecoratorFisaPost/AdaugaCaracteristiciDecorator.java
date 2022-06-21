package DecoratorFisaPost;

import java.util.ArrayList;
import java.util.List;

import Resources.Angajati;
import Resources.Departament;
import Resources.Posturi;

public class AdaugaCaracteristiciDecorator extends FisaPostDecorator {

	public AdaugaCaracteristiciDecorator(FisaPost decoratedFisaPost) {
		super(decoratedFisaPost);
		
	}
	
	@Override 
	public void getDetaliiPost() {
		
		decoratedFisaPost.getDetaliiPost();
		getAngajat(decoratedFisaPost);
		setDepartament(decoratedFisaPost);
		setPost(decoratedFisaPost);
		System.out.println("Vechime: " + getVechime(decoratedFisaPost) + " ani");
		adaugaClauze(decoratedFisaPost);
		
		
	}
	private void getAngajat(FisaPost decoratedFisaPost ) {
		
		System.out.println("Agajat: " + Angajati.Marin + " " + Angajati.Andreea);
	}
	
	private void setDepartament(FisaPost decoratedFisaPost) {
		
		System.out.println("Departamentul:" + Departament.Dezvoltare);
		
	}
	
	private void setPost(FisaPost decoratedFisaPost) {
		
		System.out.println("Post:" + Posturi.Backend);
		
	}
	
	private double getVechime(FisaPost decoratedFisaPost) {
		return 5.0; 
	}
	
	private void adaugaClauze(FisaPost decoratedFisaPost) {
		List<String>clauzeList = new ArrayList<String>();
		clauzeList.add("Daca urmezi un curs si il promovezi nu ai voie sa parasesti firma timp de 6 luni.");
		clauzeList.add("Daca angajatul primeste echipamente pentru desfasurarea activitatea, acesta are obligatia\n" +
		"ca la finalul perioadei contractuale sa le inapoieze.");
		System.out.println("Clauze contractuale:");
		for(String clauze: clauzeList) {
			System.out.println(clauze);
		}
		
		
	}
	

}
