import java.util.Scanner;

public class Soal02 {
	public static boolean isPerlombaanInternasional(String perlombaan) {
		return perlombaan.trim().toLowerCase().equals("ada");
	}

	public static boolean isHKIExist(String haki) {
		return haki.trim().toLowerCase().equals("ada");
	}

	public static boolean isEPRTValid(int totalNilaiEprt) {
		return totalNilaiEprt >= 450;
	}

	public static boolean isMasaStudiValid(double totalMasaStudi) {
		return totalMasaStudi <= 3.0;
	}

	public static boolean isIPKValid(double ipk) {
		return ipk >= 3.5;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double masaStudi = input.nextDouble();
		double nilaiIPK = input.nextDouble();
		int eprtScore = input.nextInt();
		input.nextLine();
		String hki = input.nextLine().trim();
		String pni = input.nextLine().trim();

		boolean isValidMasaStudi = isMasaStudiValid(masaStudi);
		boolean isValidIPK = isIPKValid(nilaiIPK);
		boolean isValidEPRT = isEPRTValid(eprtScore);
		boolean hasHKI = isHKIExist(hki);
		boolean hasPerlombaan = isPerlombaanInternasional(pni);

		boolean isCumlaude = isValidMasaStudi &&
				isValidIPK &&
				isValidEPRT &&
				hasHKI &&
				hasPerlombaan;

		System.out.println(isCumlaude ? "Cumlaude" : "Tidak cumlaude");
	}
}