package com.oops;

public class Student {
	int roll;
	String name;
	//1 - Default Constructor
	public Student()
	{
		System.out.println("Default constructor with no overload");
	}
	// Overloaded Constructor
	public Student(int a, int b)
	{
		System.out.println("Overloaded Constructor");
		System.out.println(a + b);
		System.out.println(a+ " " +b);
	}
	// Another type of overload
	public Student(int roll, String name)
	{
		this.roll = roll;
		this.name = name;
		System.out.println(roll + " " + name);
	}
	public static void main(String[] args) {
		//Student s1 = new Student();
		//Student s2 = new Student(1,2);
		Student s3 = new Student(4050, "Chaitu"); //overloaded with the args and the constructor with the
		//datatypes that are relavant to this will be executed as you performed a constrcutor overload
		System.out.println(s3.name); //chaitu
		System.out.println(s3.roll); // roll
	}
}
