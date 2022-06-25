
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario fabio = new Funcionario();
		fabio.setNome("Fabio");
		fabio.setCpf("123654789-00");
		fabio.setSalario(2000.00);
		
		System.out.println(fabio.getNome());
		System.out.println(fabio.getSalario());
		

	}

}
