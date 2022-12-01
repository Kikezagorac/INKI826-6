package vezbi.br4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(652);
		list.add(5001);
		list.add(4);
		list.add(98);
				
		Collections.sort(list);	
		
		System.out.println(list);
	}
}