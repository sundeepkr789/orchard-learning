package streams.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorOnLen {
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		str.add("Sundeep");
		str.add("Raksha");
		str.add("Ajay");
		str.add("Prathibha");
		str.add("Ramchandra");
		str.add("Jesus");
		System.out.println(str);
		Comparator<String> c = (s1, s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			if (l1 < l2)
				return -1;
			else if (l1 > l2)
				return 1;
			else
				return s1.compareTo(s2);
		};
		List<String> sortedList = str.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedList);
	}

}