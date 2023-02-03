package com.n2s.assignment;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welcome to java learning";
		String strArray[] = s.split(" ");
		
		System.out.println("String: "+s);
		
		System.out.print("String array: [ ");
		
		for(int i=0; i<strArray.length; i++){
			System.out.print(strArray[i]+" ");
		}
		
		System.out.print(" ]");
	}

}
