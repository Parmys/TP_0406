package darman.part5;

import java.util.Scanner;

public class Exo5_08 {

	public static void main(String[] args) {
		int nbr1;
		int nbr2;
		int temp = 0;

		Scanner clavier = new Scanner(System.in);
		System.out.println(" 20 nombre sucessives ");
		int position=0;
		for (int i = 1; i <= 20; i++) {
			System.out.println(" Tappez un nombre SVP : ");
			nbr1 = clavier.nextInt();
			
			position=position + 1;
			//System.out.println("C’était le nombre numéro : "+ position);
			System.out.println(" Retappez un nombre SVP : ");
			nbr2 = clavier.nextInt();
			
			//for (int j = 1; j <= 5; j++) {
				if (nbr1 > nbr2) {
					temp = nbr1;
				} else if (nbr1 < nbr2) {
					temp = nbr2;

				} else if (nbr1 == nbr2) {
					temp = nbr1;
					temp = nbr2;
				}
			}

			//System.out.println("le nombre le plus grand est : " + temp);
		
			System.out.println("le nombre le plus grand est : " + temp);
			System.out.println("C’était le nombre numéro : "+ position);
}

}



