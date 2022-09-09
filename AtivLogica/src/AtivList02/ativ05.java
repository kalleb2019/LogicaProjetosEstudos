package AtivList02;

import java.util.Scanner;

public class ativ05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabela[][] = {
				{12, 88, 64},
				{10, 19, 66},
				{25, 17, 15},
				{30, 25, 99},
				{45, 55, 20},
		};
		int valor =19;
		for(int i = 0;i < tabela.length;i++) {
			for(int c = 0 ;c < tabela[0].length;c++) {
				if(tabela[i][c] > valor) {
					System.out.println(tabela[i][c]);
				}
			}
			
		}

	}

}
