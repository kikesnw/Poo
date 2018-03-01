package Constantes;
//Algo que no va a cambiar en todo el programa con la palabra "final"
public class Persona {
	private final String nombre;
	private int edad;
	
	//Su constructor(obligatorio)
	public Persona (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public void mostrardatos() {
		System.out.println("El nombre es "+nombre);
		System.out.println("LA edad es "+edad);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
