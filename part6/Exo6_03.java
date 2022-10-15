package darman.part6;

import java.util.Scanner;

public class Exo6_03 {

	public static void main(String[] args) {

		double notes[] = new double[9];
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saissez les 9 notes ");

		int i = 0;
		while (i < 9) {
			
			double note = clavier.nextDouble();
			notes[i]=note;
			
			System.out.println("\t" + note);
			i=i+1;
		}

	}

}
