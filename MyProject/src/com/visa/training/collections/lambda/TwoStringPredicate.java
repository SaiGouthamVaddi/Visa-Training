package com.visa.training.collections.lambda;

@FunctionalInterface
public interface TwoStringPredicate{
	
	public boolean isFirstBetter(String o1, String o2);
}
