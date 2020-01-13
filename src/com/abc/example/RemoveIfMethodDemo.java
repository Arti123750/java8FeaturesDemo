package com.abc.example;

import java.util.ArrayList;
import java.util.List;
public class RemoveIfMethodDemo {

	public static void main(String[] args) {

		List<Integer>l1=new ArrayList<>();
		
		l1.add(45);
		l1.add(87);
		l1.add(79);
		l1.add(64);
		l1.add(90);
		l1.add(70);
		
		l1.removeIf(n->(n%3==0));
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		
		
		
		 

		
		}
		
	}
	
	

