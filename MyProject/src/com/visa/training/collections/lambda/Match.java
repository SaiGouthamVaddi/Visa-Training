package com.visa.training.collections.lambda;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {
		//exe();
		exe1();
	}

	private static void exe1() {
		// TODO Auto-generated method stub
		String[] words = {"This", "string", "is", "for", "testing"};
		transformedList(Arrays.asList(words),s -> s + "!");
		transformedList(Arrays.asList(words),s -> s.replace("i", "eye"));
		
	}

	private static <T> void transformedList(List<T> words, Function<T, T> object) {
		// TODO Auto-generated method stub
		List<T> l = new ArrayList<>();
		for(T word: words) {
			l.add(object.apply(word));
		}
		
		System.out.println(l);
		
	}

	private static void exe() {
		// TODO Auto-generated method stub
		String[] words = {"This", "string", "is", "for", "testing"};
		
		allMatches(Arrays.asList(words), s -> s.length() > 3);
		
		Integer[] nums = {10,23,435,1,435243,98};
		allMatches(Arrays.asList(nums),s -> s > 10);
		
	}

	private static<T> void allMatches(List<T> words, Predicate<T> p) {
		// TODO Auto-generated method stub
		List<T> l = new ArrayList<>();
		for(T word: words)
		{
			if(p.test(word))
			{
				l.add(word);
			}
		}
		
		System.out.println(l);
		
	}

	
}
