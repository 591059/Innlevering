package innleveringer;

import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class innlevering1 {

	public static void main(String[] args) {

		// En trinnskatt (tidligere toppskatt) er en progressiv skatt på brutto lønn som
		// beregnes når inntekten er høyere enn 164 100kr.
		// Lag et program som leser inn bruttoinntekt, beregner og skriver ut
		// trinnskatten.

		String salaryTxt = showInputDialog("Lønn: ");
		double salary = Double.parseDouble(salaryTxt);

		int trinn = 180800;
		int trinn1 = 254500; // 180801 til 254500 er trinn 1 og man må skatte 1,9% på beløp i dette trinnet
		int trinn2 = 639750; // 25450 til 639750 = trinn2, skatt =4,2%
		int trinn3 = 999550;

		double ts1 = 0.019;
		double makst1 = (trinn1 - trinn) * ts1;
		double ts2 = 0.042;
		double makst2 = (trinn2 - trinn1) * ts2;
		double ts3 = 0.132;
		double makst3 = (trinn3 - trinn2) * ts3;
		double ts4 = 0.162;

		if (salary <= trinn) {
			System.out.println("Ingen trinnskatt på beløpet " + (salary));
		} else if (salary > trinn && salary <= trinn1) {
			System.out.println((salary - trinn) * ts1);
		} else if (salary > trinn1 && salary < trinn2) {
			System.out.println((salary - trinn1) * ts2 + makst1);
		} else if (salary > trinn2 && salary < trinn3) {
			System.out.println((salary - trinn2) * ts3 + (makst1 + makst2));
		} else if (salary > trinn3) {
			System.out.println((salary - trinn3) * ts4 + (makst1 + makst2 + makst3));

		}

		// Lag et program som leser inn en poengsum (heltall) som en student har oppnådd
		// på en prøve,
		// og finn og skriv ut den karakteren A-F dette tilsvarer.
		// Grenser for de ulike karakterene skal være:

		for (int i = 0; i < 10; i++) {

			String poengTxt = showInputDialog("Poeng: ");

			int poeng = Integer.parseInt(poengTxt);

			if (poeng >= 0 && poeng <= 39) {
				System.out.println("Karakter: F");
			} else if (poeng >= 40 && poeng <= 49) {
				System.out.println("Karakter: E");
			} else if (poeng >= 50 && poeng <= 59) {
				System.out.println("Karakter: D");
			} else if (poeng >= 60 && poeng <= 79) {
				System.out.println("Karakter: C");
			} else if (poeng >= 80 && poeng <= 89) {
				System.out.println("Karakter: B");
			} else if (poeng >= 90 && poeng <= 100) {
				System.out.println("Karakter: A");
			} else if (poeng < 0 || poeng > 100) {
				i--;
				showMessageDialog(null, "Feilmelding 'Ugyldig poeng' \n Prøv på nytt");
			}
			//Lag et program som leser inn et heltall n > 0, 
			//beregner verdien n! (n fakultet) og skriver verdien til n! der n! = 1\*2\*3\*…\*(n-1)\*n.
			String tallTxt = showInputDialog("Oppgi et heltall: ");
			int tall = Integer.parseInt(tallTxt);

			int n = tall;
			int x = 1;
			while (n > 0) {
				x *= n--;

			}
			System.out.println(x);
		}
	}

}
