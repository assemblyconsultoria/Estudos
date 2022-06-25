package bytebank;

public class TestaContaECliente {
    
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 123987);
        Cliente marcela = new Cliente();
		marcela.setNome("Marcela");
		conta.setTitular(marcela);
		conta.deposita(1500);
		System.out.println("O saldo da conta do titular " + conta.getTitular().getNome() + " de número " + conta.getNumero() +
				" é de R$" + conta.getSaldo() + " Conta: " + Conta.getTotal());
		
		Conta conta2 = new Conta(1337, 123654);
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Tavares");
		conta2.setTitular(paulo);
		System.out.println("A conta nova foi criada, cliente: " + conta.getTitular().getNome() + " de número: " + conta.getNumero() + 
				" Conta: " + Conta.getTotal());;
        
    }
}
