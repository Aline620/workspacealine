package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		
		String nome_produto = JOptionPane.showInputDialog("Qual o produto");
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
		float valor_unit = Float.parseFloat(JOptionPane.showInputDialog("Valor unit�rio"));
		
		
		if(qtde < 5) {
			
			System.out.println("Valor total: " + (qtde * valor_unit));
			
		}else if (qtde > 20 ) {
			
			System.out.println("Valor total: " + ((qtde * valor_unit)/0.88));
			
			
		} else if (qtde >= 10 && qtde <= 20) {
			
			System.out.println("Valor total: " + ((qtde * valor_unit)/0.90));
			
		}else if(qtde >=5 && qtde <= 9) {
						
			System.out.println("Valor total: " + ((qtde * valor_unit)/0.95));
			
		}
		
			
		
		
			
		
		
		
		
		
		
		
		
		
		

	}

}
