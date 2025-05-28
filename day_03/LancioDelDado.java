package day_03;

import java.util.Random;

public class LancioDelDado {
	public static void main(String[] args) {
		Random random = new Random(); //Genera un oggetto di tipo random
		int risultato = random.nextInt(6) + 1; //Genera un numero tra 1 e 6
		System.out.println("risultato del dado:" + risultato);
		
	}
}