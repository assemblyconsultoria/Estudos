
public class TesteConexao {

	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}
		
		
		
// Modo antes da versão do Java7		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.fecha();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//			
//		} finally {
//			con.fecha();
//		}
//
	}

}
