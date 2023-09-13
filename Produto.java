package Desafios;

public class Produto {
	
	double desconto = 0.2;
	String nome;
	int id;
	double preco;
	double valDesconto;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public double valorDesconto() {
		valDesconto = this.desconto * this.preco;
		return valDesconto;
	}
	
	public double precoFinal() {
		return preco - valDesconto;
		
	}
	
}	
