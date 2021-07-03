package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		
		double n = 3.14159;
		
		Scanner input = new Scanner(System.in);
		
		double r = input.nextDouble();
		
		double area = n * Math.pow(r, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		
		input.close();

	}

}
