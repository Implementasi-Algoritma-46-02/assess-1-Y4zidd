import java.util.Scanner;

public class Soal01 {
	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		int DigitPertama = input.nextInt();
		int DigitKedua = input.nextInt();
		int DigitKetiga = input.nextInt();
		int DigitKeempat = input.nextInt();
		int DigitKelima = input.nextInt();

		if (DigitPertama < DigitKedua) {
			System.out.println(DigitPertama + " valid");
		} else {
			System.out.println(DigitPertama + " tidak valid");
		}

        if (DigitKedua < DigitPertama) {
			System.out.println(DigitKedua + " valid");
		} else {
			System.out.println(DigitKedua + " tidak valid");
		}

		if (DigitKetiga > DigitKedua) {
			System.out.println(DigitKetiga + " valid");
		} else {
			System.out.println(DigitKetiga + " tidak valid");
		}

		if (DigitKeempat > DigitKetiga) {
			System.out.println(DigitKeempat + " valid");
		} else {
			System.out.println(DigitKeempat + " tidak valid");
		}

		if (DigitKelima > DigitKeempat) {
			System.out.println(DigitKelima + " valid");
		} else {
			System.out.println(DigitKelima + " tidak valid");
		}
	}
}
