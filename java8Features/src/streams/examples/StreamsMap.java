package streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(40);
		marks.add(45);
		marks.add(50);
		marks.add(60);
		marks.add(70);
		System.out.println(marks);
		List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(updatedMarks);
	}

}
