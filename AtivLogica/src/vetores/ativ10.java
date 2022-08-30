package vetores;

import java.util.Scanner;

public class ativ10 {
	public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        String nomes[] = new String[5];
        double notas[] = new double[5];

        for(int i = 0;i  < notas.length; i++){
            System.out.print("Digite o nome do aluno numero "+ (i+1)+":");
            nomes[i]= teclado.next();
            
            System.out.println("Digite a nota do aluno numero " + (i+1));
            notas[i] = teclado.nextDouble();
        }
        
        for(int i = 0;i  < notas.length; i++) {
        	System.out.printf("O Aluno %s tirou nota: %.1f \n"  ,nomes[i],notas[i]);
        }

        teclado.close();
}

}
