package com.visa.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListApp {
	public static void main(String[] args) {
		List<Circle> l = new ArrayList<Circle>();
		double r = Math.random();
		while(r > 0.01)
		{
			l.add(new Circle(r));
			r = Math.random();
		}
		
		System.out.println("The size of the list is: " + l.size());
		for(Circle c: l)
		{
			System.out.println("The area of the circle is: "+ c.getArea());
		}
		
		Iterator<Circle> i = l.iterator();
		while(i.hasNext())
		{
			if(i.next().getRadius() < 0.05)
			{
				i.remove();
			}
		}
		
		System.out.println("The size of the list is: " + l.size());
				
				
				
				
				
				
	}
}
