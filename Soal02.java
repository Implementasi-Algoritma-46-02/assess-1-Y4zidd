import java.util.Scanner;

public class Soal02 {
	public static Boolean PerlombaanInternasional(String Perlombaan) {
		String perlombaan = Perlombaan.toLowerCase();

		switch (perlombaan) {
			case "ada":
				return true;
			default:
				return false;
		}
	}

	public static Boolean HKIan(String Haki) {
		String haki = Haki.toLowerCase();

		switch (haki) {
			case "ada":
				return true;
			default:
				return true;
		}
	}

	public static Boolean EPRT(int totalNilaiEprt) {
		double totalnilaieprt = totalNilaiEprt;

		if (totalnilaieprt >= 450) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean MasaStudi(double totalMasaStudi) {
		double masastudi = totalMasaStudi;

		if (masastudi > 3.0) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean IPK35(double totalIPKdanStudi) {
		double nilaiIPK = totalIPKdanStudi;

		if (nilaiIPK > 3.5) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		// masa studi dan jumlah IPK
		double masaStudi = input.nextDouble();
		double nilaiIPK = input.nextDouble();
		int EPRT = input.nextInt();
		String HKI = input.nextLine();
		String PNI = input.nextLine();

		//print EPRT dan PNI
		Boolean masaStudi1 = MasaStudi(masaStudi);
		Boolean nilaiipk = IPK35(nilaiIPK);
		Boolean nilaieprt = EPRT(EPRT);
		Boolean HKInya = HKIan(HKI);
		Boolean perlombaan  = PerlombaanInternasional(PNI);

		//bandingkan dengan operasi logika
		Boolean nilaisemua = masaStudi1 && nilaiipk && nilaieprt && HKInya && perlombaan;

		if (nilaisemua == true) {
			System.out.println("Cumlaude");
		} else {
			System.out.println("Tidak cumlaude");
		}
	}
}
