package Observer;


public class AngajatConcrete extends Angajat {
//Concrete Observer
	public AngajatConcrete(FisaAngajat fisaAngajat) {
		this.fisaAngajat = fisaAngajat;
		this.fisaAngajat.attach(this);
	}

@Override
public void update() {
	// TODO Auto-generated method stub
	System.out.println("Angajat Concrete: "
	+ fisaAngajat.getStare());
}
}
