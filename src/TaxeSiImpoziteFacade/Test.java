package TaxeSiImpoziteFacade;

public class Test {
	public static void main(String[] args) {
		TranzactieFacade tranzactie = new TranzactieFacade();
		
		tranzactie.CalculeazaCAM();
		tranzactie.CalculeazaCAS();
		tranzactie.CalculeazaCASS();
		tranzactie.CalculeazaCotizatieSindicala();
		tranzactie.CalculeazaImpozitPeVenit();
	}

}
