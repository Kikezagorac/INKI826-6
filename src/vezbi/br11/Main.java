package vezbi.br11;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list1 =  new ArrayList<String>();
		list1.add("Prilep");
		list1.add("Bitola");
		list1.add("Skopje");

		List<String> list2 = new ArrayList<String>();
		list2.add("Bitola");
		list2.add("Prilep");
		list2.add("Krushevo");

		list1.retainAll(list2);

		System.out.println(list1);
	}
}