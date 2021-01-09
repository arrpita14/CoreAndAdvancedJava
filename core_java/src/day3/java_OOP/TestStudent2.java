package day3.java_OOP;

import day3.beans.Student;

public class TestStudent2 {

	public static void main(String[] args) {
		Student s1 = new Student(4301, "Sarika", "IT");
		Student s2 = new Student(4302, "Nikita", "Computer");
		Student s3 = new Student(4303, "Kalyani", "E&TC");
		Student s4 = new Student(4304, "Shubham", "Civil");
		Student s5 = new Student(4305, "Kunal", "Mechanical");
		
		/*
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		*/
		
		//Instead of printing all the student objects use the below steps-
		/*1- create an array having all student objects
		 * 2-create a non-static method which takes arrayOfStudents as i/p
		 * 3- using for-each loop print the array
		 * 4-create object of TestStudent2 and call the non-static method  */
		
		Student[] arrayOfStudents = {s1,s2,s3,s4,s5};
		
		TestStudent2 ts2 = new TestStudent2();
		ts2.displayAllStudents(arrayOfStudents);
	}
	
	public void displayAllStudents(Student[] arrayOfStudents) {
		for(Student i : arrayOfStudents) {
			System.out.println(i);
		}
		
	}

}
