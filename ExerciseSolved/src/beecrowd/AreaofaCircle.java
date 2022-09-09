package beecrowd;

import java.util.Scanner;
// PROBLEM 1002  
public class AreaofaCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A,R,n = 3.14159;
		R = sc.nextDouble();
		A = n*(R*R);
		System.out.printf("A=%.4f\n",A);
	}

}
