import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
        String DES, PRG, WRT, MKT;
		double total;

		Scanner input = new Scanner(System.in);

		String nilai = input.nextLine();

		double perjam = 30000;

		switch (nilai) {
			case "DES":
				double jamkerjaDES = input.nextInt();
				if (jamkerjaDES >= 160) {
					double bonus = jamkerjaDES * 0.05;
					System.out.println(perjam * jamkerjaDES + 600000 + bonus);
				} else if (jamkerjaDES >= 175) {
					double bonus7 = jamkerjaDES * 0.07;
					System.out.println(perjam * jamkerjaDES + 600000 + bonus7);
				}
				break;
			case "PRG":
				double jamkerjaPRG = input.nextInt();
				if (jamkerjaPRG >= 160) {
					double bonus = jamkerjaPRG * 0.05;
					System.out.println(perjam * jamkerjaPRG + 1200000 + bonus);
				} else if (jamkerjaPRG >= 175) {
					double bonus7 = jamkerjaPRG * 0.07;
					System.out.println(perjam * jamkerjaPRG + 1200000 + bonus7);
				} else {
					System.out.println(perjam * jamkerjaPRG + 1200000);
				}
				break;
			case "WRT":

		}
	}
}
