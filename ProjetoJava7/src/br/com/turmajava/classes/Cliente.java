package br.com.turmajava.classes;

public class Cliente {

	private String nomeCliente;
	private char sexoCliente;
	private int idadeCliente;
	
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public char getSexoCliente() {
		return sexoCliente;
	}

	public void setSexoCliente(char sexoCliente) {
		this.sexoCliente = sexoCliente;
	}

	public int getIdadeCliente() {
		return idadeCliente;
	}

	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}
	
	void abrir() {
		if(idadeCliente >= 18) {
			System.out.println(nomeCliente + ", você é maior de idade, já pode abrir sua conta!");
		} else {
			System.out.println(nomeCliente + ", você é menor de idade, precisará de um responsável para abertura da sua conta!");
		}
	}

}
