
public class Mobitel {
	String proizvodjac;
	String model;
	double brzinaProcesora;
	int brojJezgriProcesora;
	int kolicinaRamMemorije;
	int kolicinaMemorije;
	double brojMegapikselaKamere;
	String[] nizInstaliranihAplikacija = new String[20];

	Mobitel() {

	}

	public void instalirajAplikaciju(String imeAplikacije) {
		for (int i = 0; i < nizInstaliranihAplikacija.length; i++) {
			if (nizInstaliranihAplikacija[i] == null) {
				nizInstaliranihAplikacija[i] = imeAplikacije; break;
			} else {
				continue;
			}
		}
	}

	public void obrisiAplikaciju(String imeAplikacije) {
		for (int i = 0; i < nizInstaliranihAplikacija.length; i++) {
			if (nizInstaliranihAplikacija[i].equals(imeAplikacije)) {
				nizInstaliranihAplikacija[i] = null;
			}
		}
	}

	public void ispisiInstaliraneAplikacije() {
		for (int i = 0; i < nizInstaliranihAplikacija.length; i++) {
			if (nizInstaliranihAplikacija[i] == null) {continue;} 
			System.out.print(nizInstaliranihAplikacija[i] + " ");
		}
	}

	public void ubaciSDKarticu(int sdKartica) {
		kolicinaMemorije += sdKartica;
	}

	public String ispisiSpecifikaciju() {
		return "Proizvodjac: " + proizvodjac + "\nmodel" + model + "\nbrzinaProcesora" + brzinaProcesora
				+ "\nBroj jezgri procesora: " + brojJezgriProcesora + " \n Kolicina Ram Memorije" + kolicinaRamMemorije
				+ "\nKolicina memorije" + kolicinaMemorije + " \n broj megapiksela kamere" + brojMegapikselaKamere;
	}
}
