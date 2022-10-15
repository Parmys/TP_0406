package darman.part6;

import java.util.Scanner;

public class Exo6_13 {

	public static void main(String[] args) {
		int nbr = 0;
		int max;
		int val;

		Scanner clavier = new Scanner(System.in);
		System.out.println("Saissez le nombre de valeurs à saisir : ");
		nbr = clavier.nextInt();
		int tab[] = new int[nbr];

		System.out.println("Saissez " + nbr + " les valeurs : ");
		for (int i = 0; i < nbr; i++) {

			val = clavier.nextInt();
			System.out.println();
			tab[i] = val;

			System.out.println("\t" + tab[i]);
		}
		System.out.println("-----------------------");
		System.out.println("---------Recherche du maximum----------");
		System.out.println("------------------------");
		max=0;
		for (int k = 0; k < nbr; k++) {
			
			if (max < tab[k]) {
				max = tab[k];

			}

		}

		System.out.println();
		 System.out.println("le nombre de valeurs max est :" + max);

	}

}
