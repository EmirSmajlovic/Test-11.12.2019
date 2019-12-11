
public class RacunarTest {

	public static void main(String[] args) {
		Racunar racunar = new Racunar (16, 100, 32.7, 24.00, 500.00);
		System.out.println(racunar.toString());
		System.out.println(racunar.izracunajCijenu());
		Laptop laptop = new Laptop (16, 100, 32.7, 24.00, 500.00, 15);
		System.out.println(laptop.toString());
		System.out.println(laptop.izracunajCijenu());
		

	}

}
