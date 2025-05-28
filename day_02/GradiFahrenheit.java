package day_02;

 import java.util.Scanner;
 
 
public class GradiFahrenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci la temperatura in gradi celsius: ");
        double celsius = input.nextDouble();
        double Fahrenheit = celsius * 9/5 + 32;
        System.out.println("L'equivalente della temperatura in Fahrenheit è: " + Fahrenheit);
        		
		
	}

}
