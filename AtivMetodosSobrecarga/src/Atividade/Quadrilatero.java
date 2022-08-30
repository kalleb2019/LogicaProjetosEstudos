package Atividade;

public class Quadrilatero {	
	/**
	 * 
	 * 
	 * @return
	 * 
	 */
	int calcularArea(int lado) {
		return (lado * lado);
	}
	
	int calcularArea(int base, int altura) {
		return (base*altura);
	}


	double calcularArea(double base, double baseMenor, double altura) {
		return ((base + baseMenor) * altura) / 2;
	}

	double calcularArea(double diagonal, double diagonalMenor) {
		return diagonal * diagonalMenor;
	}

}
