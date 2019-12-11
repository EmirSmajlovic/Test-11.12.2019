
public class Racunar {
	int kolicinaRama;
	int kapacitetHD;
	double brzinaProcesora;
	double dijagonalaMonitora;
	double nabavnaCijena;
	
	public Racunar (int kolicinaRama, int kapacitetHD, double brzinaProcesora, double dijagonalaMonitora, double nabavnaCijena) {
		this.kolicinaRama = kolicinaRama;
		this.kapacitetHD = kapacitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
	}

	
	public double izracunajCijenu () {
		return nabavnaCijena * 1.10;
	}
	
	public String toString () {
		return kolicinaRama + "GB " + kapacitetHD + "GB " + brzinaProcesora + "GHz " + dijagonalaMonitora + "inch " + nabavnaCijena + "KM";  
	}
}
