package br.com.banco.modelo;

public class Gerente {
	
	private String nome_func;
	private String tel_func;
	private String email_func;
	private int funcional;
	
	
	public void setAllGer(String nome_func, String tel_func, String email_func, int funcional) {
		this.nome_func = nome_func;
		this.tel_func = tel_func;
		this.email_func = email_func;
		this.funcional = funcional;
	}
	@Override
	public String toString() {
		return "Gerente [nome_func=" + nome_func + ", tel_func=" + tel_func + ", email_func=" + email_func
				+ ", funcional=" + funcional + "]";
	}
	public Gerente() {
		super();
	}
	public Gerente(String nome_func, String tel_func, String email_func, int funcional) {
		super();
		this.nome_func = nome_func;
		this.tel_func = tel_func;
		this.email_func = email_func;
		this.funcional = funcional;
	}
	public String getNome_func() {
		return nome_func;
	}
	public void setNome_func(String nome_func) {
		this.nome_func = nome_func;
	}
	public String getTel_func() {
		return tel_func;
	}
	public void setTel_func(String tel_func) {
		this.tel_func = tel_func;
	}
	public String getEmail_func() {
		return email_func;
	}
	public void setEmail_func(String email_func) {
		this.email_func = email_func;
	}
	public int getFuncional() {
		return funcional;
	}
	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}
	
	
	
	

}
