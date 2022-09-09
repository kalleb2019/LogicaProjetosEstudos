package AtivList03;

import java.util.Scanner;

public class Ativ04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double notas[] = new double[10];
		double soma = 0, media;
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota da prova " + (i + 1) + ": ");
			notas[i] = teclado.nextDouble();
			soma += notas[i];
		}
		media = soma / notas.length;
		System.out.println("\nNotas que estão acima da média:");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > media)
				System.out.println(notas[i]);
		}
		teclado.close();
	}

}
