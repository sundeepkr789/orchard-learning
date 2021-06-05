package streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringComparator {
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		str.add("Sundeep");
		str.add("Raksha");
		str.add("Ajay");
		str.add("Prathibha");
		str.add("Ramchandra");
		str.add("Jesus");
		System.out.println(str);
		List<String> sortedList = str.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedList);
	}

}