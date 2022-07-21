package br.com.turmajava.sobrescrita;

public class ImprimeAnimal {
	
	public static void main(String[] args) {
		
		//Criar o objeto da classe Testa animal.
		TestaAnimal t = new TestaAnimal();
		//dentro do TestaAnimal, tem o nosso método(fazendoAnimalComer)
		//nosso método esta aguardando o objeto.
		t.fazendoAnimalComer(new Tigre());   //para criar o objeto (new tigre).
		//Passando como parâmetro um objeto de tigre.(Nosso objeto foi criado)
		
		Tigre tr = new Tigre();
		t.fazendoSomAnimal(tr);
		
		
		//Também pode ser desta forma.
		Cachorro cr = new Cachorro();
		t.fazendoAnimalComer(cr);
		
		Cachorro cr2 = new Cachorro();
		t.fazendoSomAnimal(cr2);
		
	}

}
