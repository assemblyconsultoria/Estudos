
public class TestaSistema {

	public static void main(String[] args) {
		
		Autenticavel gerente = new Gerente();
		gerente.setSenha(2222);
		SistemaInterno si_ge = new SistemaInterno();
		si_ge.autentica(gerente);
		
		Autenticavel adm = new Administrador();
		adm.setSenha(2323);
		SistemaInterno si_adm = new SistemaInterno();
		si_adm.autentica(adm);
		
		Autenticavel cliente = new Cliente();
		cliente.setSenha(2222);
		SistemaInterno si_cli = new SistemaInterno();
		si_cli.autentica(cliente);

	}

}
