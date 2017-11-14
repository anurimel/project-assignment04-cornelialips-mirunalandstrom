package com.assignment_4.superclasses;
/***
 * 
 * @author Miruna, Cornelia
 *@version 1.0
 *This is a superclass with two attributes
 */
public class Human {
	private String name = " ";
	private int age = 0;
	
	/***
	 *This is the constructor who takes the attributes name and age
	 *@param age is an integer
	 *@param name is a string
	 */
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/***
	 * Getters and Setters for the attributes
	 * @return name and age
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
