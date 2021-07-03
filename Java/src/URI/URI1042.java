package URI;

import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int valor01 = input.nextInt();
		int valor02 = input.nextInt();
		int valor03 = input.nextInt();
		
		if (valor01 < valor02 && valor01 < valor03 && valor02 < valor03) {

			System.out.println(valor01);
			System.out.println(valor02);
			System.out.println(valor03);

		} else if (valor01 < valor03 && valor01 < valor02 && valor03 < valor02) {
			
			System.out.println(valor01);
			System.out.println(valor03);
			System.out.println(valor02);

		} else if (valor02 < valor01 && valor02 < valor03 && valor01 < valor03) {
			
			System.out.println(valor02);
			System.out.println(valor01);
			System.out.println(valor03);
			
		} else if (valor02 < valor03 && valor02 < valor01 && valor03 < valor01) {
			
			System.out.println(valor02);
			System.out.println(valor03);
			System.out.println(valor01);
			
		} else if(valor03 < valor01 && valor03 < valor02 && valor01 < valor02){
			
			System.out.println(valor03);
			System.out.println(valor01);
			System.out.println(valor02);
			
		} else  {
			
			System.out.println(valor03);
			System.out.println(valor02);
			System.out.println(valor01);
			
		}
		
		System.out.println("");
		System.out.println(valor01);
		System.out.println(valor02);
		System.out.println(valor03);
		
		input.close();

	}
}
