package darman.part4;

import java.util.Scanner;

public class Exo4_07 {

	public static void main(String[] args) {
		//donnees
		String Tarif="";//// bleu, vert, orange et rouge.
		//String ContratCouleur;///(vert -> bleu)(orange -> vert) (rouge ->orange)
		//String categorie;///1,2,3,4
		
		
		
		int age;
		int dureeMaison;
		int nbrAccident;
		int ProvoqueAccident;
		int dureePermis;
		
		//Saisie
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Bonjour, La maison d'assurance vous proposons 4 familles de couleur"
				+ "à ses clients : bleu, vert, orange et rouge ");
		
		System.out.println("Tapez les informations suivantes pour traiter votre"
				+ "demande et connaitre votre Tarif : " );
		System.out.println("************************************");
		System.out.println("************************************");
		System.out.println("************************************");
		
		System.out.println("Quel votre age  : " );
		age=clavier.nextInt();
		
		System.out.println("Quelle est la durée de votre permis en mois :  ");
		dureePermis=clavier.nextInt();
		
		System.out.println("Avez vous provoquez combien d'accident :  ");
		ProvoqueAccident=clavier.nextInt();
		
		System.out.println("Avez vous fait d'accidents si oui combien ? "
				+ "sinon Tappez zero (0) ");
		nbrAccident=clavier.nextInt();
		
		System.out.println("Depuis combien d'année etes client de la maison : ");
		dureeMaison=clavier.nextInt();
		
		if (age < 25) {
			if (dureePermis < 24  && nbrAccident==0) {
				Tarif="rouge";
				System.out.println("Votre Tarif est : " + Tarif);
				
				}else if (dureePermis>2) {
					Tarif="rouge";
					System.out.println("Votre Tarif est : " + Tarif);
				}else {
					
					System.out.println("Assurance est refusée.");	
				}
			
			
		}else if (age < 25) {
			if((dureePermis > 24)  && (ProvoqueAccident ==0 || ProvoqueAccident==1)) {
				
				Tarif="rouge";
				System.out.println("Votre Tarif est : " + Tarif);
			}else {
				
				System.out.println("Assurance est refusée.");	
			}
						
		}
		
	   if (dureePermis>24){
					if(ProvoqueAccident == 0) {
						Tarif="vert";
						System.out.println("Votre Tarif est : " + Tarif);
						
					}else if(ProvoqueAccident ==1) {
						
					     	Tarif="orange";
							System.out.println("Votre Tarif est : " + Tarif);
					}else if (ProvoqueAccident ==2) {
								Tarif="rouge";
								System.out.println("Votre Tarif est : " + Tarif);}
								
		}else {
						System.out.println("Assurance est refusée.");		
			}
			
			
		
	
		if (dureeMaison >= 5) 
			if (Tarif =="vert") {
				Tarif="bleu";
				System.out.println("Votre CONTRAT DE COULEUR DE FIDELITE devient : " + Tarif);
				}
				
			else if(Tarif =="orange") {
				Tarif="vert";
				System.out.println("Votre CONTRAT DE COULEUR DE FIDELITE devient : " + Tarif);
				}
			else if (Tarif =="rouge"){
				Tarif="orange";
				System.out.println("Votre CONTRAT DE COULEUR DE FIDELITE devient : " + Tarif);
				}
		}	
					
		
		
		
		 
	    
		
	}


