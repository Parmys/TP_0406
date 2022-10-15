package darman.part4;

import java.util.Scanner;

public class Exo4_02 {

	public static void main(String[] args) {

		// Données
		int h = 00;
		int mn = 00;

		// Saisie
		Scanner clavier = new Scanner(System.in);

		System.out.println("Donnez l'heure actuelle sous forme : " + "hh puis mn");
		h = clavier.nextInt();
		mn = clavier.nextInt();
		// System.out.println(h+"heure(s)"+mn);

		while (!(h >= 0 && h <= 24) || !(mn >= 0 && mn <= 60)) {
			System.out.println("entrez une heure entre 0 et 24 et entre 0 et 60 minutes");
			h = clavier.nextInt();
			mn = clavier.nextInt();
		}

		if ((mn == 60) || (h == 24)) {
			mn = 01;
			h = 01;
			
			System.out.println("Dans une minute, il sera (version 1) " + h + "heure(s)" + " " + mn);
		}else {
			mn=mn+1;
			System.out.println("Dans une minute, il sera " + h + "heure(s)" + " " + mn);
		}

	}
}
