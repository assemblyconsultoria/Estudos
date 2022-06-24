package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saldo = 100;
		System.out.println("O saldo da conta é: R$" + conta.saldo);
		
		conta.deposita(50);
		System.out.println("Saldo atual agora é: R$" + conta.saldo);
		
		conta.saca(70);
		System.out.println("Saldo atual é: R$" + conta.saldo);

	}

}
