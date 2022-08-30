package vetores;

import java.util.Scanner;

public class Ativ05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double temperaturas[] = new double[7];
		double maior = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Informe a temperatura medida no dia " + (i + 1) + ": ");
			temperaturas[i] = teclado.nextDouble();
			if (temperaturas[i] > maior)
				maior = temperaturas[i];
		}
		System.out.print("\nA maior temperatura registrada foi de " + maior + " graus celsius.");
		teclado.close();

	}

}
