package constructor.method.reference;

public class MethodReferenceExam {

	public synchronized static void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {
		Runnable r = MethodReferenceExam::m1;
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Parent Thread");

		}
	}

}
