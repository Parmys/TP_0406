package darman.part4;
import java.util.Scanner;
public class Exo4_03 {

	public static void main(String[] args) {
		
		//Données
		
		int nbr;
		double res;
		double DIX= 0.10;
		double VINGHT= 0.09;
		double PLUS= 0.08;
		int soustraction;
		Scanner clavier = new Scanner(System.in);

		System.out.println("Tapez le nombre de copies que voulez-vous ? : ");
		nbr = clavier.nextInt();
		
		if(nbr<=10) {
			res=nbr*DIX;
			System.out.println("la facture est : " + res + "euros");
		}else if(nbr <=30) {
			soustraction=nbr-10;
			res=nbr*DIX+soustraction*VINGHT;
			System.out.println("la facture est : " + res + "euros");
		}else if(nbr>30) {
		soustraction=nbr-30;
		res=10*DIX+20*VINGHT+soustraction*PLUS;
		System.out.println("la facture est : " + res + "euros");	
		}
	}

}

/*Un magasin de reprographie facture 0,10 E les dix premières photocopies,
 *  0,09 E les vingt suivantes et 0,08 E au-delà.
 *   Ecrivez un algorithme qui demande à l’utilisateur 
 * le nombre de photocopies effectuées et qui affiche la facture correspondante.*/
