package br.com.bankofoz.teste;

import javax.swing.JOptionPane;

import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Poupanca;
import br.com.bankofoz.util.Magica;

public class ImplementarConta {

	public static void main(String[] args) {
		
		Conta conta = null;
		
		char resp = JOptionPane.showInputDialog("Digite <1> para conta conrrente").charAt(0);
		if(resp=='1') {
			conta = new Corrente(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					0,
					new Cliente(
							Magica.i("Codigo Cliente"),
							Magica.s("Nome do Cliente"),
							Magica.s("CPF"),
							Magica.s("Fone")
							),
					Magica.f("Limite"),
					Magica.f("Taxa")
					);
		}else {
			conta = new Poupanca(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					0,
					new Cliente(
							Magica.i("Codigo Cliente"),
							Magica.s("Nome do Cliente"),
							Magica.s("CPF"),
							Magica.s("Fone")
							),
					Magica.f("Redimento")
									
					);
		}
		
		System.out.println(conta.depositar(Magica.f("Valor depositado")));
		System.out.println(conta.toString());
		System.out.println(conta.sacar(Magica.f("Sacar")));
		System.out.println(conta.verificarSaldo());
		
	}

}
