package br.com.ecommerceabc.teste;

import br.com.ecommerceabc.modelo.Pessoa;
import br.com.ecommerceabc.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		
		Pessoa cliente = new Pessoa();
		cliente.setId(1);
		cliente.setNome("Aline");
		cliente.setEmail("aline@test.com.br");
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		endereco.setLogradouro("Avenida");
		endereco.setBairro("Pestana");
		endereco.setCidade("Osasco");
		endereco.setCep("06190-190");
		endereco.setComplemento("");
		endereco.setNumero("90");
		endereco.setUf("SP");
		
		System.out.println(cliente.toString());
		
		
		
		
		
		
		
		
		
		

	}

}
