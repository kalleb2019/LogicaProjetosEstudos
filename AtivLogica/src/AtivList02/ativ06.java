package AtivList02;

import java.util.Scanner;

public class ativ06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabela[][] = {
				{12, 88, 64},
				{10, 19, 66},
				{25, 17, 15},
				{30, 25, 99},
				{45, 55, 20},
		};
		
		System.out.println("Digite o número da linha que deseje alterar");
		int l = sc.nextInt();
		System.out.println("Digite o número da coluna que deseje alterar");
		int c= sc.nextInt();
		
		l--;
		c--;
		
		boolean key = false;
		if((l >= 0 && l <= tabela.length) && (c >= 0 && c <=tabela[0].length)) {
			key = true;
			System.out.print("Digite o numero para alteração!");
			int num = sc.nextInt();
			
			for(int i =0 ;i < tabela.length;i++) {
				for(int j =0;j < tabela[0].length;j++) {
					if(tabela[i][j] == tabela[l][c]) {
						tabela[i][j] = num;
					}
					
				}
				System.out.println("\n");
			}if(key == true) {
				for(int i =0 ;i < tabela.length;i++) {
					for(int j =0;j < tabela[0].length;j++) {
						System.out.print(tabela[i][j]+ " ");
					}
					System.out.println("\n");
				}
			}
		}else{
			System.out.println("valor invalido");
		}
		
	}

}
