package introduccion;

public class TestPersona {
	public static void main(String[] args) {
		Persona persona1 = new Persona(13, "Pedro Antonio", "313-4212");
		System.out.println(persona1);
	
		Persona persona2 = new Persona();
		persona2.setEdad(22);
		persona2.setNombre("Ana Maria");
		persona2.setTelefono("765-3451");
		
		int edad= persona2.getEdad();
		String nombre = persona2.getNombre();
		String telefono = persona2.getTelefono();
		System.out.println(String.format("Nombre: %s Edad: %d Telefono: %s", nombre, edad, telefono));
	}
}
