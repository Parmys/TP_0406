package darman.part6;

import java.util.Scanner;

public class Exo6_14 {

	public static void main(String[] args) {
		int nbr = 0;
		double moy;
		double note;

		Scanner clavier = new Scanner(System.in);
		System.out.println("Saissez le nombre de valeurs à saisir : ");
		nbr = clavier.nextInt();
		double notes[] = new double[nbr];

		System.out.println("Saissez " + nbr + " des notes : ");
		for (int i = 0; i < nbr; i++) {

			note = clavier.nextDouble();
			System.out.println();
			notes[i] = note;

			System.out.println("\t" + notes[i]);
		}
		System.out.println("-----------------------");
		System.out.println("---------Recherche du notes audessus de la moyenne----------");
		System.out.println("------------------------");
		
		for (int k = 0; k < nbr; k++) {

			if (notes[k] > 10) {
				System.out.println(" les notes audessus de la moyenne : " + notes[k]);

			}

		}

		

	}

}
