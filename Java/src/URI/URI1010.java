package URI;

import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int codPeca = input.nextInt();
		int qtd = input.nextInt();
		double valorUnitario = input.nextDouble();
		
		int codPeca2 = input.nextInt();
		int qtd2 = input.nextInt();
		double valorUnitario2 = input.nextDouble();
		
		double total = (qtd * valorUnitario) + (qtd2*valorUnitario2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		input.close();
	}
}
