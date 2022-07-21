package br.com.turmajava.sobrescrita;

//Testa animal sem o main
public class TestaAnimal {
	
	//Criado outro método (Esse é o método que vou usar para pegar o objeto, e fazer com que este objeto coma(tigre, cachorro))
	//Como parâmetro vamos usar o Animal, da classe animal, e criar uma váriavel desta classe, var animal.
	public void fazendoAnimalComer(Animal animal) {
		animal.comer(); //Aqui ele esta aguardando para ver qual animal vai comer.
	}
	
	public void fazendoSomAnimal(Animal animal) {
		animal.somAnimal();
	}

}
