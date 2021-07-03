package URI;

import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int distanciaTotal = input.nextInt();

		double combustivelGasto = input.nextDouble();
		
		double kmLitro = distanciaTotal/combustivelGasto;

		System.out.printf("%.3f km/l%n", kmLitro);
		input.close();
	}

}