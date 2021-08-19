package exercicios2;

import java.util.Scanner;

public class vetorSete {
	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int[][] matrizDois = new int[5][5];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println("");
		}
		System.out.println("numeros na diagonal segundaria: " + matriz[0][4] + " " + matriz[1][3] + " " + matriz[2][2]
				+ " " + matriz[3][1] + " " + matriz[4][0]);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrizDois[i][j] = in.nextInt();
			}
		}
	}
}
