package forComIf;

public class ativ01 {
	public static String calculoPrimo(int num) {
		if(num <= 1 )
			return "O numero não é primo";
		
			for(int i = 2;i*i <= num;i++) {
				if(num % i == 0)
					return "Não não é primo";
			}
			return "é um numero primo";
		}
}
