package com.family.tech;


public class Employee {
	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Gui mail toi " + name + " " + address);
	}
}
