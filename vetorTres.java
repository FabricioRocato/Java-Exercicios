package exercicios2;

import java.util.Scanner;

public class vetorTres {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] vetor = new int[10];

		for (int i = 0; i < 10; i++) {
			vetor[i] = in.nextInt();
		}
		System.out.printf("Valores digitados:");
		for (int i = 0; i < 10; i++) {
			System.out.printf(" " + vetor[i]);
		}

		int multiplo = 0;
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 3 == 0) {
				multiplo = multiplo + 1;
			}
		}
		System.out.println("\nquantidade de multiplos de 3: " + multiplo);

	}
}