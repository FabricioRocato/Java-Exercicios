package exercicios2;

import java.util.Scanner;

public class vetorQuatro {

	public static void main(String[] args) {

		int[] vetor = new int[5];
		int[] vetorDois = new int[vetor.length];
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			vetor[i] = in.nextInt();
		}
		System.out.print("Vetor normal: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(" " + vetor[i]);
		}

		for (int i = 0; i < vetor.length; i++) {
			vetorDois[i] = vetor[vetor.length - 1 - i];
		}
		System.out.println("");
		System.out.print("Vetor inverso: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(" " + vetorDois[i]);
		}
	}
}
