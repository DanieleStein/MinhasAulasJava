package br.com.turmajava.heranca;

//Professor herda de funcionario, que herda de pessoa, entao todos os atributos de funcionario e pessoa estao aqui em professor.
public class Professor extends Funcionario{
	
	private String disciplina;
	

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
