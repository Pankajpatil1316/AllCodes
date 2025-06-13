package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		int size =1000;
		Random ran = new Random();
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<size; i++) {
			list.add(ran.nextInt(99)); //nextInt = it will create the maximum 99-1 which is 98
		}
		//using reduce
		int sum1 = list.stream()
						.map(num -> num*2)
						.reduce(0, (c, n)-> c+n);
		
		//using mapToInt
		int sum2 = list.stream()
						.map(n -> n*2)
						.mapToInt(n -> n)
						.sum();

		//using parallel stream
		int sum3 = list.parallelStream()
						.map(n -> n*2)
						.mapToInt(n-> n)
						.sum();
		System.out.println(sum1 + " " + sum2 + " " + sum3);
	}
}
