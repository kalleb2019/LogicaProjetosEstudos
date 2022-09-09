package beecrowd;

import java.util.Scanner;
// PROBLEM  1012 
public class Area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double A,B,C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f\n",areaTriangle(A,C));
		System.out.printf("CIRCULO: %.3f\n",areaCircle(C));
		System.out.printf("TRAPEZIO: %.3f\n",areaTrapezium(A,B,C));
		System.out.printf("QUADRADO: %.3f\n",areaSquare(B));
		System.out.printf("RETANGULO: %.3f\n",areaRectangle(A,B));
	}
	public static double areaTriangle(double A, double C) {
		return (A*C)/2;
	}
	
	public static double areaCircle(double C) {
		double pi = 3.14159;
		return (C *C) * pi;
	}
	
	public static double areaTrapezium(double A, double B, double C) {
		return ((A+B)*C)/2;
	}
	public static double areaSquare(double B) {
		return B*B;
	}
	public static double areaRectangle(double A, double B) {
		return A*B;
	}

}
