package vezbi.br9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fakultet> list = new ArrayList<Fakultet>();

		Fakultet f =  new Fakultet("FINKI",9,2500);
		list.add(f);
		list.add(new Fakultet("FEIT", 8, 1300));
		list.add(new Fakultet("FIKT", 3, 750));
		list.add(new Fakultet("PFB", 7, 1000));
		list.add(new Fakultet("TFB", 12, 1250));

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getIme());
			System.out.println(list.get(i).getBrojSmerovi());
			System.out.println(list.get(i).getVkupnoStudenti());
		}
	}
}