package POO;

public class pessoaFornecedor{
		public static void main(String agrs[]) {
			


			fornecedor forn = new fornecedor("Pedro","rua", 19 ,40028922, 15000, 10000);
			
			System.out.println(forn.getNome()+"\n"+forn.getEndereco()+"\n"+forn.getIdade()+"\n"+forn.getTelefone()+"\n"+forn.getValorCredito()+"\n"+forn.getValorDivida());
	
		
	}
	
	

	
	
}
