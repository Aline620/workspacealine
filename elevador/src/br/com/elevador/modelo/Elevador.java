package br.com.elevador.modelo;

public class Elevador {

	private short capacidadeMax;
	private short andarMax;
	private short andarMin;
	private short qtdePessoas;
	private short andarAtual;

	
	
	
	
	public void sair() {
		if (qtdePessoas > 0) {
			qtdePessoas --;
		}
	}
	
	public void sair(short qtde) {
		short resultado = (short) (qtdePessoas - qtde);
		if (resultado>=0) {
			qtdePessoas -=qtde;
			
		}
	}
	
	public void entrar(short qtde) {
		short resultado = (short) (qtde + qtdePessoas);
		if(resultado<= capacidadeMax) {
			qtdePessoas +=qtde;
		}
	}
	
	public void descer() {
		
	if(andarAtual>andarMin) {
		andarAtual --;
	}
	}
	
	public void subir() {
		if(andarAtual < andarMax) {
		andarAtual++;	
			
		}
	}

	
	public String verificarStatus() {
		return 
		 "Quantidade de pessoas: " + qtdePessoas + "\n" +
		 "Andar Atual: " + andarAtual + "\n" + 
		 "Capacidade Máxima: " + capacidadeMax;
	}
	
	public void inicializar(short capacidade, short maior, short menor) {
		capacidadeMax = capacidade;
		andarMax = maior;
		andarMin= menor;

	}



















}

