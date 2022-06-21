package Composite;

public class Client {

	public static void main(String[] args) {
		
Developer d1 = new Developer();
Developer d2 = new Developer();
Developer d3 = new Developer();
d1.setNume("Pricop Raluca");
d2.setNume("Percea Ruxandra");
d3.setNume("Mihaluta Andrei");

Manager manager = new Manager();
manager.setNume("Bran Ovidiu");

manager.addSubordonati(d1);
manager.addSubordonati(d2);
manager.addSubordonati(d3);

manager.printNume();
	}


}
