package com.oops;

public class Encap extends Bike{
	// we have private data types for variable, we have getters and setters, main method with main impl
	private String name;
	private int roll;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public static void main(String[] args) {
	Encap e = new Encap();
	e.setAge(20);
	e.setName("Chaitnaya");
	e.setRoll(21004050);
	
	System.out.println("name is: " +e.getName());
	System.out.println("roll is: " +e.getRoll());
	System.out.println("age is: " +e.getAge());
}
@Override
void wheels() {
	// TODO Auto-generated method stub
	
}
@Override
void type() {
	// TODO Auto-generated method stub
	
}
}
