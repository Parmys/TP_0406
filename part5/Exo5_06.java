package darman.part5;

import java.util.Scanner;

public class Exo5_06 {

	public static void main(String[] args) {
		int nbr;
		int somme = 0;
		
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println(" Calcul de somme d'un nombre ");
		System.out.println(" Tappez un nombre SVP : ");
		nbr = clavier.nextInt();
		for (int i = 1; i <= nbr; i++) {
			somme = somme + i;
			// System.out.println(somme);
		}

		System.out.println(somme);
	}

}
