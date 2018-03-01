package Constantes;

public class Principal {

	public static void main(String[] args) {
		Persona persona1=new Persona("Alfonso",21);
		
		//Si queremos cambiar la edad le ponemos:
		persona1.setEdad(22);
		
		
		persona1.mostrardatos();
		
		
		Persona persona2=new Persona("Manolo",22);
		persona2.mostrardatos();
		

	}

}
