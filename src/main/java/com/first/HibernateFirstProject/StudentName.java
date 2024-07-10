

package com.first.HibernateFirstProject;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudentName {
	String fname;
	String lname;
	String sname;
	
	public StudentName(String fname, String lname, String sname) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.sname = sname;
	}
	public StudentName() {
		super();
	}
	@Override
	public String toString() {
		return "StudentName [fname=" + fname + ", lname=" + lname + ", sname=" + sname + "]";
	}
	
	
}
