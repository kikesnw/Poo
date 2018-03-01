package ClasesYObjetos;
import java.util.Scanner;
public class Operacion {
Scanner teclado=new Scanner(System.in);
	//atributos
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;

	//metodos

	public void leerNumeros() {
		System.out.println("Dame un numero");
		numero1=teclado.nextInt();
		System.out.println("Dame otro numero");
		numero2=teclado.nextInt();
	}
	//MEtodo para sumar ambos numeros
	public void sumar() {
		suma= numero1+numero2;
	}
	public void mostrarResultados() {
		System.out.print("la suma es: "+suma);
	}
}
 