package day7.threads;

public class TestExample2 {

	public static void main(String[] args) {
		Example2 ex2 = new Example2();
		Thread t2 = new Thread(ex2);
		t2.start();
	}

}
