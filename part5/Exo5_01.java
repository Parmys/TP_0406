package darman.part5;
import java.util.Scanner;

public class Exo5_01 {

	public static void main(String[] args) {
		
		int nbr;
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Tappez un nombre entre (0-3) : ");
		nbr=clavier.nextInt();
		
		while (!(nbr>=1 && nbr<=3)) {
			System.out.println("Retappez un nombre entre (0-3) : ");
			 nbr=clavier.nextInt();
			
		}
		
		System.out.println("Le nombre est : " + nbr);
		

	}

}
