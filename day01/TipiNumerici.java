package day01;

public class TipiNumerici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte numero = 122; //in binario: 01111010
		hort numeroShort = numeroByte;//in binario:00000000 01111010
		int numeroInt = numeroShort;//in binario: 00000000 00000000 00000000  		
		
		
		//in binario sarebbe 00000000 00000000 00000000 00000000 00000000 00000000 00000000 01111010
		long numeroLong = numeroInt;
		float numeroFloat = numeroLong;
		double numeroDouble = numeroFloat;
		System.out.println("numeroDouble: " + numeroDouble);
		
	}

}
