package darman.part4;

public class Exo4_01 {

	public static void main(String[] args) {

		int Tutu, Toto;
		String Tata = "KO";

		Tutu = 4;
		Toto = 5;

		if (Tutu > (Toto + 4)) {
			if (Tata.equals("OK")) {

				Tutu = Tutu + 1;
				System.out.println(Tutu);
			} else {

				Tutu = Tutu - 1;

				System.out.println(Tutu);
			}

		}

	}

}

/*
 * Si Tutu > Toto + 4 OU Tata = "OK" Alors Tutu ← Tutu + 1 Sinon Tutu ← Tutu – 1
 * Finsi
 */