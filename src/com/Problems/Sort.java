package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				if (s1.length()>s2.length()) {
					return 1;
				}
				else
					return -1;
			}
		};
		
		List<String> names = new ArrayList<String>();
		names.add("Pankaj");
		names.add("Ashwin");
		names.add("Pawan");
		names.add("Jon");
		names.add("Samiksha");
		names.add("Mansi");
		names.add("Niti");
		
		Collections.sort(names, comparator);
		
		System.out.println(names);

	}

}
