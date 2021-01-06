package variaveis;

import javax.swing.JOptionPane;

public class Carrinho {

	public static void main(String[] args) {
		
		String nome_produto = JOptionPane.showInputDialog("Digite o produto");
		String categ_produto = JOptionPane.showInputDialog("Digite a categotia");
		double valor_produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
		int qtde_produto	= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		double imposto_produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o imposto"));
		
		
		double valor_total = valor_produto * qtde_produto;
		double valor_total_imposto = valor_total + valor_total * (imposto_produto/100);
		double valor_so_imposto = valor_produto * (imposto_produto/100);
		double desconto = valor_total_imposto * 0.9;
		
		System.out.println("Produto: " + nome_produto);
		System.out.println("Categoria: " + categ_produto);
		System.out.println("Preço: " + valor_produto);
		System.out.println("Quantidade: " + qtde_produto);
		System.out.println("Imposto: " + imposto_produto);
		System.out.println("Valor total: " +valor_total);
		System.out.println("Valor total com imposto: " + valor_total_imposto);
		System.out.println("Valor do imposto: " + valor_so_imposto);
		System.out.println("Valor com desconto: " + desconto);
		
	}

}
