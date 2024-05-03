package com.sunbeam.Q1;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	double marks;
	
	public Student() {
	}
	
	 Student(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "["+"Roll No = "+rollNo+", Name ="+name+",Marks = "+marks+"]";
	}
	@Override
	public int compareTo(Student o) {

		return Double.compare(o.marks,this.marks);
	}
	

	

}
