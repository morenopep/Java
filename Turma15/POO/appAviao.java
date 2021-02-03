package POO;

public class appAviao {

	public static void main(String[] args) {
		
		baseAviao aviao1 = new baseAviao("Hercules","C-130",10000);
		baseAviao aviao2 = new baseAviao("Millennium ","KC-390",5000);
		
		aviao1.imprimirInfo();
		aviao2.imprimirInfo();
	}

}
