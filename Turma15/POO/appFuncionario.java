package POO;

public class appFuncionario {

	public static void main(String[] args) {
		//OBJETO
		baseFuncionario pedro = new baseFuncionario("Pedro","Monteiro lobato",40028922);
		baseFuncionario carol = new baseFuncionario("Carol","Rua aruja",40028922);
		
		pedro.imprimirInfo(); 
		carol.imprimirInfo();
	}

}
