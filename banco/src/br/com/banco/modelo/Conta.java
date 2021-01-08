package br.com.banco.modelo;

public class Conta {
	
	private int numero_cont;
	private float saldo;
	private Cliente cliente;
	private Agencia agencia;
	private Gerente gerente;
	
	public void depositar(float valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}
	
	public void setAllConta(int numero_cont, float saldo, Cliente cliente, Agencia agencia, Gerente gerente) {
		
		this.numero_cont = numero_cont;
		this.saldo = saldo;
		this.cliente = cliente;
		this.agencia = agencia;
		this.gerente = gerente;
	}

	public Conta() {
		super();
	}
	
	public Conta(int numero_cont, float saldo, Cliente cliente, Agencia agencia, Gerente gerente) {
		super();
		this.numero_cont = numero_cont;
		this.saldo = saldo;
		this.cliente = cliente;
		this.agencia = agencia;
		this.gerente = gerente;
	}
	
	@Override
	public String toString() {
		return "Conta [numero_cont=" + numero_cont + ", saldo=" + saldo + ", cliente=" + cliente + ", agencia="
				+ agencia + ", gerente=" + gerente + "]";
	}

	public int getNumero_cont() {
		return numero_cont;
	}
	public void setNumero_cont(int numero_cont) {
		this.numero_cont = numero_cont;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	
	
	
	

}
