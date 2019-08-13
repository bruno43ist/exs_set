package application;

import java.util.Scanner;

import entities.Courses;
import entities.Instructor;
import entities.User;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String instructorName = "Alex";
		Instructor instructor = new Instructor(instructorName, new Courses('A'), new Courses('B'), new Courses('C'));
		
		System.out.print("How many students for course A?");
		int stu = sc.nextInt();
		for(int i = 0; i < stu; i++) {
			System.out.print("Type code:");
			instructor.getA().addUser(new User(sc.nextInt()));
		}
		
		System.out.print("How many students for course b?");
		stu = sc.nextInt();
		for(int i = 0; i < stu; i++) {
			System.out.print("Type code:");
			instructor.getB().addUser(new User(sc.nextInt()));
		}
		
		System.out.print("How many students for course c?");
		stu = sc.nextInt();
		for(int i = 0; i < stu; i++) {
			System.out.print("Type code:");
			instructor.getC().addUser(new User(sc.nextInt()));
		}
		
		/*
		instructor.getA().printUsers();
		instructor.getB().printUsers();
		instructor.getC().printUsers();
		*/
		
		System.out.println("Total Students: " + instructor.totalStudents());
		
		sc.close();
	}
}
