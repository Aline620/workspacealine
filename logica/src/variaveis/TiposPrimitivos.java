package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		
		float nota_sem1 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua nota do primeiro semestre"));
		float nota_sem2 = Float.parseFloat(JOptionPane.showInputDialog("Digite sua nota do segundo semestre"));
		short faltas = Short.parseShort(JOptionPane.showInputDialog(" Digite quantas faltas"));
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina");
		float media = (nota_sem1 + nota_sem2 ) / 2;
		
		System.out.println("Nota Sem1: " + nota_sem1);
		System.out.println("Nota Sem2: " + nota_sem2);
		System.out.println("Faltas: " + faltas);
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Média final: " + media);
		
		
		
		
		
		
		
		
		
		
		

	}

}
