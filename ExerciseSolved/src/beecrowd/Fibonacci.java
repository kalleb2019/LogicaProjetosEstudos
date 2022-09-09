package beecrowd;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,n1=0,n2=0,n3=0;
		n = sc.nextInt();
		if(n < 46 && n >= 0){
			n--;
			for(int i = 0 ;i <= n; i++){
				n1=n2+n3;
				System.out.print(n1);
				if(i < n) {
					for(int j = 0 ;j < 1; j++)
						System.out.print(" ");
				}
				n3 = n2;
				n2 = n1;
				if(n1 == 0)
					n3++;
			}
		}
		System.out.print("\n");
	}
	

}
