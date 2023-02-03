package com.n2s.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		String choice = "Y";
		ArrayList<String> strArray= new ArrayList<String>();
		
		while (choice.equalsIgnoreCase("Y") ){
		System.out.println("Enter your name:");
		name = sc.next();
		strArray.add(name);
		System.out.println("The name list: "+strArray);
		System.out.println("Do you want to continue(y/n): ");
		choice = sc.next();
		if (choice.equalsIgnoreCase("Y")){
			continue;
		} else {
			System.out.println("Exit");
			System.out.println("The name list below:");
			for (int i=0;i <strArray.size();i++)
			{
				System.out.println(i+1+".  "+strArray.get(i) );
			}
			sc.close();
			System.exit(0);
		}
		System.out.println("out of program");

		}
		
	}
	
}
	

