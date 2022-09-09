package beecrowd;

import java.util.Scanner;

public class PositiveAverage {

	public static void main(String[] args) {
		int qtn =0;
		double med=0;
		Scanner sc = new Scanner(System.in);
		double x[] = new double[6];
		
		for(int i = 0 ;i < 6;i++){
			x[i] = sc.nextDouble();
			
		}for(int j = 0 ;j<x.length;j++) {
			if(x[j] > 0) {
				med += x[j];
				qtn++;
			}
		}
		med /= qtn;
		
		System.out.print(qtn+" valores positivos\n");
		System.out.printf("%.1f\n",med);
		

	}

}
