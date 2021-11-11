package thread.so;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		MinhaThread minhaThread1 = new MinhaThread("1"); // criando a primeira thread. começa a execução da Thread 1
		MinhaThread minhaThread2 = new MinhaThread("2"); // criando a segunda thread começa a execução da Thread 2
		minhaThread1.start();
		System.out.println("Threads Ativas: " + Thread.activeCount());
		MinhaThread.sleep(5000);
		minhaThread2.start();
		System.err.println("Finalizando Thread #1");
		minhaThread1.interrupt();
		System.err.println("Finalizando Thread #2");
		minhaThread2.interrupt();

	}
}