package darman.part5;

import java.util.Scanner;

public class Exo5_09 {

	public static void main(String[] args) {
		int position = 0;
		int nbr;
		int max=0;
		
		

		Scanner clavier = new Scanner(System.in);
		System.out.println("  Nombre sucessives ");
		System.out.println("  Tappez 0 apres le dernier nombre tappée. ");
		
		
		System.out.println(" Tappez un nombre SVP : ");
		nbr = clavier.nextInt();

		
			
		do {
			System.out.println(" Tappez un nombre SVP : ");
			nbr = clavier.nextInt();

				if(nbr>max) {
		
				max=nbr;			
				}
				
				position = position + 1;
				
				
			}while(nbr !=0);
		
			System.out.println("le nombre le plus grand est : " + max);
			System.out.println("C’était le nombre numéro : "+ position);
		

}
}