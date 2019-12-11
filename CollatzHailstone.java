import java.util.Scanner;

public class CollatzHailstone {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite pocetni broj: ");
		int pocetniBroj = unos.nextInt();
		System.out.println("Hailstone sekvenca za broj: " + pocetniBroj);
		do {
			if (pocetniBroj % 2 == 0) {
				pocetniBroj = pocetniBroj / 2;
				System.out.print(pocetniBroj + " ");
			} else if (pocetniBroj % 2 != 0) {
				pocetniBroj = (3 * pocetniBroj) + 1;
				System.out.print(pocetniBroj + " ");
			}
			;
		} while (pocetniBroj != 1);
		unos.close();
	}

}
