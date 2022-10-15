package darman.part6;

public class Exo6_11 {

	public static void main(String[] args) {

		int produit = 0;
		int somme = 0;
		int tab1[] = { 4, 8, 7, 12 };
		int tab2[] = { 3, 6 };

		for (int i = 0; i < tab1.length; i++) {

			for (int j = 0; j < tab2.length; j++) {
				System.out.println();

				produit = tab1[i] * tab2[j];
				//System.out.print("\t"+produit);
				somme +=  tab1[i] * tab2[j];
				//System.out.println(somme + " = "+somme + " " + (tab1[i]  *   tab2[j]));
				System.out.println();
				System.out.println(somme);
			}

		}

	}

}
