package Proxy;

public class ProxyAccesFisaAngajat implements AccesFisaAngajat {

	private String numeAngajat;
	private RealAccesFisaAngajat acces;
	public ProxyAccesFisaAngajat (String numeAngajat) {
		
	}
	@Override
	public void permitereAcces() {
		if(getRol(numeAngajat)>4) {
			acces=new RealAccesFisaAngajat(numeAngajat);
			acces.permitereAcces();
		}
		else {
			System.out.println("Nu se permite accesul la fisa angajatului deoarece nivelul tau de job este sub 5");
			
		}
	}
	public int getRol(String numeAngajat) {
		return 9;
	}
}

