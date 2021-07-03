package URI;

import java.util.Scanner;

public class URI1038 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int codigoProduto = input.nextInt();
		int qtd = input.nextInt();
		double total = 0;

		switch (codigoProduto) {
		case 1:
			total = qtd * 4.00;
			break;
		case 2:
			total = qtd * 4.50;
			break;
		case 3:
			total = qtd * 5.00;
			break;	
		case 4:
			total = qtd * 2.00;
			break;	
		case 5:
			total = qtd * 1.50;
			break;
		}
		
		System.out.printf("Total: R$ %.2f%n",total);

		input.close();
	}
}
