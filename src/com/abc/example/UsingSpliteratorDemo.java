package com.abc.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class UsingSpliteratorDemo {

	public static void main(String[] args)
{

		List<Integer>l1=new ArrayList<Integer>();
		l1.add(78);
		l1.add(97);
		l1.add(731);
		l1.add(9713);
		l1.add(71);
		
		Spliterator<Integer>sp=l1.spliterator();
		
		for (Integer inte: l1) {
			
			System.out.println("Elements: "+inte);
			
		}
		System.out.println(sp.estimateSize());
		System.out.println(sp.characteristics());
		
}
}
