package vezbi.br5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(24);
		list.add(321);
		list.add(123);
		list.add(12);
		list.add(96);
		
		System.out.println("Vtoriot element e: "+list.get(1));
	}
}