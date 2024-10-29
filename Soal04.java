import java.util.Scanner;

public class Soal04 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini

        Scanner input = new Scanner(System.in);

        String nilai = input.nextLine();

        double perjam = 30000;

        switch (nilai) {
            case "DES":
                double jamkerjaDES = input.nextInt();
                if (jamkerjaDES >= 160 && jamkerjaDES <= 169) {
                    double bonus = (jamkerjaDES * perjam) * 0.05;
                    System.out.println(perjam * jamkerjaDES + 600000 + bonus);
                } else if (jamkerjaDES >= 175) {
                    double bonus7 = (jamkerjaDES * perjam) * 0.07;
                    System.out.println(perjam * jamkerjaDES + 600000 + bonus7);
                } else {
					System.out.println(perjam * jamkerjaDES + 1200000);
				}
                break;
            case "PRG":
                double jamkerjaPRG = input.nextInt();
                if (jamkerjaPRG >= 160 && jamkerjaPRG <= 169) {
                    double bonus = (jamkerjaPRG * perjam) * 0.05;
                    System.out.println(perjam * jamkerjaPRG + 1200000 + bonus);
                } else if (jamkerjaPRG >= 175) {
                    double bonus7 = (jamkerjaPRG * perjam) * 0.07;
                    System.out.println(perjam * jamkerjaPRG + 1200000 + bonus7);
                } else {
                    System.out.println(perjam * jamkerjaPRG + 1200000);
                }
                break;
            case "WRT":
                double jamkerjaWRT = input.nextInt();
                if (jamkerjaWRT >= 160 && jamkerjaWRT <= 169) {
                    double bonus = (jamkerjaWRT * perjam) * 0.05;
                    System.out.println(perjam * jamkerjaWRT + 400000 + bonus);
                } else if (jamkerjaWRT >= 175) {
                    double bonus7 = (jamkerjaWRT * perjam) * 0.07;
                    System.out.println(perjam * jamkerjaWRT + 400000 + bonus7);
                } else {
                    System.out.println(perjam * jamkerjaWRT + 400000);
                }
                break;
            case "MKT":
                double jamkerjaMKT = input.nextInt();
                if (jamkerjaMKT >= 160 && jamkerjaMKT <= 169) {
                    double bonus = (jamkerjaMKT * perjam) * 0.05;
                    System.out.println(perjam * jamkerjaMKT + 500000 + bonus);
                } else if (jamkerjaMKT >= 175) {
                    double bonus7 = (jamkerjaMKT * perjam) * 0.07;
                    System.out.println(perjam * jamkerjaMKT + 500000 + bonus7);
                } else {
                    System.out.println(perjam * jamkerjaMKT + 500000);
                }
        }
    }
}
