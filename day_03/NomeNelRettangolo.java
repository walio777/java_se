package day_03;

import java.util.Scanner;

public class NomeNelRettangolo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il nome e cognome: ");
		String nome = input.nextLine();
		String base = "+" + "-".repeat(nome.length() + 2) + "+";
		base = base + "\n";
		base = base + " | " + nome + " | ";
		base = base + "+" + "-".repeat(nome.length() + "+";
		System.out.println(base);
		
		
		input.close();

	}

}
