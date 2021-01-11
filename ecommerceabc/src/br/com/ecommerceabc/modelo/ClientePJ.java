package br.com.ecommerceabc.modelo;

import br.com.ecommerceabc.util.PadraoPessoa;

public class ClientePJ extends Pessoa implements PadraoPessoa{

	private String cnpj;
	private String contato;
	private String dtAbertura;
	
	


	public void setAll(int id, String nome, String email, Endereco endereco, String cnpj, String contato,
			String dtAbertura) {
		super.setAll(id, nome, email, endereco);
		this.cnpj = cnpj;
		this.contato = contato;
		this.dtAbertura = dtAbertura;
	}

	@Override
	public String toString() {
		return "ClientePJ [cnpj=" + cnpj + ", contato=" + contato + ", stAbertura=" + dtAbertura +", pessoa=" + super.toString() +"]";
	}

	public ClientePJ() {
		super();
	}
	
	public ClientePJ(int id, String nome, String email, Endereco endereco, String cnpj, String contato,
			String stAbertura) {
		super(id, nome, email, endereco);
		this.cnpj = cnpj;
		this.contato = contato;
		this.dtAbertura = stAbertura;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getStAbertura() {
		return dtAbertura;
	}
	public void setStAbertura(String stAbertura) {
		this.dtAbertura = stAbertura;
	}

	@Override
	public void setResumo(String param1, String param2) {
		cnpj = param1;
		setNome(param2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
