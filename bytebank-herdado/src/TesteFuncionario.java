
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario fabio = new Gerente();
		fabio.setNome("Fabio");
		fabio.setCpf("123654789-00");
		fabio.setSalario(20000.00);
		
		System.out.println(fabio.getNome());
		System.out.println(fabio.getSalario());
		System.out.println(fabio.getBonificacao());
		
		Gerente g1 = new Gerente();
		g1.setNome("Luis Claudio");
		g1.setCpf("456321789-00");
		g1.setSalario(15000);
		g1.setSenha(1234);
		boolean autenticou = g1.autentica(1234);
				
		System.out.println(autenticou);
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		

	}

}
