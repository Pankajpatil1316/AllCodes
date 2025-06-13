package streamapi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class numberOfCharactersUsingStream {
	public static void main(String[] args) {
	
		
		String str = new String ("Wel come Everyone");
		
	Map<Character, Long> m = str.chars().mapToObj(c ->( char ) c).filter(c -> c!= ' ').collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(m);
	}
}
