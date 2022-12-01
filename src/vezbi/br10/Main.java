package vezbi.br10;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Belgrad");
		list1.add("Skopje");
		list1.add("Tirana");
		List<String> list2 = new ArrayList<String>();
		list2.add("Atina");
		list2.add("Moskva");
		list2.add("Podgorica");

		list1.addAll(list2);

		System.out.println(list1);
	}
}