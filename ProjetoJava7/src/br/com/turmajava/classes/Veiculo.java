package br.com.turmajava.classes;

public class Veiculo {


	//Atributos..
	private String modelo; // Alterado meus atributos para private.
	private String marca;
	private int ano;
	private int velocidade = 0;
	
	//Para criar Getters e Setters, que farão a modificação de dados e trarão a modificação no private(Será sempre criando os métodos deles).
	public void setModelo(String modelo) { //Preciso de Setters, para poder modificar o meu atributo quando esta privado.
		this.modelo = modelo;	
	}
	
	public String getModelo() { //Preciso de Getters, para poder trazer a modificação, que será feita atraves do set nos atributos.
		return modelo;
	}
	//Fazer a chamada dos Getters e Setters automatico, Botão direito dentro da classe Veiculo + Source + Generat Getters and Setters.
	public String getMarca() { 
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	//Método..
	void acelerar(int aceleracao) throws InterruptedException { //Parametro int aceleracao
		for (int i = 0; i < aceleracao; i++) {
			velocidade = aceleracao;
			System.out.println(i);
			Thread.sleep(500);		
		}
	}
	
	void freiar(int reduzir) throws InterruptedException {
		for (int i = velocidade; i >= reduzir ; i--) { //i vai ser igual a velocidade, enquanto i for maior a reduzir, ele vai diminuir 1.
			velocidade--; 
			System.out.println(i);
			Thread.sleep(500);
			
		}	
	}
}
