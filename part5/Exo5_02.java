package darman.part5;

import java.util.Scanner;

public class Exo5_02 {

	public static void main(String[] args) {
		int nbr;

		Scanner clavier = new Scanner(System.in);
		System.out.println("Tappez un nombre entre (10-20) ");
		nbr = clavier.nextInt();

		while (!(nbr >= 10 && nbr <= 20)) {
			System.out.println("Retappez un nombre entre (10-20) : ");
			nbr = clavier.nextInt();
			if (nbr > 20) {
				System.out.println("« Plus petit ! »");

			} else if (nbr < 10) {
				System.out.println("« Plus grand ! »");
			}

		}
		System.out.println("Le nombre est : " + nbr);
	}

}
