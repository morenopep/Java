package POO;

public class appCliente {

	public static void main(String[] args) {
		
//		Crie uma classe cliente e apresente os atributos e m�todos referentes
//		esta classe, em seguida crie um objeto cliente, defina as instancias deste
//		objeto e apresente as informa��es deste objeto no console.
	
		//INTANCIAS DOS OBJETOS
	     baseCliente cl1 = new baseCliente("Pedro","Estev�o",9999); 
	     baseCliente cl2 = new baseCliente("Carol","Estev�o",8888);
	     
	     //EXIBIR O CONTEUDO DO OBJETO
	     cl1.imprimirInfo();
	     cl2.imprimirInfo();

	}

}
