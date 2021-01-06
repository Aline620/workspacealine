package decisao;

import javax.swing.JOptionPane;

public class ExercicioOrdemDecrescente {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor1:"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor2:"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor3:"));
	
	if ( valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
			
		System.out.println("Os valors são iguais");
		
	}else if (valor2 < valor1 && valor2 > valor3) {
		
		
	}else {
		
		if (valor1 <valor2 && valor1 > valor3) {

			System.out.println(valor1);
			if (valor2>valor3) {
				
				System.out.println(valor2);
				System.out.println(valor3);
			}else {
				System.out.println(valor3);
				System.out.println(valor2);
							
			}
		}else if (valor2 > valor1 && valor2 > valor3) {
			
			System.out.println(valor2);
			if(valor1>valor3) {
				System.out.println(valor1);
				System.out.println(valor3);
			}else {
				System.out.println(valor3);
				System.out.println(valor1);
			}
		}else
			System.out.println(valor3);
		if(valor1>valor2) {
			System.out.println(valor1);
			System.out.println(valor2);
		}else {
			
			System.out.println(valor2);
			System.out.println(valor1);
		}
			
		
		
	}
		

	

	
	
	
	}

}
