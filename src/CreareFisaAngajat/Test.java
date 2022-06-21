package CreareFisaAngajat;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	
	List <Angajat> angajati = new ArrayList();
	Angajat Maria = new AngajatEvaluare();
	Maria.setNume("Popescu");
	Maria.setPrenume("Maria");
	Maria.setSalariuNet(4200);
	Maria.setNumarOreDeLucru(40);
	
	angajati.add(Maria);


	for(Angajat angajat : angajati) {
	IFisaAngajat e1 = FisaFactory.create(angajat);
	System.out.println(e1+"");
	}


	}

}
