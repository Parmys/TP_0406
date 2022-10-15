package darman.part5;

import java.util.Scanner;

public class Exo5_10 {

	public static void main(String[] args) {

		double prix = 0;
		double somme = 0;
		int cmp = 0;
		double reste;
		double due;

		Scanner clavier = new Scanner(System.in);
		System.out.println(" Calcul factures ");
		System.out.println(" Tappez 0 apres le dernier nombre tappée. ");

		// System.out.println(" Tappez les prix et apres le dernier prix 0 pour finir.
		// ");
		// prix = clavier.nextDouble();
		do {
			System.out.println(" Tappez les prix et apres le dernier prix 0 pour finir. ");
			prix = clavier.nextDouble();
			somme = somme + prix;
			cmp = cmp + 1;

		} while (prix != 0);

		System.out.println("la somme a payé est " + somme);
		// due = clavier.nextDouble();
		// reste = somme - due;
		do {

			System.out.println("PAYEZ SVP");
			due = clavier.nextDouble();

			reste = somme - due;
			System.out.println();
			System.out.println();
			System.out.println();

			if (reste > 0) {

				System.out.println(" Vous avez à payer  " + reste + "euros");
			}

		} while (reste != 0 && reste > 0);

		if (reste == 0) {
			System.out.println("Vous n' avez rien a payer : " + reste + "euros");

		} else if (reste < 0) {
			System.out.println(" Nous vous rendons   " + reste + "euros");
		}

	}

}
