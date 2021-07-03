package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		String nome = input.next();
		double salarioFixo = input.nextDouble();
		double totalVendas = input.nextDouble();
		double total = salarioFixo + (totalVendas*0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", + total );
		
		input.close();

	}

}
