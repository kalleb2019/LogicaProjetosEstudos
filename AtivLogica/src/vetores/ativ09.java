package vetores;

import java.util.Scanner;

public class ativ09 {
	public static void main(String[] args) {
		double media = 0;
		Scanner teclado = new Scanner (System.in);
		double temperatura[]=new double [7];
		
		for (int i =0; i < temperatura.length;i++) {
			System.out.println("Digite a temperatura do dia " + (i+1));
			temperatura[i] = teclado.nextDouble();
			if (temperatura[i] > media)
				media = temperatura[i];
		}
		
		
		System.out.println(media);
		
	}

}
