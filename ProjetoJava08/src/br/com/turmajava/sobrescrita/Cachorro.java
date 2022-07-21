package br.com.turmajava.sobrescrita;

//Cachorro, extende da classe animal.
public class Cachorro extends Animal {
	
	//essa setinha para cima do lado esquerdo quer dizer que estamos fazendo uma sobrescrita de método
	//Sobrescrita de metodo(esse metodo já tem na classe animal)
	
	@Override //override(signica sobrescrita de metodo da classe principal.
	public void comer() {
		
		//Aqui já informa quem esta comendo.
		System.out.println("Cachorro comendo..");
	}
	
	public void somAnimal() {
		System.out.println("Som do cachorro (auauaua)");
	}

}
