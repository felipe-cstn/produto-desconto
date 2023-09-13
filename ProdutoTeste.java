package Desafios;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto prod = new Produto();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto: ");
		String nomeProduto = entrada.nextLine();
		
		System.out.println("Informe o valor do produto: ");
		double precoProduto = entrada.nextDouble();
		
		prod.setNome(nomeProduto);
		prod.setPreco(precoProduto);
		
		System.out.println("Nome do produto: " + prod.getNome()); 
		System.out.println("Preco do produto: " + prod.getPreco()); 
		System.out.printf("Valor do desconto: %.2f \n" , prod.valorDesconto()); 
		System.out.printf("Preco final: %.2f \n", prod.precoFinal()); 
		
		
		entrada.close();
	}
}
