package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		/*
		 * Sintaxe do FOR
		 * Parte 1: definimos o contator e o valor inicial;
		 * Parte 2: condição ( enquanto for vdd o laço continua)
		 * Parte 3: como ocorrerá a contagem
		 */
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada?"));
		for(int contador = 1; contador < 11; contador++) {
			
			System.out.println(tabuada + " x " + contador + " = " + ((tabuada * contador)));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
