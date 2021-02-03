package POO;

public class appEletronico {

	public static void main(String[] args) {
		baseEletronico eletronico0 = new baseEletronico("Placade Video",68547);
		baseEletronico eletronico1 = new baseEletronico("Memoria Ram",6753604);
		baseEletronico eletronico2 = new baseEletronico("mouse", 498752);
		
		eletronico0.imprimirInfo();
		eletronico1.imprimirInfo();
		eletronico2.imprimirInfo();
		
	}

}
