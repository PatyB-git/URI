package URI;

import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int valor = input.nextInt();
		System.out.println(valor);
		int div100 = valor/100;
		valor = valor%100;
		
		int div50 = valor/50;
		valor = valor%50;
		
		int div20 = valor/20;
		valor = valor%20;
		
		int div10 = valor/10;
		valor = valor%10;
		
		int div5 = valor/5;
		valor = valor%5;
		
		int div2 = valor/2;
		valor = valor%2;
		
		int div1 = valor;
		
		System.out.println(div100 + " nota(s) de R$ 100,00");
		System.out.println(div50 +" nota(s) de R$ 50,00");
		System.out.println(div20 +" nota(s) de R$ 20,00");
		System.out.println(div10 +" nota(s) de R$ 10,00");
		System.out.println(div5 +" nota(s) de R$ 5,00");
		System.out.println(div2 +" nota(s) de R$ 2,00");
		System.out.println(div1 +" nota(s) de R$ 1,00");
		input.close();
	}

}
