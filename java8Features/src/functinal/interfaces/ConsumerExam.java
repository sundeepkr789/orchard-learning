package functinal.interfaces;

import java.util.function.Consumer;

public class ConsumerExam {

	public static void main(String[] args) {
		Consumer<String>c=s->System.out.println(s);
           c.accept("Sundeep");
           c.accept("Mindtree");
	}

}
