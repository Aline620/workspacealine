package br.com.ecommerceabc.teste;

import javax.swing.JOptionPane;

import br.com.ecommerceabc.modelo.Produto;

public class TesteProduto3 {

	public static void main(String[] args) {

		Produto produto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("DEscri��o"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Venda")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
				Integer.parseInt(JOptionPane.showInputDialog("Quantidade"))
				);
		
		System.out.println(produto.toString());		

	}

}
