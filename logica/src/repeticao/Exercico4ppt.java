package repeticao;

import javax.swing.JOptionPane;

public class Exercico4ppt {

	public static void main(String[] args) {

		String nome = "";
        int idade = 0; 
		int cont = 0;
		int cont_maiores = 0;
		int totalidades = 0;
		int idadeMaisExperiente = 0;
		String nomeMaisExperiente = "";
		int idadeMaisNova = 0;
		String nomeMaisNova = "";
		
		do {
			nome = JOptionPane.showInputDialog("Digite seu nome");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));	
			if(idade >= 18) {
			
				cont_maiores = cont_maiores + 1;
			}
			
			JOptionPane.showMessageDialog(null, "Usuario cadastrado");
			cont = cont + 1;
			totalidades = totalidades + idade;
			
			if (idade > idadeMaisExperiente ) {
				idadeMaisExperiente = idade;
				nomeMaisExperiente = nome;
			}
			
			if (idade < idadeMaisNova || cont ==1) {
				idadeMaisNova = idade;
				nomeMaisNova = nome;
			}
			
			
		}while (JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo usu�rio?",  "Pergunta", JOptionPane.YES_NO_OPTION)==00);
		
		
		System.out.println("foram cadastrados: " + cont + " usuarios");
		System.out.println("Usu�rios maiores de idade : " + cont_maiores );
		System.out.println("Media de idades : " + (totalidades/cont));
		System.out.println("A pessoa mais experiente �: " + nomeMaisExperiente + " com " + idadeMaisExperiente + " anos " );
		System.out.println("A pessoa mais nova �: " + nomeMaisNova + " com " + idadeMaisNova + " anos " );
		
		
		
		
		

	}

}
