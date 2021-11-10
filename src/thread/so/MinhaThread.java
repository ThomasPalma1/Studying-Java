package thread.so;

public class MinhaThread extends Thread {
	
	public String nome;
	
	MinhaThread (String nome) {
		this.nome = nome;
	}

	public void run() {
		System.out.println("Executando Thread " + nome + "!");
		
		for (int i = 0; i < 5; i++) {
			System.err.println("#" + nome + ": " + i);
			
		}
	}
	
	public synchronized void waitNotification () throws InterruptedException {
		this.wait();
	}
	
	public synchronized void waitTimeIsOver (int time) throws InterruptedException {
		this.wait(time);
	}
	
	public synchronized void notifySomething () {
		this.notifyAll();
	}
}