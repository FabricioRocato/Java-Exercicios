package exercicios2;

import java.util.Scanner;

public class vetorUm {
	public static void main(String[] args) {

		int[] vetor = new int[5];
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.printf("%d ", vetor[i]);
			vetor[i] = in.nextInt();
		}
		int a = 0;
		for (int i = 0; i < 5; i++) {
			a = a + vetor[i];
		}
		System.out.println("A soma do vetor e: " + a);
	}
}
