package Proxy;

public class Client {

	public static void main(String[] args) {
		
		AccesFisaAngajat acces = new ProxyAccesFisaAngajat("Pricop Ovidiu");
		acces.permitereAcces();
	}

}
