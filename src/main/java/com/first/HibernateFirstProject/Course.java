
package com.first.HibernateFirstProject;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;


@Entity
public class Course {
	
	@Id
	int id;
	String name ; 
	int credit_hours;
	
	@ManyToMany
	List<Student> students = new ArrayList<Student>();
	
	public Course(int id, String name, int credit_hours) {
		super();
		this.id = id;
		this.name = name;
		this.credit_hours = credit_hours;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", credit_hours=" + credit_hours + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit_hours() {
		return credit_hours;
	}
	public void setCredit_hours(int credit_hours) {
		this.credit_hours = credit_hours;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
