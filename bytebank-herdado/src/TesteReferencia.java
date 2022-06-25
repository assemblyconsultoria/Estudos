
public class TesteReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Alonso");
		g1.setSalario(5000.0);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Maria");
		f1.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		
		System.out.println(controle.getSoma());
	}

}
