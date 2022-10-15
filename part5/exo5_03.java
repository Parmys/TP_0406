package darman.part5;
import java.util.Scanner;

public class exo5_03 {

	public static void main(String[] args) {
		
		int nbr;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Tappez un nombre ");
		nbr = clavier.nextInt();
		int i=1;
		
		while (i<=10) {
			nbr=nbr+1;
			i=i+1;
			System.out.println(nbr);	
		}

	}

}
