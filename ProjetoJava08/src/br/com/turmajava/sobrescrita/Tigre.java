package br.com.turmajava.sobrescrita;

//Tigre extenção da classe animal.
public class Tigre extends Animal {
	
	@Override //sobrescrita de método da classe principal.
	public void comer() {
		System.out.println("Tigre comendo..");
	}
	
	public void somAnimal() {
		System.out.println("Som do Tigre (rauraurau)");
	}

}
