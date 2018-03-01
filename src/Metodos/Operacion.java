package Metodos;
import java.util.Scanner;
public class Operacion {
Scanner teclado=new Scanner(System.in);
	//atributos
	int suma;
	int resta;
	int multiplicacion;
	int division;

	//metodos
	//Public void "Nombre" ("PARAMETROS")
	//Metodo llamado sumar para sumar ambos numeros
	public void sumar(int numero1, int numero2) {
		suma=numero1+numero2;
	}
	//Metodo llamado restar para restar ambos numeros
	public void restar(int numero1, int numero2) {
		resta=numero1-numero2;
	}
	public void mostrarResultados() {
		System.out.println("la suma es: "+suma);
		System.out.println("la resta es:" + resta);
	}
}
 