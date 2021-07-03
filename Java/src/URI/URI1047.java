package URI;

import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int horaInicio = input.nextInt();
		int minutosInicio = input.nextInt();

		int horaTermino = input.nextInt();
		int minutosTermino = input.nextInt();

		int horaTotal = 0;
		int minutosTotal = 0;

		if (horaInicio >= horaTermino) {
			horaTotal = (24 - horaInicio) + horaTermino;

		} else {
			horaTotal = horaTermino - horaInicio;
		}

		minutosTotal = minutosTermino-minutosInicio;
		if (minutosTotal < 0) {
			horaTotal--;
			minutosTotal = 60 +(minutosTermino-minutosInicio);

		} 
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", horaTotal, minutosTotal);

		input.close();
	}
}
