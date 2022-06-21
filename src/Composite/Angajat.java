package Composite;

import java.util.ArrayList;
import java.util.List;



public class Angajat {
private String nume;
protected List<Angajat> subordonati;
public void setSubordonati(List<Angajat> subordonati) {
	this.subordonati = subordonati;
}
public void printNume() {
	System.out.println("Numele angajatului este:"+ nume);
}
public void addSubordonati(Angajat angajat) {
	if(subordonati==null) {
		subordonati=new ArrayList<Angajat>();
	}
	subordonati.add(angajat);
}
public void removeSubordonati(Angajat angajat) {
	subordonati.remove(angajat);
}
public List<Angajat> getSubordonati(){
	return this.subordonati;
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}

}