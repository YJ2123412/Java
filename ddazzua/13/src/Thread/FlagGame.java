package Thread;

public class FlagGame {

	public static void main(String[] args) {
		//멀티스레드-> 순서없이 실행
		Runnable white = ()->{
			while(true)
			System.out.println("백기올려");
		};
		Runnable blue = ()->{
			while(true)
				System.out.println("청기올려");
		};
		
		Thread w = new Thread(white);
		Thread b = new Thread(blue);
		
		w.start();
		b.start();
	}

}
