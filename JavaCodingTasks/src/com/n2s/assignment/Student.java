package com.n2s.assignment;
//Assignment 2
public class Student {

	public int student_roll_no;
	public String student_name;
	public int student_age;
	public static String college_name ="SRS institutions";
	
	public static void main(String[] args) {
		Student st1= new Student(101, "Rahul", 22);
		Student st2= new Student(102, "Sunil", 24);
		
		st1.student_details();
		
		st2.student_details();
	}
	
	Student(int roll_no, String name, int age){
		this.student_roll_no=roll_no;
		this.student_name=name;
		this.student_age=age;
	}
	
	public void student_details(){
		System.out.println("Student Roll no: "+student_roll_no);
		System.out.println("Student Name: "+student_name);
		System.out.println("Student Age: "+student_age);
		System.out.println("College name: "+college_name+'\n');
	}
}
