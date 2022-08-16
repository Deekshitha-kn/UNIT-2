

public class Unit2Run {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runner1());
		thread1.start(); 
		
		Thread thread2 = new Thread(new Runner1());
		thread2.start();
	}
}
 
class Runner1 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++){
			System.out.println("Hello India");
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}