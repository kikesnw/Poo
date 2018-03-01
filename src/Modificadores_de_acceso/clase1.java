package Modificadores_de_acceso;

public class clase1 {
	//le cambiamos el acceso al atributo para que sea accedido desde diferentes paquetes
	//Ya que de normal solo se puede acceder desde el mismo paquete (Se pone public al int)
	public int atributo1;
	
	
	//con private restringe para que solo pueda utilizarse desde la misma clase
	private int atributo2;
}
