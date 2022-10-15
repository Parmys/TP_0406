package darman.part5;

import java.util.Scanner;

public class Exo5_05 {

	public static void main(String[] args) {
		int Mul;
		int Produit;
		Scanner clavier = new Scanner(System.in);
		System.out.println(" Tappez un multiplicateur SVP :");
		Mul = clavier.nextInt();
		System.out.println(" \t \t \t la table de Multiplication de " + Mul);
		for (int i = 0; i <= 10; i++) {

			Produit = Mul * i;
			System.out.println(Mul + " x " + i + "=" + Produit);

		}

	}

}
