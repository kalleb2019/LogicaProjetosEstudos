package AtivList03;

import java.util.Scanner;

public class Ativ01 {
	 public static void main (String args[]){
		 int menor = 300 ,maior =0;
		
		 int numeros[] = {1,2,3,4,5,6,7,8,9,10};
		 
		 
		 for (int i = 0;i < numeros.length ;i++) {
			 if(numeros[i] < menor)
				 menor = numeros[i];
			 
			 if(numeros[i] > maior)
				 maior = numeros[i];
		 }
		 
		 System.out.println(maior);
		 
		 System.out.println(menor);
}
}