package br.com.ecommerceabc.modelo;

/*
 * Design Pattern ( padrões para projetos)
 * DTO( um pattern - Data Transfer Object), melhor forma para representar um diagrama de classe na programação.
 * Diz que:
 * - Todos os atributos devem ser privados
 * - Cada atributo deve possuir individualmente método getters e setters.
 * - 
 */


public class Produto {

	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;
	
	
	public void verificarEstoque(String param) {
		
	}
	
	public void atualizarValores(float porcentagem) {
		
		
	}
	
	public void getTotalCompras() {
		
	}
	
	public void getTotalVendas() {
		
		
	}
	
	public float getPromocao() {
		return 
	}
	
	
	public void getPromocao() {
		
		
	}
	
	public String setAll () {
		return 
				"Id: " + this.id + "\n" +
				"Descrição do produto: " + this.descricao + "\n" +
				"Valor da venda: " + this.valorVenda + "\n" +
				"Valor da compra: " + this.valorCompra + "\n" +
				"Quantidade de produtos: " + this.qtde ;
	}
	
	public void getAll(int id, String descricao, float valorVenda, float ValorCompra, int qtde) {
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = ValorCompra;
		this.qtde = qtde;
					
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
