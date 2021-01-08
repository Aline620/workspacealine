package br.com.banco.modelo;

public class Agencia {

	private String nome_ag;
	private int num_ag;
	private Endereco endereco;
	private String telefone_ag;
	private String id_ag;
	
	

	
	public void setAllAg(String nome_ag, int num_ag, Endereco endereco, String telefone_ag, String id_ag) {
		this.nome_ag = nome_ag;
		this.num_ag = num_ag;
		this.endereco = endereco;
		this.telefone_ag = telefone_ag;
		this.id_ag = id_ag;
	}
	@Override
	public String toString() {
		return "Agencia [nome_ag=" + nome_ag + ", num_ag=" + num_ag + ", endereco=" + endereco + ", telefone_ag="
				+ telefone_ag + ", id_ag=" + id_ag + "]";
	}
	public Agencia() {
		super();
	}
	public Agencia(String nome_ag, int num_ag, Endereco endereco, String telefone_ag, String id_ag) {
		super();
		this.nome_ag = nome_ag;
		this.num_ag = num_ag;
		this.endereco = endereco;
		this.telefone_ag = telefone_ag;
		this.id_ag = id_ag;
	}
	public String getNome_ag() {
		return nome_ag;
	}
	public void setNome_ag(String nome_ag) {
		this.nome_ag = nome_ag;
	}
	public int getNum_ag() {
		return num_ag;
	}
	public void setNum_ag(int num_ag) {
		this.num_ag = num_ag;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone_ag() {
		return telefone_ag;
	}
	public void setTelefone_ag(String telefone_ag) {
		this.telefone_ag = telefone_ag;
	}
	public String getId_ag() {
		return id_ag;
	}
	public void setId_ag(String id_ag) {
		this.id_ag = id_ag;
	}
	
	
	
	
	
	
	
}
