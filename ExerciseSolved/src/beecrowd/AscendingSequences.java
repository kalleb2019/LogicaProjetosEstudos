package beecrowd;

import java.util.Scanner;

public class AscendingSequences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int num;
		for(int i = X; i >= 0; i--) {
			for(int j =1;j < X; j++) {
				System.out.println(j);
			}
		}

	}

}
