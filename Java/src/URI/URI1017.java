package URI;

import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tempoGasto = input.nextInt();
		int velocidadeMedia = input.nextInt();
		
		double distanciaPercorrida = tempoGasto*velocidadeMedia;
		
		double litrosNecessario =  distanciaPercorrida/12;
	
		System.out.printf("%.3f%n", litrosNecessario);
		
		
		input.close();

	}

}
