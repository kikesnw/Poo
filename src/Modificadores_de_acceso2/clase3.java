package Modificadores_de_acceso2;

//Esto es necesario para poder acceder a otros paquetes dentro del mismo proyecto
import Modificadores_de_acceso.clase1;

public class clase3 {
	public static void main(String[] args) {
		clase1 objeto1 = new clase1();
		objeto1.atributo1=15;

	}

}
