package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsulficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 123);
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch(SaldoInsulficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());

	}

}
