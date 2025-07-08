package com.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample {
public static void main(String[] args) {
	//Example 1
	List<String> sentences = Arrays.asList("hello world", "java streams", "flatMap example in java");
	//Here we are collecting the all the words from each of the sentences
	List<String> words = sentences.stream()
			.flatMap(sentence -> Arrays.stream(sentence.split(" ")))
			.collect(Collectors.toList());
	System.out.println("All Words " + words);
	
	
	
	//Example 2
	//we have a list of lists, where each inner list contains a set of integers. We want to flatten this structure into a single list containing all the integers.
	List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 11, 43, 765),
            Arrays.asList(6, 7, 8, 9));
	List<Integer> integers = listOfLists.stream()
										.flatMap(list-> list.stream())
										.collect(Collectors.toList());
	System.out.println("Integers  " + integers);
										
										
}
}
