package forComIf;

import java.util.Scanner;

public class ativ02 {
	 public static void main (String args[]){

	        Scanner teclado = new Scanner (System.in);
	        int numero = teclado.nextInt();

	        for(int i =1 ;i <= 10; i++){
	                int mult = i*numero;
	                String msg =(i+ "x" + numero+ "=" +mult );

	            if(mult %2 == 0)
	                 msg += " (par)";
	            else
	                 msg += " (impar)";
	                System.out.println(msg);
	        }

	    }

}
