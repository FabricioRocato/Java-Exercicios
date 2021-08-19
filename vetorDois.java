package exercicios2;

import java.util.Scanner;

public class vetorDois {

	public static void main(String[] args) {

		int[] vetor = new int[5];
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			vetor[i] = in.nextInt();
		}
		System.out.printf("Esses foram os valores digitados :");
		for (int i = 0; i < 5; i++) {

			System.out.print("  " + vetor[i]);

		}
		System.out.println("");

		int quadrado = 0;
		for (int i = 0; i < 5; i++) {
			quadrado = (int) Math.pow(vetor[i], 2);
			System.out.println("Esses sao os valores quadrados:" + quadrado);
		}
	}
}
