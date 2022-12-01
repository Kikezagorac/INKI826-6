package vezbi.br8;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i=5;i<=20;i+=5){
			list.add("mail"+i+"@yahoo.com");
		}

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}