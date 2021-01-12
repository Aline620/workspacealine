package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2ppt {

	public static void main(String[] args) {


		byte escolaridade = Byte.parseByte(JOptionPane.showInputDialog("Digite sua escolaridade 1-Medio, 2-Superior, 3-Pós"));
		int cont_medio = 0;
		int cont_sup = 0;
		int cont_pos = 0;

	do {
		
		escolaridade = Byte.parseByte(JOptionPane.showInputDialog("Digite sua escolaridade 1-Medio, 2-Superior, 3-Pós"));
		
		if ( escolaridade == 1 ) {
		
			cont_medio = cont_medio + 1;
		}else if ( escolaridade == 2 ) {

			cont_sup = cont_sup + 1;

		} else if ( escolaridade == 3 ) {

			cont_pos = cont_pos + 1;
		} 
	} while (JOptionPane.showConfirmDialog(null, "Continuar?",  "Pergunta", JOptionPane.YES_NO_OPTION)==00);
	
	System.out.println("Maior escolaridade é: " + escolaridade );
	

			
			
			
			
			
		












	}

}
