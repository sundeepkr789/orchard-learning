package functinal.interfaces;

import java.util.function.Function;

public class FunctionExamp {

	public static void main(String[] args) {
		Function<String,String>f=s->s.toUpperCase();
		System.out.println(f.apply("mindtree"));
	}

}
