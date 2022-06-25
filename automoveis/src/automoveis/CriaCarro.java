package automoveis;

public class CriaCarro {

	public static void main(String[] args) {
		
		Carro fusca = new Carro(1970, "Fuscao", 10500);
		Carro gol = new Carro(2013, "Gol G4", 35000.00);
		
		System.out.println("O carro é: " + fusca.getModelo() + " e o ano dele é: " + fusca.getAno() + 
				" e está super barato: R$" + fusca.getPreco());
		
		System.out.println("O carro é: " + gol.getModelo() + " e o ano dele é: " + gol.getAno() + 
				" e está super barato: R$" + gol.getPreco());
	}

}
