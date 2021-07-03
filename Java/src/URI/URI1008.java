package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int numFuncionario = input.nextInt();
		int horasTrabalhadas = input.nextInt();
		double valorHora = input.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER = " + numFuncionario + "%nSALARY = U$ %.2f%n", + salario);
		
		input.close();
	}

}
