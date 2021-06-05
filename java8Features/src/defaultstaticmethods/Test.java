package defaultstaticmethods;

interface interf {
	default void m1() {
		System.out.println("Sundeep is on orchard training");
	}
}

public class Test implements interf {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}

}
