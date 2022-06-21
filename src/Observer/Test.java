package Observer;

public class Test {
	
	public static void main (String[] args) {
FisaAngajat fisaAngajat = new FisaAngajat();

new AngajatConcrete(fisaAngajat);


System.out.println("Stare initiala: activa ");
fisaAngajat.setStare("activa");

System.out.println("Prima schimbare: disponibilizata ");
fisaAngajat.setStare("disponibilizata");
}
}
