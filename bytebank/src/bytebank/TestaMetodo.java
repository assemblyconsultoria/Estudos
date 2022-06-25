package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoJose = new Conta();
		
		contaDoJose.deposita(800);
		System.out.println("O saldo da conta José é: R$" + contaDoJose.saldo);
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(1000);
		System.out.println("O saldo da conta do João é: R$" + contaDoJoao.saldo);
		
		if(contaDoJoao.transfere(200, contaDoJose)) {
			System.out.println("Transferência realizada com sucesso");
		} else {
			System.out.println("Saldo insulficiente");
		}
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";

	}

}
