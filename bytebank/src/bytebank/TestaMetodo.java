package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.nome = "Conta corrente do Silcleiverson";
		conta.saldo = 100;
		System.out.println("O saldo da conta" + conta.nome + " é: R$" + conta.saldo);
		
		conta.deposita(50);
		System.out.println("Foi recebido um depósito da " + conta.nome + " e o valor agora é: R$" + conta.saldo);
		
		conta.saca(70);
		System.out.println("Foi realizado um saque de: R$70 reais e o saldo atual é: R$" + conta.saldo);

	}

}
