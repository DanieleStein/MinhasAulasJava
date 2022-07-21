package br.com.turmajava.heranca;


//Extends da classe pessoa(extenção), vamos usar os atributos herdados da classe pessoa.
public class Funcionario extends Pessoa {
	
	private double salario;
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
