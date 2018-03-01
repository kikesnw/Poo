package SobrecargaMetodos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Persona persona1= new Persona("alejandro",21);
	persona1.correr();
	
	
	//En este correr metemos el 100 porque asi java sabe que son los km ya que 
	//los argumentos del otro correr estan vacios
	
	Persona persona2 = new Persona ("1231231212");
			persona2.correr(100);
		
	}

}
