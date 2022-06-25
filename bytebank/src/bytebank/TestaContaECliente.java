package bytebank;

public class TestaContaECliente {
    
    public static void main(String[] args) {

        Conta conta = new Conta();
        Cliente marcela = new Cliente();
		marcela.setNome("Marcela");
		conta.setTitular(marcela);
		conta.setNumero(1337);
		conta.deposita(1500);
		System.out.println("O saldo da conta do titular " + conta.getTitular() + " de número " + conta.getNumero() +
				" é de R$" + conta.getSaldo());
        
    }
}
