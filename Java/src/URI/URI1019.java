package URI;

import java.util.Scanner;

public class URI1019 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tempoSegundos = input.nextInt();
		
		int horas = tempoSegundos/3600;
		tempoSegundos = tempoSegundos%3600;
		
		int minutos = tempoSegundos/60;
		
		int segundos = tempoSegundos%60;
		
		System.out.println(horas + ":" + minutos + ":"+segundos);
		
		input.close();

	}

}
