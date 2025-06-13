package com.streamapi;
import java.util.*;


// creation of ThreadState class
// to implement Runnable interface
public class StreamAPiExamples  {
	
 public static void main(String[] args) {
	 
	 List<Integer> l = Arrays.asList(1,2,3,4,4,5,6,7,8,9,10);
	 //print all numbers
	 //l.stream().forEach(c -> System.out.println(c));
	
	 // l.parallelStream().forEach(c -> System.out.println(c));
	 
	 //print only even numbers
	 //l.stream().filter(p -> p%2==0).forEach(c -> System.out.println(c));
	 
	 //print square of numbers
	 //l.stream().map(f -> Math.pow(f, 2)).forEach(c -> System.out.println(c.intValue()));
 
	 //print squres but that value shouldn't be 49
	 //l.stream().map( f-> f * f).filter(p -> p!=49).forEach(c -> System.out.println(c));
	 
	 //add all square values in new list
	 //List<Integer> squareList = l.stream().map( f -> f*f).collect(Collectors.toList());
	 //System.out.println(squareList);
	 	 
	 //add all square values in new set
	 //Set<Integer> squareSet = l.stream().map( f -> f*f).collect(Collectors.toSet());
	 //System.out.println(squareSet);
	 
	 //example on reduce method
	 //List<Integer> number = Arrays.asList(2,3,4,5);
	 //Optional even =  number.stream().reduce((ans, i)-> ans + i);
	 //System.out.println(even);
		 
	 int sum = l.stream().reduce(0, (defaultvalue, arrayvalue)-> defaultvalue + arrayvalue);
	 System.out.println(sum);
	 
	 
	 //more deep example on reduce
	 //List<String> strings = Arrays.asList("a", "b", "c", "d");
	 //String concatinated = strings.stream().reduce("pankaj",(acc, str )-> acc + "[" + str + "]" + " ");
	 //System.out.println(concatinated);
	 
	 //Year y = Year.of(2104);
	 //System.out.println(y.isLeap());
 }
}
