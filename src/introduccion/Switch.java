package introduccion;

/**
 * 
 * @author KelevsID 
 * 		   Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
 *         Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación 
 *         en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
public class Switch {
	public static void main(String[] args) {
		
		int estacion = 0;

		switch (estacion) {
		case 1:
			System.out.println("Primavera - 20 de marzo del 2023");
			break;
		case 2:
			System.out.println("Verano - 21 de junio del 2023");
			break;
		case 3:
			System.out.println("Otoño - 21 de junio del 2023");
			break;
		case 4:
			System.out.println("Invierno - 21 de junio del 2023");
			break;

		default:
			System.out.println("Invalido");
			break;
		}
	}
}
