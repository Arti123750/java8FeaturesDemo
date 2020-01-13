package com.abc.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

class StudentInfo {
	int id;
	String name;

	public StudentInfo(int id, String name) {

		this.id = id;
		this.name = name;

	}
}
class Cource {
	String CourceName;

	public Cource(String CourceName)  {
		this.CourceName = CourceName;
	}
}
public class ForEachMehtodDemo1 {

	public static void main(String[] args) {

		Map<StudentInfo, Cource> map = new HashMap<StudentInfo, Cource>();

		map.put(new StudentInfo(10, "Arti"), new Cource("IT"));
		map.put(new StudentInfo(20, "Ashu"), new Cource("Comp"));
		map.put(new StudentInfo(30, "Priya"), new Cource("E&TC"));
		map.put(new StudentInfo(40, "Sagar"), new Cource("Civil"));
		map.put(new StudentInfo(50, "Rani"), new Cource("Mechanical"));

		map.forEach((k, v) -> System.out.println("key: " + k.id + " " + k.name + " " + "\tvalue: " + v.CourceName));

	}

	
}
