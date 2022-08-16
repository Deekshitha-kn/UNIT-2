
public class UnitTwo {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		runner1.start(); 
		
		Runner runner2 = new Runner();
		runner2.start();
	}
}

class Runner extends Thread{

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++){
			System.out.println("Hello All ");
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}