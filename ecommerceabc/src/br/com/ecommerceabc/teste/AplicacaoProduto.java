package br.com.ecommerceabc.teste;

import br.com.ecommerceabc.modelo.Produto;

public class AplicacaoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setDescricao("Churros");
		produto.setQtde(10);
		produto.setValorCompra(5);
		produto.setValorVenda(8);
		produto.setId(1);
		
		System.out.println("Produto: " + produto.getDescricao());
		System.out.println("Promo��o: " + produto.getPromocao(20));
		System.out.println("Valor da venda: " + produto.getValorVenda());
		
		produto.atualizarValores(10);
		
		System.out.println(produto.getAll());
		
		System.out.println(produto.verificarEstoque());
		
		System.out.println("Total de Compras: " + produto.getTotalCompras());
		System.out.println("Total de Vendas: " + produto.getTotalVendas());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
