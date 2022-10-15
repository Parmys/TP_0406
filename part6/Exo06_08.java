package darman.part6;

import java.util.Scanner;

public class Exo06_08 {

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

			System.out.println(tab[i]);
		}

		for (int j = 0; j < nbr; j++) {
			if (tab[j] < 0) {
				neg = neg + 1;

			} else if (tab[j] > 0) {
				pos = pos + 1;
			}

			
		}
		System.out.println("le nombre de valeurs positifs sont :" + pos);
		System.out.println("le nombre de valeurs negatifs sont :" + neg);

	}
}