package ClasesYObjetos;

import java.util.Scanner;

public class Main {		
	Scanner teclado=new Scanner(System.in);
	public static void main(String[]args) {

		//objeto de la clase operacion (nombre de la claee- numbre del objeto = new nombre de la clase())
		Operacion op =new Operacion();
		//programa
		op.leerNumeros();
		op.sumar();
		
		op.mostrarResultados();
		
	}
}
