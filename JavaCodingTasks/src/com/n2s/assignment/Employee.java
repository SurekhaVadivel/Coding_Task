package com.n2s.assignment;

import java.util.Scanner;

public class Employee {

	public String emp_name;
	public String emp_email;
	public String emp_destination;
	public final static int count =5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i <= count; i++){
			System.out.println("Enter the value for employee "+i+" : ");
			System.out.println("Employee name: ");
			String name = sc.next();
			System.out.println("Employee email: ");
			String email = sc.next();
			System.out.println("Employee designation: ");
			String dest = sc.next();
			
			Employee e= new Employee(name, email, dest);
		}
		
		System.out.println("Stop adding details ! \nMaximum employee lists are reached");
		
		sc.close();
	}
	
	Employee(String name, String email, String dest){
		this.emp_name=name;
		this.emp_email=email;
		this.emp_destination=dest;
	}
	
	public void display(){
		System.out.println();
	}

}
