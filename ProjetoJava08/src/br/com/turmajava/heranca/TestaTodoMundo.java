package br.com.turmajava.heranca;

public class TestaTodoMundo {
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor();
		
		prof1.setNome("Daniele");
		prof1.setIdade(30);
		prof1.setSalario(2000);
		prof1.setEndereco("Rua Joao Correia, 2411");
		prof1.setDisciplina("Java");
		
		System.out.println("Nome do professor(a): " + prof1.getNome());
		System.out.println("Idade: " + prof1.getIdade());
		System.out.println("Salário: " + prof1.getSalario());
		System.out.println("Endereço: " + prof1.getEndereco());
		System.out.println("Disciplina: " + prof1.getDisciplina());

		
	}

}
