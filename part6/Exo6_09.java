package darman.part6;

public class Exo6_09 {

	public static void main(String[] args) {
		
		
		System.out.println("Calcul la somme des valeurs d'un tableau ");
		int tab []= {12, 15, 4, 8, 18, 9};
		int somme=0;
		for (int i=0; i<6; i++) {
			somme= somme+tab[i]; 
			 
		 }
		System.out.println(somme);
	}

}
