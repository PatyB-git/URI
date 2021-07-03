package URI;

import java.util.Scanner;

public class URI1012 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();

		// a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura
		double areaTR = (A * C) / 2;

		// a �rea do c�rculo de raio C. (pi = 3.14159)

		double areaCirculo = 3.14159 * (Math.pow(C, 2));

		// a �rea do trap�zio que tem A e B por bases e C por altura

		double areaTrapezio = ((A + B)*C) / 2;

		// a �rea do quadrado que tem lado B

		double areaQuadrado = Math.pow(B, 2);

		// a �rea do ret�ngulo que tem lados A e B

		double areaRetangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", areaTR);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

		input.close();

	}

}
