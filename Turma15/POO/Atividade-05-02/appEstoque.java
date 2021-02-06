package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class appEstoque extends Estoque {
	
	static List<Estoque> listaProdutos = new ArrayList<Estoque>();
	
	static public boolean procuraProduto(String nome) {
		boolean itemExiste = false;
		for(Estoque obj : listaProdutos ) {						
			if (obj.getProduto().equals(nome)) {
				itemExiste = true;
			}						
		}
		return itemExiste;
	}
	
	static public int getIndexProduto(String nome) {
		Integer index = null;
		for(int i =0; i<listaProdutos.size(); i++ ) {						
			if (listaProdutos.get(i).getProduto().equals(nome)) {
				index = i;
			}						
		}		
		return index;
	}
	
	public void testeEstoque (String produto, int quantide)
	{
		super(produto, quantide);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int op;
		String nome;
		
		do {
			System.out.println("\n\tESTOQUE: \n1. Cadastrar Produto\n2. Remover Produto\n3. Atualizar Produto\n4. Mostrar lista de produtos\n0. Sair");
			System.out.printf("\nOpção: ");
			op = scan.nextInt();
			Estoque item = new Estoque();
			
			switch(op)
			{
				case 1: 
					
					scan.nextLine();
					System.out.printf("Insira o nome do produto que voce deseja cadastrar: ");
					nome = scan.nextLine();
					item.setProduto(nome);					
										
					if(procuraProduto(nome)==false) {
						System.out.printf("Entre com a quantidade que queira adicionar no estoque: ");
						item.setQuantide(scan.nextInt());
						listaProdutos.add(item);
						System.out.println("\nProduto inserido com sucesso!\nLista de produto: " + listaProdutos.toString());
					}
					else {
						System.out.println("Esse Item já existente!");
					}
					break;
					
				case 2: 
					scan.nextLine();
					System.out.printf("Qual produto voce deseja remover: ");
					nome = scan.nextLine();
					
					if (procuraProduto(nome)==true)
					{												
						listaProdutos.remove(getIndexProduto(nome));
						System.out.println("\nProduto removido com sucesso!\nLista de produto: " + listaProdutos.toString());
					}
					
					else
					{
						System.out.println("Não existe este produto!");
					}
					break;
					
				case 3:
					scan.nextLine();
					System.out.printf("Entre com o produto que queira atualizar o estoque: ");
					nome = scan.nextLine();
					
					if (procuraProduto(nome)==true)
					{												
						System.out.println("Digite a quantidade que quer alterar: ");
						int modQntd = scan.nextInt();
						Estoque item2;						
						item2 = listaProdutos.get(getIndexProduto(nome));
						
						item2.mudarEstoque(modQntd);
					}
					
					else
					{
						System.out.println("Não existe este produto!!");
					}
	
					System.out.println("\nLista atualizada com sucesso!\nLista de produto: " + listaProdutos.toString());
					break;
					
				case 4:
					
					System.out.println("\nLista de produto: \n" + listaProdutos.toString());
			}
			
		}while (op != 0);
		
	}

}