package URI;

import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int idadeDias = input.nextInt();

		int anos = idadeDias / 365;
		idadeDias %= 365;

		int meses = idadeDias / 30;

		int dias = idadeDias % 30;

		System.out.printf(anos + " ano(s)%n" + meses + " mes(es)%n" + dias + " dia(s)%n");

		input.close();
	}

}
