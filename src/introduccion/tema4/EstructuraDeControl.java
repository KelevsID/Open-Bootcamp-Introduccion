package introduccion.tema4;

/**
 * 
 * @author KelevsID
 *		Ejercicios tema 4 
 * 		Usando un if, crear una condición que compare si la variable
 *      numeroIf es positivo, negativo, o 0. Pista: Los números inferiores a
 *      0 son negativos y los superiores, positivos.
 */
public class EstructuraDeControl {
	public static void main(String[] args) {
		
		int numeroIf = 10;
		if (numeroIf < 0) {
			System.out.println("Numero Negativo");
		} else if (numeroIf > 0) {
			System.out.println("Numero Positivo");
		} else {
			System.out.println("El Numero es Cero");
		}
	}
}