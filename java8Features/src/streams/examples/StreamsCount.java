package streams.examples;

import java.util.ArrayList;
import java.util.List;

public class StreamsCount {
	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(25);
		marks.add(32);
		marks.add(45);
		marks.add(62);
		marks.add(34);
		marks.add(72);
		System.out.println(marks);
		long noOfFailedStudents = marks.stream().filter(m -> m < 35).count();
		System.out.println(noOfFailedStudents);
	}
}
