package vezbi.br7;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<20;i++){
			if(i<9)
				list.add("mail0"+(i+1)+"@yahoo.com");
			else
				list.add("mail"+(i+1)+"@yahoo.com");

			System.out.println(list.get(i));
		}
	}
}