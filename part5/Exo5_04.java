package darman.part5;

import java.util.Scanner;

public class Exo5_04 {

	public static void main(String[] args) {
		
		int nbr;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Tappez un nombre ");
		nbr = clavier.nextInt();
		
		for (int i=1; i<=10; i++) {
			
			nbr=nbr+1;
			System.out.println(nbr);
		}


	}

}
