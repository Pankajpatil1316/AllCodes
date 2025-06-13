package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author 1941732
 *
 */
public class SortingUsingStreamAPI implements Comparator<Integer>
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(3,1,4,4,5,2,4,1);
		//ascending order
		//l.stream().sorted().forEach(n -> System.out.print(n +" "));

		//descending order
		//l.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));
		
		//overridden the compare method
		l.stream().sorted((o, n)-> (o>n)?-1:1).forEach(n -> System.out.print(n + " "));
		
		
		
		int[] arr = {1,5,2,2,8,2,9,3};
		//solution one
		//Arrays.stream(arr).sorted().forEach(n -> System.out.print( n + " "));
		
		//solution two
		//int[] sortedArray = Arrays.stream(arr).sorted().toArray();
		//System.out.println(Arrays.toString(sortedArray));

		Collections.sort(l, new SortingUsingStreamAPI());
		System.out.println(l);
		
	}

	@Override
	public int compare(Integer n, Integer o) {
		
		if(n>o)
			return -1;
		//if(n<o)
			return 1;
		//return 0;
	}

}
