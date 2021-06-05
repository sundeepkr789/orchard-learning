package constructor.method.reference;

public class ConstructorReference {
	ConstructorReference() {
		System.out.println("Sample class constructor execution....");
	}

	interface Interf {
		public ConstructorReference get();
	}

	public static void main(String[] args) {
		Interf i = ConstructorReference::new;
		ConstructorReference c1 = i.get();

	}

}
