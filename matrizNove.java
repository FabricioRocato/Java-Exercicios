package exercicios2;

import java.util.Scanner;

public class vetorNove {
	public static void main(String[] args) {
		int par = 0;
		int impar = 0;
		Scanner in = new Scanner(System.in);
		int[][] matriz = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matriz[i][j] % 2 == 0) {
					par = par + 1;
				} else {
					impar = impar + 1;
				}
			}
		}
		System.out.println("Quantidade de numeros par: " + par);
		System.out.println("Quantidade de numeros impar: " + impar);
	}
}
