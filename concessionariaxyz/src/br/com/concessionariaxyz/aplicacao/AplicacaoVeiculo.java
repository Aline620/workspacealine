package br.com.concessionariaxyz.aplicacao;

import br.com.concessionariaxyz.modelo.Veiculo;

public class AplicacaoVeiculo {

	public static void main(String[] args) {
		
		// criar um objeto -> Não possui nenhuma repartição
		// Instanciar um objet-> quando possui todas as repartições
		
		Veiculo objeto = new Veiculo();
		objeto.preencherMontadora("JeeP");
		objeto.preencherMoledo("Renegate");
		objeto.preencherVelocidadeMax(200);
		objeto.preencherValor(70000);
				
		
		System.out.println("Montadora: " + objeto.retornarMontadora());
		System.out.println("Modelo: " + objeto.retornarModelo());
		System.out.println("Velocidade Maxima: " + objeto.retornarVelocidadeMax());
		System.out.println("Valor: " + objeto.retornarValor());
		
		
		System.out.println(objeto.ligar());
		
		objeto.acelerar(20);
		objeto.acelerar();
		objeto.acelerar(50);
		
		System.out.println(objeto.verificarSatatus());
		
		objeto.desacelerar();
		objeto.desacelerar();
		System.out.println(objeto.desligar());
		
		
		
		
		
		
		
		
		
		
		

	}

}
