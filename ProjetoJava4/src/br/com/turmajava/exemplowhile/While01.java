package br.com.turmajava.exemplowhile;

public class While01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		int contador = 0;
		
		while (contador <= 10) {
			System.out.println("Repetição: " + contador);
			contador++;
			Thread.sleep(1000); // tempo para ele rodar, para ativar bolinha vermelha, aperta botão direito duas vezes, primeira opcao.
		}
		contador += 5;
		System.out.println(contador);
		
	}

}
