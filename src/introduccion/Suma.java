package introduccion;

/**
 * 
 * @author KelevsID
 *         Ejercicios tema 3 
 *         Primera parte: 
 *         Crear una función con tres
 *         parámetros que sean números que se suman entre sí. Llamar a la
 *         función en el main y darle valores.
 */

public class Suma {

	public static void main(String[] args) {

		int result1 = sum(10, 10, 10);
		int result2 = sum(6, 3, 8);
		int result3 = sum(1, 35, 11);
		int result4 = sum(7, 7, 3);
		System.out.println(String.format("%d, %d, %d, %d", result1, result2, result3, result4));
	}

	static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
