package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		/*
		 * Sintaxe do FOR
		 * Parte 1: definimos o contator e o valor inicial;
		 * Parte 2: condi��o ( enquanto for vdd o la�o continua)
		 * Parte 3: como ocorrer� a contagem
		 */
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada?"));
		for(int contador = 1; contador < 11; contador++) {
			
			System.out.println(tabuada + " x " + contador + " = " + ((tabuada * contador)));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
