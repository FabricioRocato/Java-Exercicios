package exercicios2;

import java.util.Scanner;

public class desafioDois {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Escolha a dimensao para as linhas da matriz: ");
		a = in.nextInt();
		System.out.print("Escolha a dimensao para as colunas da matriz: ");
		b = in.nextInt();

		int[][] matriz = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				matriz[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println(" ");
		}
	}
}
