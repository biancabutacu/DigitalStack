package TaxeSiImpoziteFacade;

public class TranzactieFacade {
private ITaxeSiImpozite CAS;
private ITaxeSiImpozite CASS;
private ITaxeSiImpozite CAM;
private ITaxeSiImpozite CotizatieSindicala;
private ITaxeSiImpozite ImpozitPeVenit;

public TranzactieFacade () {
	CAS = new CAS();
	CASS = new CASS();
	CAM = new CAM();
	CotizatieSindicala = new CotizatieSindicala();
	ImpozitPeVenit = new ImpozitPeVenit();
}

public void CalculeazaCAS () {
	CAS.calculeazaRetineri();
}

public void CalculeazaCASS () {
	CASS.calculeazaRetineri();
}

public void CalculeazaCAM() {
	CAM.calculeazaRetineri();
}

public void CalculeazaCotizatieSindicala () {
	CotizatieSindicala.calculeazaRetineri();
}

public void CalculeazaImpozitPeVenit() {
	ImpozitPeVenit.calculeazaRetineri();
}
}
