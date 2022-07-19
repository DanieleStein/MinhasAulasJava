package br.com.turmajava.heranca;

//Abstract, nao podemos usar a pessoa para criar objeto em outras classes, ela é uma classe generica. so para usar atributos
public abstract class Pessoa {
	
	
	private String  nome;
	private int idade;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
