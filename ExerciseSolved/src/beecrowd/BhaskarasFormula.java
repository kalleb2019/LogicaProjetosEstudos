package beecrowd;

import java.util.Scanner;
// PROBLEM 1036
public class BhaskarasFormula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A,B,C,delta,X,R1,R2;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		delta = (B*B)-(4*A*C);
		if(delta > -1 && A != 0) {
			X = Math.sqrt(delta);
			R1 = (-(B) + X) /(2*A);
			R2 = (-(B) - X) /(2*A);
			System.out.printf("R1 = %.5f\n",R1);
	        System.out.printf("R2 = %.5f\n",R2);
		}else {
			System.out.println("Impossivel calcular");
		}
		sc.close();

	}

}
