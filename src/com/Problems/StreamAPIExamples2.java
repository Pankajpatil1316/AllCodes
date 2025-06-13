package streamapi;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSInput;

public class StreamAPIExamples2{
public static void main(String[] args) {
	
	//find the average of numbers
	int nums[] = {0,1,1,1,2,2,3,3,3,3,3,4,4,4,4,4,1,1,1,1,1,1};
	double average = Arrays.stream(nums).average().orElse(0.0);
	System.out.println(average);
	
	//Write a Java program to convert a list of strings to uppercase or lowercase using streams.
	List<String> stringList = Arrays.asList("Pankaj", "Patil", "Siddhi", "Kate");
	stringList.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.print(str + " ")); System.out.println();

	//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
	int arr[] = {0,1,1,1,2,2,3,3,3,3,3,4,4,4,4,4,1,1,1,1,1,1,1,2};
	int sum = Arrays.stream(arr).filter(num -> num % 2 == 0).sum();
	int sumo = Arrays.stream(arr).filter(num -> num % 2 != 0).sum();
	System.out.println("Sum of Even Numbers " + sum);
	System.out.println("Sum of Odd Numbers " + sumo);

	//Write a Java program to remove all duplicate elements from a list using streams.
	List<Integer> intList = Arrays.asList(0,1,1,1,2,2,3,3,3,3,3,4,4,4,4,4,1,1,1,1,1,1,1,2);
	List<Integer> distinctNumbers =  intList.stream().distinct().collect(Collectors.toList());
	System.out.println("distinctNumbers " + distinctNumbers );
	
	//Write a Java program to count the number of strings in a list that start with a specific letter using streams.
	List<String> stringCount = Arrays.asList("Pankaj", "Patil","p","Prakash", "Siddhi", "Kate");
	long countOfDuplicates =  stringCount.stream().filter(str -> str.toLowerCase().charAt(0)=='p').count();
	System.out.println("countOfDuplicates " + countOfDuplicates);

	//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
	List<String> stringLst = Arrays.asList("Pankaj", "Patil","P","Prakash", "Siddhi", "Kate","Z	" , "A", "Z");
	List<String> l = stringLst.stream().sorted().collect(Collectors.toList());
	System.out.println(l);
	
	//Write a Java program to find the maximum and minimum values in a list of integers using streams
	List<Integer> intist = Arrays.asList(0,1,1,1,2,2,3,3,3,3,3,4,4,4,4,4,1,1,1,1,1,1,1,2);
	intist.stream().max((a,b) -> a.compareTo(b)).ifPresent(num -> System.out.println("miximum number " +num));
	intist.stream().min((a,b) -> a.compareTo(b)).ifPresent(num -> System.out.println("minimum number " +num));

	//Write a Java program to find the second smallest and largest elements in a list of integers using streams.
	List<Integer> intistt = Arrays.asList(1,1,1,2,2,3,3,3,3,3,4,4,4,4,4,5,6,7,1,1,1,1,1,1,1,2);
	intistt.stream().distinct().sorted().skip(1).findFirst().ifPresent(num2ndhighest -> System.out.println("second Smallest number " +num2ndhighest));
	
	intistt.stream().distinct().sorted((a,b)-> b.compareTo(a)).skip(1).findFirst().ifPresent(num -> System.out.println("second highest number " + num));
}

}
