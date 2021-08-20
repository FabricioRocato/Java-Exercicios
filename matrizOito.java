package exercicios2;

import java.util.Scanner;

public class vetorOito {
	public static void main(String[] args) {

		int matriz[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (matriz[i][j] % 2 == 0) {
					matriz[i][j] = 0;
				}
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println(" ");
		}
	}

}
