package com.visa.training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class StreamUtils {
	public static void main(String[] args) {
		//exe1();
		//exe2();
		exe3();
	}

	private static void exe3() {
		// TODO Auto-generated method stub
		Random r = new Random();
		double[] nums = r.doubles(100).toArray();
		double result = (double)DoubleStream.of(nums).map(Math::sqrt).average().getAsDouble();
		double presult = DoubleStream.of(nums).parallel().map(Math::sqrt).average().getAsDouble();
		System.out.println("Without parallel: " + result);
		System.out.println("With parallel: " + presult);
		
		
	}

	private static void exe2() {
		List<String> words = Arrays.asList("Saigo","and", "Goutham", "are", "gentle");
		//String s = words.stream().reduce("", String::concat);
		//String concatedString = words.stream().reduce(" ", (s1,s2) -> (s1.toUpperCase()).concat(s2.toUpperCase()));
		//String concatedString = words.stream().map(String :: toUpperCase).reduce("", String :: concat);
		String concatedString = words.stream().reduce((s1,s2) -> {s1 = s1.concat(",");
		s1 = s1.concat(s2);
		return s1;}).get();
		System.out.println(concatedString);
	}

	private static void exe1() {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("Saigo","and", "Goutham", "are", "gentle");
		//words.stream().forEach(s->System.out.println("  "+s));
		//words.stream().forEach(System.out :: println);
		//words.stream().map(s->s+'!').forEach(System.out::println);
		//List<String> modifiedStrings = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		//System.out.println(modifiedStrings);
		
		String[] modifiedStrings = words.stream().filter(s -> s.contains("e")).toArray(String[] :: new);
		System.out.println(Arrays.asList(modifiedStrings));
	}
}
