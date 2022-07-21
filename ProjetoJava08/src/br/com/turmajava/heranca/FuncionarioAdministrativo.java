package br.com.turmajava.heranca;

//FuncAdministrativo herda de funcionario, que herda de pessoa, 
//entao todos os atributos de funcionario e pessoa estao aqui em funcAdministrativo.

public class FuncionarioAdministrativo extends Funcionario {
	
	private String setor;
	private String funcao;
	
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	

}
