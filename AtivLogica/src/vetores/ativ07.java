package vetores;

import java.util.Scanner;

public class ativ07 {
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		double nota[] = new double[10];
		
		for (int i = 0;i < nota.length; i++) {
			System.out.println("Digite a nota " + (i+1));
			nota[i] = teclado.nextDouble();
		}
		
		for (int i =0 ;i < nota.length; i++) {
			if (nota[i] > 6)
				System.out.println(nota[i]);
		}
		teclado.close();

	}

}
