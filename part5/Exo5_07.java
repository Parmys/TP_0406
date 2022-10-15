package darman.part5;
import java.util.Scanner;
public class Exo5_07 {

	public static void main(String[] args) {
		
		int nbr;
		int factoriel=1;
		
		Scanner clavier = new Scanner(System.in);
		System.out.println(" Calcul de la factorielle ");
		System.out.println(" Tappez un nombre SVP : ");
		nbr = clavier.nextInt();
		
		for (int i = 1; i <= nbr; i++) {
			factoriel = factoriel * i;
			System.out.println(factoriel + "!");
		}
		System.out.println();
		System.out.println();
		System.out.println("factoriel de " + nbr+"!"+ "donne " + factoriel + "!");
	}

}
