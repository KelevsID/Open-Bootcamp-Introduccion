package introduccion;

public class TestCoche {
	public static void main(String[] args) {
		Coche coche = new Coche();
		System.out.println(coche.puertas);
		coche.incrementoPuertas(10);
		System.out.println(coche.puertas);
	}
}
