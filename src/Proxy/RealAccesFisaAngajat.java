package Proxy;

public class RealAccesFisaAngajat implements AccesFisaAngajat{

	private String numeAngajat;
	public RealAccesFisaAngajat(String numeAngajat) {
		this.numeAngajat=numeAngajat;
	}
	@Override
	public void permitereAcces() {
		System.out.println("Accesul la fisa angajatului s-a permis pentru:"+ numeAngajat);
		
	}

}
