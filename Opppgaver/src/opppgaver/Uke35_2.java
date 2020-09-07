package opppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class Uke35_2 {

	public static void main(String[] args) {
		// Skriv et program som leser inn en pris og et beløp (begge heltall)
		// som er betalt og beregner hvor mange 10 og 1-kr kunden skal ha igjen
		// i vekslepenger slik kunden får færrest mulig antall mønter tilbake.
		// Hint: Operatoren % (modulo) gir rest ved heltalldivisjon.

		/*
		 * String prisTxt = showInputDialog ("Pris: "); int pris =
		 * Integer.parseInt(prisTxt);
		 * 
		 * String belopTxt = showInputDialog ("Beløp: "); int belop =
		 * Integer.parseInt(belopTxt);
		 * 
		 * //beregning int rest = belop - pris; int tikr = rest/10; int enkr =
		 * rest%tikr; System.out.println(rest);
		 * 
		 * 
		 * String utTxt= "Beløp tilbake: " + "\nTikroninger: " + tikr +
		 * "\nEnkroninger: " + enkr; showMessageDialog(null, utTxt);
		 */

		// Skriv program som beregner volum av en kule ved bruk av Math-biblioteket:

		/*
		 * String volumTxt = showInputDialog ("radius: "); double volum =
		 * Double.parseDouble (volumTxt); double firetre = 4.0/3; //beregning double
		 * volum1 = (firetre*PI); double volum2 = pow(volum, 3); double faktiskvol =
		 * volum1 * volum2; //output String utTxt= "Volumet av kulen: " + faktiskvol;
		 * showMessageDialog(null, utTxt);
		 */

		/*
		 * Lag et program som leser inn to tall a og b, og skriver ut verdien av a/b
		 * hvis ikke b er 0, og en feilmelding ellers (siden det ikke går an å dele med
		 * 0).
		 */
		// definere a og b, lage while-if (while b < 0, if b = 0 = feilmelding)

		/*
		 * String aTxt = showInputDialog ("a: "); double a = Double.parseDouble (aTxt);
		 * String bTxt = showInputDialog ("b: "); double b = Double.parseDouble (bTxt);
		 * double skrt = a/b;
		 * 
		 * 
		 * if (b > 0) { showMessageDialog (null, skrt + " b er større enn 0"); } else
		 * {String utTxt= "Feil i stykket"; showMessageDialog(null, utTxt);}
		 */

		/*
		 * Legg till to String variable som innholder korrekt brukernavne og passord.
		 * Bruk en if-setning til å sjekke om der er gitt korrekt login informasjon. For
		 * en tekststreng (String) s1 kan s1.equals(s2)
		 */

		/*
		 * String brukernavn = showInputDialog("Brukernavn :");
		 * 
		 * String passord = showInputDialog("Passord :");
		 * 
		 * String rb = ("123456"); String rp = ("abcdef");
		 * 
		 * if ((brukernavn.equals(rb)) && (passord.equals(rp))) {
		 * System.out.println("Riktig brukernavn og passord!");} else
		 * {System.out.println("Feil brukernavn og/eller passord!");
		 * 
		 * }
		 */
		/*
		 * Du skal lage et program som leser inn tre heltall fra brukeren, og skriver ut
		 * igjen tallene sortert i stigende rekkefølge. 1. Løs oppgaven ved bare å bruke
		 * if-setninger. 2. Løs oppgaven ved å bruke if-else-setninger.
		 */

		/*
		 * String tallTxt = showInputDialog ("Første tall: "); int tall =
		 * Integer.parseInt(tallTxt); String tall1Txt = showInputDialog
		 * ("Andre tall: "); int tall1 = Integer.parseInt(tall1Txt); String tall2Txt =
		 * showInputDialog ("Tredje tall: "); int tall2 = Integer.parseInt(tall2Txt);
		 * 
		 * //sortere tall //int min = min(tall, min(tall1,tall2)); if (tall <=
		 * min(tall1, tall2)) { System.out.println(tall + " " + min(tall1, tall2) + " "
		 * + max(tall1, tall2)); } if (tall1 < min(tall, tall2)) {
		 * System.out.println(tall1 + " " + min(tall, tall2) + " " + max(tall, tall2));
		 * } if (tall2 < min(tall, tall1) || ((tall1==tall2)&&(tall>tall2))) {
		 * System.out.println(tall2 + " " + min(tall1, tall) + " " + max(tall1, tall));
		 * }
		 */

		// En trinnskatt (tidligere toppskatt) er en progressiv skatt på brutto lønn som
		// beregnes når inntekten er høyere enn 164 100kr.
		// Lag et program som leser inn bruttoinntekt, beregner og skriver ut
		// trinnskatten.
		/*
		 * String salaryTxt = showInputDialog("Lønn: "); double salary =
		 * Double.parseDouble(salaryTxt);
		 * 
		 * int trinn = 180800; int trinn1 = 254500; // 180801 til 254500 er trinn 1 og
		 * man må skatte 1,9% på beløp i dette trinnet int trinn2 = 639750; // 254500
		 * til 639750 = trinn2, skatt =4,2% int trinn3 = 999550;
		 * 
		 * double ts1 = 0.019; double makst1 = (trinn1 - trinn) * ts1; double ts2 =
		 * 0.042; double makst2 = (trinn2 - trinn1) * ts2; double ts3 = 0.132; double
		 * makst3 = (trinn3 - trinn2) * ts3; double ts4 = 0.162;
		 * 
		 * if (salary <= trinn) { System.out.println("Ingen trinnskatt på beløpet " +
		 * (salary)); } else if (salary > trinn && salary <= trinn1) {
		 * System.out.println((salary - trinn) * ts1); } else if (salary > trinn1 &&
		 * salary < trinn2) { System.out.println((salary - trinn1) * ts2 + makst1); }
		 * else if (salary > trinn2 && salary < trinn3) { System.out.println((salary -
		 * trinn2) * ts3 + (makst1 + makst2)); } else if (salary > trinn3) {
		 * System.out.println((salary - trinn3) * ts4 + (makst1 + makst2 + makst3));
		 * 
		 * }
		 */

		// Lag et program som leser inn en poengsum (heltall) som en student har oppnådd
		// på en prøve,
		// og finn og skriv ut den karakteren A-F dette tilsvarer.
		// Grenser for de ulike karakterene skal være:

	/*	for (int i = 0; i < 10; i++) {
			
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
			} else if (poeng<0 || poeng>100) {
				i--;
				showMessageDialog(null, "Feilmelding 'Ugyldig poeng' \n Prøv på nytt");
			}*/
				
		String tallTxt = showInputDialog("Oppgi et heltall: ");
		int tall = Integer.parseInt(tallTxt);
		
		int n = tall;
		int x = 1;
		while (n>0) { 
			 x *= n--;

		}
		System.out.println(x);
}
}




