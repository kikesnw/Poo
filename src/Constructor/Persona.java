package Constructor;
//Los constructores tienen el mismo nombre que la clase
//Los contructores no devuelven ningun valor
//Deben declararse como publico
public class Persona {
		//Atributos
	String nombre;
	int edad;
	
	
	//Metodos
	
	//Metodo Constructor	
	public Persona(String _nombre, int _edad){
		nombre = _nombre;
		edad = _edad;
	}
	//Otro tipo de constructor muy utilizado es lo mismo que antes, pero los parametros
	//son igual que los atributos con lo que hay que decir 
	//que es el mismo atributo con el "this" para no confundir a java

	/*public Persona(String nombre, int edad) {
		this.nombre= nombre;
		this.edad= edad;
		
	}*/
		
	public void mostrarDatos() {
		System.out.println("El nombre es: "+ nombre);
		System.out.println("LA edad es :" + edad);
	}
		


	

}
