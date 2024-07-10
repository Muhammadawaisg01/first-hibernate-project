

package com.first.HibernateFirstProject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;

@Entity(name = "student")
public class Student implements Serializable    {
	
	@Id
	int rollno;
	StudentName name;
	int marks;

	//	@OneToMany(mappedBy="students")
	@ManyToMany(mappedBy="students")
	List<Course> courses = new ArrayList<Course>();
	
	public Student() {
		super();
	}
	public Student(int rollno, StudentName name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public StudentName getName() {
		return name;
	}
	public void setName(StudentName name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public List<Course> getCourses() {
		return courses;
	}	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

		
}
