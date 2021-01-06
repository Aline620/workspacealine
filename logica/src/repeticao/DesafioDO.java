package repeticao;

import javax.swing.JOptionPane;

public class DesafioDO {

	public static void main(String[] args) {
		
	int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero!"));
	int valor2 = 0;
	int tentativa = 0;
	do{
	 
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe qual o numero"));
		if ( valor2 > valor1) {
			
			JOptionPane.showMessageDialog(null,  "Esse chute foi alto em.. tente de novo");
		}else if ( valor2 < valor1) {
			
			JOptionPane.showMessageDialog(null,  "Esse chute foi baixinhoo.. tente denovo");
		}
		tentativa = tentativa + 1;
		
	}while (valor2!=valor1);
	
	System.out.println("Parabens, você acertou com " + tentativa + " tentativas");
		

	}

}
