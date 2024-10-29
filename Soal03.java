import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		int H,M,V;

		Scanner sc = new Scanner(System.in);

		H = sc.nextInt(); // jam
		M = sc.nextInt(); // minute
		V = sc.nextInt(); // minute tambahan

		int total = M + V;
		int totalM = total % 60;
		int totalS = total / 60;

		System.out.println(H + totalS + ":" + totalM);


	}
}
