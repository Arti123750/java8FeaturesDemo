package com.abc.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class ForEachMethodDemo2 {

	public static void main(String[] args) {
		
		Integer[]arr={10,20,30,40,50,60,70,80};
		List<Integer>list=new ArrayList<>();
		list=Arrays.asList(arr);
		
		list.forEach(abc->System.out.println("List of Array: "+abc));
		
		
		
		
		
		
		

	}

}
