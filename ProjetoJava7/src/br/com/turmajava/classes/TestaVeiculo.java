package br.com.turmajava.classes;

public class TestaVeiculo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Veiculo ve1 = new Veiculo(); //Criado nosso objeto, referente a classe veículo.
		
		//Atributos
		ve1.setModelo("Gran Siena"); //Fazendo minha modificação através do Setters.
		ve1.setMarca("Fiat");
		ve1.setAno(2014);
		
		
	
		//Imprimir dentro do main.
		System.out.println("Modelo do veículo: " + ve1.getModelo()); //Fazendo a chamada da minha modificação através do Getters.
		System.out.println("Marca do veículo: " + ve1.getMarca());
		System.out.println("Ano do veículo: " + ve1.getAno());
		System.out.println("Velocidade do veículo: " + ve1.getVelocidade());
		ve1.acelerar(5); //Atributo
		ve1.freiar(0);
		
	}

}
