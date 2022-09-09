package AtivList03;

import java.util.Scanner;

public class Ativ06 {
	public static void main(String[] args) {
		double media = 0, soma = 0,medTemp=0;
		Scanner teclado = new Scanner (System.in);
		double temperatura[]=new double [7];
		
		for (int i =0; i < temperatura.length;i++) {
			System.out.println("Digite a temperatura do dia " + (i+1));
			temperatura[i] = teclado.nextDouble();
			if (temperatura[i] > media)
				media = temperatura[i];
			
			soma +=  temperatura[i];
		}
		medTemp = soma/temperatura.length;
		System.out.println(media);
		System.out.printf("%.3f",medTemp );
		

		teclado.close();
	}
	
}
