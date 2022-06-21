package CreareFisaAngajat;



public class FisaFactory {
	public static IFisaAngajat create(Angajat angajat) {
		if(angajat instanceof AngajatInstruire) {
			return new FisaInstruire();
		}
		if(angajat instanceof AngajatEvaluare) {
			return new FisaEvaluare();
		}
		if(angajat instanceof AngajatPost) {
			return new FisaPost();
		}
		
		throw new RuntimeException("Tipul angajatului nu este valid!");
	}
}
