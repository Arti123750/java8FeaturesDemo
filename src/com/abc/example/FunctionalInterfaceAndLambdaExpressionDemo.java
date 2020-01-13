package com.abc.example;
@FunctionalInterface
interface College {
	void m1();
}
@FunctionalInterface
interface Student
{
	void m2();

}
public class FunctionalInterfaceAndLambdaExpressionDemo {

	public static void main(String[] args) {
		
		Student s1 =()->System.out.println("Using Lambda Expression");
		s1.m2();

		College c1 = new College() {

			@Override
			public void m1() {
				System.out.println("Using Inline Implementation...");

			}
		};
		c1.m1();
	}

	
	
}
