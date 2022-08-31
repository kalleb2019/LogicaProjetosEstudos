package matriz;

import java.util.Scanner;

public class ativ03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int valores[][] = {
				{12, 88 ,64},
				{10, 19 ,66},
				{25, 17, 15},
				{30, 25, 99},
				{45, 55, 20},
				};
		System.out.println("Qual linha da mitriz deseja ver");
		int linha = sc.nextInt();
		linha--;
		
		for(int i =0 ;i < valores[0].length;i++) {
			System.out.print(valores[linha][i]+" ");
		}
	}

}
