package com.n2s.assignment;
//Assignment 1
public class Test {

	public static void main(String[] args) {
		Dog puppy = new Dog();
		puppy.eat(); //super class method
		puppy.sleep(); //super class method
		puppy.bark(); //sub class method
	}
}

class Animal{
	public void eat(){
		System.out.println("I can eat");
	}
	
	public void sleep(){
		System.out.println("I can sleep");
	}
}

class Dog extends Animal {
	public void bark(){
		System.out.println("I can bark");
	}
}
