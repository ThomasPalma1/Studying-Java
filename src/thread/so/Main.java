package thread.so;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MinhaThread thread1 = new MinhaThread("1");
		thread1.start();
		thread1.waitNotification();
		

		MinhaThread thread2 = new MinhaThread("2");
		thread2.start();
		thread2.waitTimeIsOver(5000);

		System.out.println("Finalizando a Thread2");
		thread2.interrupt();

		System.out.println("Tentando acessar a Thread2, já encerrada.");
		thread2.start();
		
		System.out.println("Notificando a Thread1");
		thread2.notifySomething();
	}
}