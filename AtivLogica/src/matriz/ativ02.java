package matriz;

import java.util.Scanner;

public class ativ02 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int valores[][] = {
				{12, 88 ,64},
				{10, 19 ,66},
				{25, 17, 15},
				{30, 25, 99},
				{45, 55, 20},
				};
		System.out.println("Digite a linha que deseje alterar");
		int linha = sc.nextInt();
		System.out.println("Digite a coluna que deseje alterar");
		int coluna = sc.nextInt();
		linha--;
		coluna--;
		System.out.println("valor selecionado: "+valores[linha][coluna] );
		System.out.println("informe um numero para substituir");
		valores[linha][coluna]= sc.nextInt();
		System.out.println(valores[linha][coluna] );
		
	}

}
