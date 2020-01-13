package com.abc.example;

@FunctionalInterface
interface I1 {
	void calculateArea();

	public default void shape() {
		System.out.println("This is Shape Method");
	}

	public default void shape1() {
		System.out.println("This is Shape1 method");

	}
}
interface I2
{
	public default void shape1()
	{
		System.out.println("Shape1 Mehtod in Interface I2");
	}


}
class Circle implements I1 ,I2{

	@Override
	public void calculateArea() {

		System.out.println("Calculate Area Method");

	}
	@Override
	public void shape1() {
		// TODO Auto-generated method stub
		I1.super.shape1();
	}

}

public class DefaultMethodDemo {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.shape();
		c1.shape1();
		c1.calculateArea();

	}

}
