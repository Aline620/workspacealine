package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Digite seu nome completo").toUpperCase();
		
		
		while (nome.length()< 5 || nome.length() > 20|| nome.contains(" ") ==false )  {
			
			nome =JOptionPane.showInputDialog("Digite o nome novamente").toUpperCase();
			
		}
				
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));		
		
		while (idade < 18 || idade > 80 ) {
			
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
					
		}
			
		System.out.println("Seja bem vindo: " + nome);
		System.out.println("Seja bem vindo: " + idade);
		System.out.println("Sobrenome " + nome.substring(nome.indexOf(" ")));		
		
		
		
		
		
		
		
		
		
		

	}

}
