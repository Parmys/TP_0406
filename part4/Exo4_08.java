package darman.part4;
import java.util.Scanner;


public class Exo4_08 {

	public static void main(String[] args) {
		
		int  bissextile=366; //jours; divisible par 4  et fevrier est 29j  div par 400 pas 100
		int fevrierbix=29;// jours
		int mois=0;
		int jours=0;
		int annee=0;
		//Saisie
		
				Scanner clavier = new Scanner(System.in);
				System.out.println("Tappez le jour (0-31) : ");
				jours=clavier.nextInt();
				
				System.out.println("Tappez le mois (1-12): ");
				mois=clavier.nextInt();
				
				
				System.out.println("Tappez l'anneé : ");
				annee=clavier.nextInt();
				
				while (!((jours >=1 && jours<=31) && (mois <=1 && mois >=12) && (annee >=1 && annee <=2022 ))) {
				
					System.out.println("Tappez une date valide ");
					System.out.println("Tappez le  jours ");
					jours=clavier.nextInt();
					System.out.println("Tappez une le mois ");
					mois=clavier.nextInt();
					System.out.println("Tappez une date valide annee ");
					annee=clavier.nextInt();
				     
				}
				
				
				System.out.println(" la date tapée est   " + jours +"/"+ mois +"/"+ annee);
		     
		  	

	}

}
