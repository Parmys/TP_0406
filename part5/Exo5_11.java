package darman.part5;
import java.util.Scanner;

public class Exo5_11 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Nombre de chevaux partants : ");
		int start=clavier.nextInt();
		System.out.println("Nombre de chevaux joues : ");
		int play=clavier.nextInt();
		
		int x=1,y=1;
		if(play>start) {
			System.out.println("Tu ne peux pas joues plus de chevaux que de partants");
		}
		else {
			
					  /*
					  * X = n ! / (n - p) !
						Y = n ! / (p ! * (n – p) !)
					  */
			for(int i=1;i<=play;i++) {
				 // x=(start*i)/(start-play)*i;
				 // y=(start*i)/(play*i)*(start-play)*i;
					x*=(start-play+i);
					y*=i;
			}
			System.out.printf("Dans l'ordre : une chances sur %d de gagner\nDans le desordre : une chances sur %d de gagner",x,x/y);
		}
		clavier.close();

	}

}
