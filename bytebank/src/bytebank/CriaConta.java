package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo = 200;
		segundaConta.saldo = 150;
		
		System.out.println("O saldo da conta é: R$" + primeiraConta.saldo);
		System.out.println("O saldo da segunda conta é: R$" + segundaConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("O saldo da conta agora é: R$" + primeiraConta.saldo );
		
		segundaConta.saldo += 350;
		System.out.println("O saldo da segunda conta é: R$" + segundaConta.saldo);
		
	}

}
