package introduccion.tema3;

/**
 * 
 * @author KelevsID
 * 		Ejercicios tema 3
 *      Segunda parte: 
 *      Crear una clase coche. Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene. 
 *      Una función que incremente el número de puertas que tiene el coche. 
 *      Crear un objeto miCoche en el main y añadirle una puerta. 
 *      Mostrar el número de puertas que tiene el objeto.
 */

public class Coche {

	public int puertas;

	Coche() {
	}

	public int incrementoPuertas(int num1) {
		this.puertas += num1;
		return this.puertas;
	}

	public static void main(String[] args) {
		Coche coche = new Coche();
		coche.incrementoPuertas(11);
		System.out.println(coche.puertas);
		coche.incrementoPuertas(2);
		System.out.println(coche.puertas);
	}
}
