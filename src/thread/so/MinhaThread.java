package thread.so;

public class MinhaThread extends Thread {

	public String nome;

	MinhaThread(String nome) {
		this.nome = nome;
	}

	public void run() {
		System.out.println("Executando Thread #" + nome + "!");
	}

}