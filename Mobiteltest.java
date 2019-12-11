
public class Mobiteltest {

	public static void main(String[] args) {
		Mobitel mobitel = new Mobitel();
		mobitel.instalirajAplikaciju("Spotify");
		mobitel.instalirajAplikaciju("Amazon");
		mobitel.obrisiAplikaciju("Amazon");
		mobitel.ispisiInstaliraneAplikacije();
		mobitel.ispisiSpecifikaciju();
		mobitel.ubaciSDKarticu(16);

	}

}
