package br.com.bankofoz.modelo;

import br.com.bankofoz.util.PadraoConta;

public class Corrente extends Conta implements PadraoConta {

	private float limite;
	private float taxa;
	
	
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", conta=" + super.toString() + "]";
	}
	public Corrente() {
		super();
	}
	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	
	@Override
	public boolean sacar(float valor) {
		if(valor > (super.getSaldo() + limite)) {
			return false;
		}
		
		super.setSaldo (super.getSaldo() - valor);
		return true;		
	}
	
	@Override
	public boolean depositar(float valor) {
		if ( valor <= 0) {
			return false;
		}
		super.setSaldo(valor+ super.getSaldo());
		return true;
	}
	
	
	
	public void debitarTaxa() {
		
		super.setSaldo(super.getSaldo() - taxa);
	}
	
	public void aumentarLimite(float porc) {
		setLimite(getLimite() + getLimite() * (porc/100));
	}
	
	public float verificarsaldo() {
		return super.getSaldo() + limite;
	}
	
	
	
	
	
	
}
