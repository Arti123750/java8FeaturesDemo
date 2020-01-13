package com.abc.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {
	static List<Integer>l1=new ArrayList<>();
	public static void main(String[] args) {
		
		
		for (int i = 0; i <= 100; i++) {
			
		l1.add(i);			
		}
		
		Stream<Integer>myStream=l1.stream().filter(x->x>90).filter(y->y%2==0);
		myStream.forEach(xyz->System.out.println(xyz));
		
		System.out.println("........Using ParallelStream.........");
		Stream<Integer>myStream1=l1.parallelStream().filter(z->z>80);
		myStream1.forEach(pqr->System.out.println(pqr));

	}
	
}
