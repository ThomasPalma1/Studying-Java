package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Jatto");
		list.add("Bárbara");
		list.add("Snow");
		list.add("Bex");
		list.add("Richard");
		list.add(2, "Greg");

		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		// list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'B');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		System.out.println("Index of Jatto: " + list.indexOf("Jatto"));
		System.out.println("Index of Doomfist: " + list.indexOf("Doomfist"));
		System.out.println("--------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
