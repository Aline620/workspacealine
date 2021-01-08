package br.com.ecommerceabc.modelo;

/*
 * Design Pattern ( padrões para projetos)
 * DTO( um pattern - Data Transfer Object), melhor forma para representar um diagrama de classe na programação.
 * Diz que:
 * - Todos os atributos devem ser privados
 * - Cada atributo deve possuir individualmente método getters e setters.
 * - Toda classe Beans deve possuir no minimo 2 construtores. Um vazio e outro com todos os parametros para os atributos
 */


	public class Produto {

	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;




	
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorVenda=" + valorVenda + ", valorCompra="
				+ valorCompra + ", qtde=" + qtde + "]";
	}

	public Produto() {
		super();
	}

	public Produto(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}

	public float getPromocao(float porcentagem) {
		return valorVenda - valorVenda * (porcentagem/100);
	}

	public String verificarEstoque() {
		if (qtde > 20) {
			return "Estoque alto";
		}else if (qtde < 5) {
			return "Estoque baixo";
		}else {
			return "Estoque normal";
		}

	}

	public void atualizarValores(float porcentagem) {
		valorVenda = valorVenda + valorVenda * (porcentagem/100);
		valorCompra = valorCompra + valorCompra * (porcentagem/100);

	}

	public float getTotalCompras() {
		return valorCompra * qtde;
	}

	public float getTotalVendas() {
		return valorVenda * qtde;
	}


	public float getPromocao() {
		return valorVenda * (float) 0.9; 
	}


	public void setAll(int id, String descricao, float valorVenda, float ValorCompra, int qtde) {
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = ValorCompra;
		this.qtde = qtde;

	}


	public String getAll () {
		return 
				"Id: " + id + "\n" +
				"Descrição do produto: " + descricao + "\n" +
				"Valor da venda: " + valorVenda + "\n" +
				"Valor da compra: " + valorCompra + "\n" +
				"Quantidade de produtos: " + qtde ;
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
