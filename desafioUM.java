package exercicios2;

import java.util.Scanner;

public class desafioUM {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] vetor = new int[10];
		int numero = 0;
		System.out.println("Insira os numeros no vetor: ");
		for (int i = 0; i < 10; i++) {
			vetor[i] = in.nextInt();
		}
		System.out.println("qual numero deseja procurar: ");
		numero = in.nextInt();
		for (int i = 0; i < 10; i++) {
			if (vetor[i] == numero) {
				System.out.println("este numero esta na posicao: " + i);
				System.exit(0);
			}
		}
		System.out.println("este numero nao existe no vetor");
	}
}
