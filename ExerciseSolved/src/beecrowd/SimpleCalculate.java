package beecrowd;

import java.util.Scanner;
//PROBLEM 1010
public class SimpleCalculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codProd, uniProd,codProd2,uniProd2;
		double procProd,procProd2;
		codProd = sc.nextInt();
		uniProd = sc.nextInt();
		procProd = sc.nextDouble();
		codProd2 = sc.nextInt();
		uniProd2 = sc.nextInt();
		procProd2 = sc.nextDouble();
		System.out.printf("VALOR A PAGAR: R$%.2f",(uniProd*procProd)+(uniProd2*procProd2)+"n");
		sc.close();
	}

}
