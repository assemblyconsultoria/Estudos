package automoveis;

public class Carro {
	
	private int ano;
	private String modelo;
	private double preco;
	
	public Carro(int ano, String modelo, double preco) {
		this.ano = ano;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	public Carro(String modelo, double preco) {
		if(ano >= 1970) {
			this.ano = 2017;
		} else {
			System.out.println("O ano informado está inválido. Por isso usaremos 2017!");
			this.ano = 2017;
		}
		
		if(modelo != null) {
			this.modelo = modelo;
		} else {
			System.out.println("O modelo não foi informado. Por isso usaremos Gol!");
			this.modelo = "Gol";
		}
		
		if(preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("O preço não é válido. Por isso usaremos 40000.00");
			this.preco = 40000.00;
		}
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
