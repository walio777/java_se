package day_04;

import java.util.Scanner;

/*

Scrivi un programma Java che calcola il numero di parole presenti in una stringa data.
Si considera una parola come una sequenza di caratteri separati da spazi.
*/
public class WordCountinString {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	System.out.println("Inserisci una frase :");
	String frase = input.nextLine();

	char carattere = ' ';
	boolean interruttore = true;
	int count = 0;
	for(int i = 0; i < frase.length(); i++) {//per tutta la lunghezza della frase
		carattere = frase.charAt(i);
		if(Character.isAlphabetic(carattere) && interruttore) {
			count++;
			interruttore = false;
		} else {
			if(!Character.isAlphabetic(carattere)) {
				interruttore = true;
			}
		}
	}
	
//		String[] word = frase.split(" ");
//		System.out.println("Numero parole : " + word.length);
System.out.println("Word number : " + count);
input.close();
}

}


