package br.com.universidade.modelo;

public class Aluno {
	
	
	private int aluno;
	private String telefone;
	private String nome;
	private boolean ativo;
	
	
	
	public String getString() {
		if(nome.contains(" ")==true) {
			return nome.substring(0, nome.indexOf(" "));
		}
		return nome;
	}
	
	
	public void setAll(int aluno, String telefone, String nome, boolean ativo) {
		
		this.aluno = aluno;
		this.telefone = telefone;
		this.nome = nome;
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "Aluno [aluno=" + aluno + ", telefone=" + telefone + ", nome=" + nome + ", ativo=" + ativo + "]";
	}
	public Aluno() {
		super();
	}
	public Aluno(int aluno, String telefone, String nome, boolean ativo) {
		super();
		this.aluno = aluno;
		this.telefone = telefone;
		this.nome = nome;
		this.ativo = ativo;
	}
	public int getAluno() {
		return aluno;
	}
	public void setAluno(int aluno) {
		this.aluno = aluno;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	
	
	

}
