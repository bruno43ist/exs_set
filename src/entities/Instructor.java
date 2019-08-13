package entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor {

	private String name;
	private Courses A;
	private Courses B;
	private Courses C;
	
	public Instructor(String name, Courses a, Courses b, Courses c) {
		super();
		this.name = name;
		A = a;
		B = b;
		C = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Courses getA() {
		return A;
	}

	public void setA(Courses a) {
		A = a;
	}

	public Courses getB() {
		return B;
	}

	public void setB(Courses b) {
		B = b;
	}

	public Courses getC() {
		return C;
	}

	public void setC(Courses c) {
		C = c;
	}
	
	public int totalStudents() {
		Set<User> intersection = new HashSet<>(A.getUsers());
		intersection.addAll(B.getUsers());
		intersection.addAll(C.getUsers());
		return intersection.size();
	}
}
