package br.com.turmajava.sobrescrita;

public class ImprimeAnimal {
	
	public static void main(String[] args) {
		
		TestaAnimal t = new TestaAnimal();
		
		t.fazendoAnimalComer(new Cachorro());
		t.fazendoAnimalComer(new Tigre());
		
		
	}

}
