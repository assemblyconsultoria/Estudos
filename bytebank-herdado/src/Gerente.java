
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação GERENTE");
		return super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
}
