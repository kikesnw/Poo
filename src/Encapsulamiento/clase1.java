package Encapsulamiento;
/*Con el encapsulamiento ocultamos algunos datos para que nadie pueda modificarlos 
 sino que solamente pueda ser modificado mediante metodos de la misma clase
 */

/*Con los metodos accesores (Getters y Setters) nos sirven para:
 	Setters:Establecen un valor para un atributo
 	Getters:Obtener un valor de un atributo
 */
public class clase1 {
	private int edad;
	private String nombre;
	
	//Establecemos la edad con el set edad
	public void SetEdad(int edad) {
		this.edad=edad;
		
	}
	
	public clase1() {
		nombre=null;
		edad=0;
	}
	//Metodo Getter:Mostramos la edad
	
	public int getEdad() {
		return edad;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
