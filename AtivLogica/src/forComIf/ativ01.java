package forComIf;

public class ativ01 {
	public static String calculoPrimo(int num) {
		if(num <= 1 )
			return "O numero n�o � primo";
		
			for(int i = 2;i*i <= num;i++) {
				if(num % i == 0)
					return "N�o n�o � primo";
			}
			return "� um numero primo";
		}
}
