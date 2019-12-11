import java.util.Scanner;
public class Posljednikarakter {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite vasu poruku: ");
		String poruka = unos.nextLine();
		System.out.println("Unesite karakter: ");
		
		char[] arr = new char[poruka.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = poruka.charAt(i);
			
		}

	}

}
