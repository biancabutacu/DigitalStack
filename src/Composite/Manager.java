package Composite;

public class Manager extends Angajat {

	public void printNume() {
		System.out.println("Manager\n----------");
		super.printNume();
		System.out.println("Subordonati\n---------");
		subordonati.forEach(angajat -> angajat.printNume());
}
}
