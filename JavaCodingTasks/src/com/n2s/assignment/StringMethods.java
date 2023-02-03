package com.n2s.assignment;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Java is an object oriented programming language";
		String s2 = "Author name is James gosling";
		
		System.out.println("Length os String s1: "+s1.length());
		System.out.println("Length os String s2: "+s2.length());
		
		//System.out.println("Index position of 'a' in string s1: "+s1.indexOf('a'));
		long count = s1.chars().filter(ch -> ch == 'a').count();
		System.out.println("Number of occurrances of 'a' in string s1: "+count);
		
		System.out.println("String s1 equals to s2: "+s1.equals(s2));
	}

}
