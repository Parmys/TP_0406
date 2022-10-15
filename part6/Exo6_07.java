package darman.part6;

import java.util.Scanner;


public class Exo6_07 {

	public static void main(String[] args) {
		double notes[] = new double[9];
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saissez les 9 notes ");
		double somme=0;
		int i = 0;
		double moy;
		while (i < 9) {
			//Saisie
			double note = clavier.nextDouble();
			notes[i]=note;
			
			System.out.println("\t" + note);
			i=i+1;
		}
		System.out.println("\t  moyenne et affichage" );
		for(int j=0; j<9; j++) {
			
			somme=somme+notes[j];
		}
		moy=somme/7;
		System.out.println("la moyenne est :  " + (byte)moy);
	}

}
