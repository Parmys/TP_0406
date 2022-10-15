package darman.part6;

import java.util.Scanner;

public class Exo6_12 {

	public static void main(String[] args) {
		int nbr = 0;
		int val;
		int pos = 0, neg = 0;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saissez le nombre de valeurs à saisir : ");
		nbr = clavier.nextInt();
		int tab[] = new int[nbr];

		System.out.println("Saissez " + nbr + " les valeurs : ");
		for (int i = 0; i < nbr; i++) {

			val = clavier.nextInt();
			System.out.println();
			tab[i] = val;

			System.out.println("\t"+ tab[i]);
		}
		System.out.println("-----------------------");
		System.out.println("---------Avant----------");
		System.out.println("------------------------");
		for (int k = 0; k < nbr; k++) {

			System.out.print("\t" + tab[k]);

		}
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("-------Apres ajout +1 -----------");
		System.out.println("------------------------");

		for (int k = 0; k < nbr; k++) {
			tab[k] = tab[k] + 1;
			System.out.print("\t"+tab[k]);

		}

		for (int j = 0; j < nbr; j++) {
			if (tab[j] < 0) {
				neg = neg + 1;

			} else if (tab[j] > 0) {
				pos = pos + 1;
			}

		}
		System.out.println();
		System.out.println("le nombre de valeurs positifs sont :" + pos);
		System.out.println("le nombre de valeurs negatifs sont :" + neg);

	}

}
