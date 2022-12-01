package vezbi.br6;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		for(int i=0;i<20;i++){
			list.add("mail"+(i+1)+"@yahoo.com");	
		}
		
		for(int i=0;i<20;i++){
			System.out.println(list.get(i));
		}
	}
}