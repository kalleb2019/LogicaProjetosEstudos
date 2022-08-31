package matriz;

public class ativ01 {

	public static void main(String[] args) {
			
			double produto [][]= new double[4][2];
			
			produto[0][0]	=	5.55;
			produto[0][1]	=	7.50;
			
			produto[1][0]	=	5.60;
			produto[1][1]	=	7.50;
			
			produto[2][0]	=	7.00;
			produto[2][1]	=	7.75;
			
			produto[3][0]	=	6.50;
			produto[3][1]	=	8.00;
			
			System.out.println("********************");
			for(int i =0;i < produto.length; i++) {
				for(int c =0;c < produto[0].length;c++)
					System.out.print(produto[i][c]+ " ");
				System.out.println("\n");
			}
			System.out.println("******************");
			
			
			
	}

}
