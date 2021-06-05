package streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSortedMethod {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(65);
		marks.add(87);
		marks.add(50);
		marks.add(90);
		marks.add(70);
		System.out.println(marks);
		List<Integer> sortedOrder = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedOrder);
	}

}