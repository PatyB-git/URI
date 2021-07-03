package URI;

import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();

		double aux;

		if (B > A) {
			aux = A;
			A = B;
			B = aux;
		}

		if (C > A) {
			aux = A;
			A = C;
			C = aux;
		}

		double A2 = Math.pow(A, 2);
		double B2 = Math.pow(B, 2);
		double C2 = Math.pow(C, 2);

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {

			if (A2 == B2 + C2) {
				System.out.println("TRIANGULO RETANGULO");
			} else if (A2 > B2 + C2) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}
		}

		if (A == B && A == C && B == C) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if (A == B || B == C || C == A) {
			System.out.println("TRIANGULO ISOSCELES");
		}

		input.close();
	}
}
