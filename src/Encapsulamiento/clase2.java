package Encapsulamiento;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class clase2 {

	public static void main(String[] args) {
		clase1 objeto1 = new clase1();
		Scanner teclado=new Scanner(System.in);
		//Almacenamos en una variable la edad
		
		int x=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		objeto1.SetEdad(x);
		
		System.out.println("La edad es: "+ objeto1.getEdad());
		
		//Creamos un panel para que introduzcamos el nombre
		String y=JOptionPane.showInputDialog("Dame un nombre");
		objeto1.setnombre(y);
		System.out.println("El nombre es "+objeto1.getnombre());
	}

}
