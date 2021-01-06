package decisao;

import javax.swing.JOptionPane;

public class ExercicioHotel {

	public static void main(String[] args) {
		
		
		short diaria = Short.parseShort(JOptionPane.showInputDialog("Qdte diária"));
				
		if ( diaria <15){
			System.out.println("Valor total: " + (80 * 8)*diaria);
			
		}else if ( diaria == 15) {
			
			System.out.println("Valor total: " + (80 * 6)*diaria);
		}else {
			
			System.out.println("Valor total: " + (80 * 5.5)*diaria);
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
