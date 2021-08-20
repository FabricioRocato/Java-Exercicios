package exercicios2;

import java.util.Scanner;

public class vetorCinco {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[][] matriz = new int[2][5];
		for (int j = 0; j < 5; j++) {
			matriz[0][j] = in.nextInt();
		}
		System.out.println("");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[1][j] = matriz[0][j] * 2;
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println(" ");
		}
	}
}
