package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina: ");
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Qdte faltas"));
		
		
		if(faltas >= 20 ) {
			
			System.out.println("Voc� esta reprovado por faltas na disciplina: " + disciplina);
		
		}else {
		
									
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1 + nota2)/2;
				
		
		if(media>=6 ) {
			
			System.out.println("Parabens voc� foi aprovado na disciplina: " + disciplina);
			
		}else if(media <=4 ) {
			
			System.out.println("Infelizmente voc� foi reprocado: " + disciplina);
			
		}else {
			
			System.out.println("Voc� est� de exame na disciplina: " + disciplina);
					
		}
		
			System.out.println("Media: " + media);
		}
		
		

		

	}

}
