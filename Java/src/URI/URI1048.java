package URI;

import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salario = input.nextDouble();
		double reajuste;
		double novoSalario;
		int porcentagem;

		if (salario > 0 && salario <= 400) {
			porcentagem = 15;
			reajuste = salario * 0.15;
			novoSalario = salario + reajuste;

		} else if (salario > 400 && salario <= 800) {
			porcentagem = 12;
			reajuste = salario * 0.12;
			novoSalario = salario + reajuste;
		} else if (salario > 800 && salario <= 1200) {
			porcentagem = 10;
			reajuste = salario * 0.10;
			novoSalario = salario + reajuste;
		} else if (salario > 1200 && salario <= 2000) {
			porcentagem = 7;
			reajuste = salario * 0.07;
			novoSalario = salario + reajuste;
		} else {
			reajuste = salario * 0.04;
			novoSalario = salario + reajuste;
			porcentagem = 4;
		}

		System.out.printf("Novo salario: %.2f", novoSalario);
		System.out.printf("\nReajuste ganho: %.2f", reajuste);
		System.out.println("\nEm percentual: " + porcentagem + " %");
		input.close();

	}

}
