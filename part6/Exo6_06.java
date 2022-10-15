package darman.part6;

public class Exo6_06 {

	public static void main(String[] args) {
		int Suite []=new int [7];
		Suite[0] = 1;
		Suite[1] = 1;
		
		for(int i=2; i<7; i++) {
			
			 Suite[i] = Suite[i-1] + Suite[i-2];
		}
		 System.out.println("Affichage  de la somme deux chiffres consécutifs ");
		
		for(int i=0; i<7; i++) {
			
			 System.out.println(Suite[i]);
		}
		

	}

}
