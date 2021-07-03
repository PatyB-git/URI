package URI;

import java.util.Scanner;

public class URI1046 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int inicio = input.nextInt();
		int fim = input.nextInt();
		int duracao=0;
		
		if (inicio >= fim) {
			duracao = (24-inicio)+fim;
			System.out.printf("O JOGO DUROU %d HORA(S)%n",duracao);
		} else {
			duracao = fim-inicio;
			System.out.printf("O JOGO DUROU %d HORA(S)%n",duracao);
		}
		input.close();
	}
}
