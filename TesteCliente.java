package POO;

/*
 * 1) Crie uma classe cliente e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.
 */

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente auto1 = new Cliente ("Jo�o","Fernandes",111222333,25,1.83,"Rua Silvestre, 55, 01555-199.");
		auto1.imprimirInfo();
	}

}