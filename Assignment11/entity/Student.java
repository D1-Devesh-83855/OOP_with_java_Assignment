/*Create a student class with fields rollno,name,marks and course. provide natural ordering of elements
on rollno. Create an array of 10 students and Write a menu driven code that has below menus.
1. Add Student
2. display all students sorted on rollno
3. display all students sorted on name
4. display all students sorted on marks in desc order
5. display all students sorted on course*/






package entity;

public class Student {
	 int  rollNo;
	Double marks;
	String name;
	String course;
	
	
	
	
	
	public Student(int rollNo, Double marks, String name, String course) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + ", course=" + course + "]";
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public Double getMarks() {
		return marks;
	}


	public void setMarks(Double marks) {
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public void Student(){
		
		
	}
	
	
	
	
	

}
