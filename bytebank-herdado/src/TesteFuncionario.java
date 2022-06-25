
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario fabio = new Funcionario();
		fabio.setNome("Fabio");
		fabio.setCpf("123654789-00");
		fabio.setSalario(2000.00);
		
		System.out.println(fabio.getNome());
		System.out.println(fabio.getSalario());
		System.out.println(fabio.getBonificacao());
		
		Gerente g1 = new Gerente();
		g1.setNome("Luis Claudio");
		g1.setCpf("456321789-00");
		g1.setSalario(15000);
		
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		

	}

}
