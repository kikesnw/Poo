package SobrecargaMetodos;

public class Persona {
 
	//CTRL + B creamos constructor
	//Atributos
	String nombre;
	int edad;
	String dni;
	
	
	public Persona(String dni) {
		super();
		this.dni = dni;
	}


	//MEtodos
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void correr() {
		System.out.println("soy"+nombre+" Tengo "+edad+"años");
	}
	
	//metodo correr pero  diferenciado del anterior
	public void correr(int km) {
		System.out.println("He corrido "+km+" Kilometros");
	}
}
