package Observer;

import java.util.ArrayList;
import java.util.List;
//Subject class
public class FisaAngajat {
	
private List <Angajat> angajati = new ArrayList<Angajat>();
private String stare;

public String getStare() {
	return stare;
}

public void setStare(String stare) {
	this.stare = stare;
	notifyAllAngajati();
}

public void attach (Angajat angajat) {
	angajati.add(angajat);
}
public void notifyAllAngajati() {
	for(Angajat angajat : angajati) {
		angajat.update();
	}
}

}
