package darman.part4;

import java.util.Scanner;

public class Exo4_04 {

	public static void main(String[] args) {
		// Donnees
		float C1 = 0, C2 = 0, C3 = 0, C4 = 0;
		float Taux50 = 50;
		float Taux12 = 12;

		// SAISIE

		Scanner clavier = new Scanner(System.in);
		System.out.println("Tapez le score du 1er candidat");
		C1 = clavier.nextFloat();

		System.out.println("Tapez le score du 2eme candidat");
		C2 = clavier.nextFloat();

		System.out.println("Tapez le score du 3eme candidat");
		C3 = clavier.nextFloat();

		System.out.println("Tapez le score du 4eme candidat");
		C4 = clavier.nextFloat();

		if (C1 >= Taux50) {

			System.out.printf("le premier candidat est gagnant au premier tour");
		} else if (C1 >= Taux12 && (C2 > Taux50 || C3 > Taux50 || C4 > Taux50)) {

			System.out.printf("le premier candidat est en ballotage favorable");
		} else if (C1 < Taux12  && (C2 <=Taux50 || C3 <= Taux50 || C4 <= Taux50)) {

			System.out.printf("le premier candidat est en ballotage défavorable");
		}

	}

}
