package br.com.concessionariaxyz.modelo;

public class Veiculo {

	private String montadora;
	private String modelo;
	private float velocidadeMax;
	private float velocidadeAtual;
	private boolean status;
	private float valor;
	
		
	 /*              Sintaxe dos metodos
	 * < modificador > < tipo do retorno> < nome do medoto > (tipo do metodo)
	 */

	
	
	public void acelerar(float param) {
		
		if ((velocidadeAtual+param) <= velocidadeMax && status ==true) {
			velocidadeAtual+=param;
			
		}
	}
	
	public String verificarSatatus() {
		return "Ligado?" + status + "\n" + "Velocidade Atual: " + velocidadeAtual;
	}
	
	public void desacelerar() {
		if(velocidadeAtual >0 && status == true) {
			velocidadeAtual -=10;
		}
	}
	
	
	public void acelerar() {
		if(velocidadeAtual < velocidadeMax && status == true) {
			velocidadeAtual += 10;
		}
	}
	
	public String desligar() {
		if(status == true) {
			status = false;
			velocidadeAtual=0;
		}
		
		return "Veículo desligado";
	}
		
	public String ligar() {
		if ( status == false) {
			status = true;
		}
		return "Veículo ligado";
		
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void preencherValor(float param) {
	 if (param > 0)	
		valor = param;
	}
	
	public float retornarVelocidadeMax() {
		return velocidadeMax;
	}
	
	public void preencherVelocidadeMax (float param) {
	if (param > 0) {
		velocidadeMax = param;
	     }
	}
	
	public String retornarModelo () {
		return modelo;
	}
	public void preencherMoledo (String param) {
		modelo = param.toLowerCase();
	}
	
	public String retornarMontadora() {
		return montadora.toLowerCase();
	}
	
	public void preencherMontadora(String param) {
		montadora = param.toUpperCase();
	}
		
	
		
		
		

}
