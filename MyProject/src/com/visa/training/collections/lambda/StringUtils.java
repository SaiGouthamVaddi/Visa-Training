package com.visa.training.collections.lambda;

public class StringUtils {

	public static int eChecker(String s1, String s2)
	{
		if(s1.contains("e") && !s2.contains("e"))
		{
			return -11;
		}
		else if(!s1.contains("e")&& s2.contains("e"))
		{
			return 1;
		}
		else
			return 0;
	}
	
	public static String betterString(String o1, String o2, TwoStringPredicate tsp)
	{
		if(tsp.isFirstBetter(o1, o2))
			return o1;
		else 
			return o2;
	}
}
