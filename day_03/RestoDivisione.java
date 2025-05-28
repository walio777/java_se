package day_03;

import java.util.Scanner;

public class RestoDivisione {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci il primo numero: ");
		int numero1 = input.nextInt();
		System.out.println("per quale numero vuoi dividerlo? ");
		int numero2 = input.nextInt();
		//operatore modulo % costituisce il resto della divisione es. 5 % 2 = 1 
		double resto = numero1 % numero2;
		System.out.println("il resto tra" + numero1 + "e" + numero2 + resto);
		input.close();
		
	}

}
