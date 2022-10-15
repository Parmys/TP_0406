package darman.part6;

public class Exo6_10 {

	public static void main(String[] args) {
		int tab1[] = { 4, 8, 7, 9, 1, 5, 4, 6 };
		int tab2[] = { 7, 6, 5, 2, 1, 3, 7, 4 };
		int tab3[] = new int[8];

		for (int i = 0; i < 8; i++) {

			tab3[i] = tab1[i] + tab2[i];

		}

		for (int j = 0; j < 8; j++) {
			System.out.print("\t"+tab3[j]);
		}

	}

}
