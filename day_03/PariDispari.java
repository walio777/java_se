package day_03;

import java.util.Scanner;

public class PariDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci un numero intero positivo:");
		int numero1 = input.nextInt();
		if (numero1 % 2 == 0) {
			System.out.println("numero pari");
		}
		if (numero1 % 2 == 1) {
			System.out.println("numero dispari");
		}

	}

}
