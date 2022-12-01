package vezbi.br2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Shpanija");
		list.add("Argentina");
		list.add("Danska");
		list.add("Indija");
		list.add("Kongo");

		System.out.println("Listata sodrzhi "+ list.size()+" elementi.");

		if(list.size() == 3) 
		{    
			list.add("Rusija");
			list.add("Madagaskar");

			System.out.println(list);
		}
		else 
		{
			System.out.println(list);
		}
	}
}