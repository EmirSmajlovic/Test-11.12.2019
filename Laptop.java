
public class Laptop extends Racunar {
	
	int trajanjeBaterije;
	
	Laptop (int kolicinaRama, int kapacitetHD, double brzinaProcesora, double dijagonalaMonitora, double nabavnaCijena, int trajanjeBaterije) {
		super(kolicinaRama, kapacitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);
		this.trajanjeBaterije = trajanjeBaterije;
		
		
	}
	
	@Override 
	public double izracunajCijenu () {
		return nabavnaCijena * 1.15;
	}
	
	@Override
	public String toString () {
		return kolicinaRama + "GB " + kapacitetHD + "GB " + brzinaProcesora + "GHz " + dijagonalaMonitora + "inch " + trajanjeBaterije + "hr " + nabavnaCijena + "KM"  ;
	}
}
