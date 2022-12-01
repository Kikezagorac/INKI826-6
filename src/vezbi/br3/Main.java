package vezbi.br3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("INKI");
		list.add("IKT");
		list.add("KNI");
		System.out.println("Pred dodavanje na element na tretata pozicija, listata izgleda vaka:");
		System.out.println(list);

		list.add(2, "IIS");
		System.out.println("Po dodavanje na element na tretata pozicija, listata izgleda vaka:");
		System.out.println(list);
	}
}