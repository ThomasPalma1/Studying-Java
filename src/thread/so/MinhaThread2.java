package thread.so;

public class MinhaThread2 extends Thread {

	public String nome;
	public boolean notOk = true;

	MinhaThread2(String nome) {
		this.nome = nome;
	}

	public void run() {
		synchronized (this) {
			System.out.println("Executando Thread #" + nome + "!");
			for (int i = 0; i < 5; i++) { // tem que ir até o 4 sem interromper
				System.err.println("#" + nome + ": " + i);
				try {
					wait(2000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Thread.currentThread().interrupt();
			if (Thread.currentThread().isInterrupted()) {
				System.out.println("Thread #" + nome + " finalizada!");
				System.out.println("Tentando acessar a Thread #" + nome + " novamente...");
				Thread.currentThread().start();
			}
			Thread.currentThread().notifyAll();
		}
	}
}