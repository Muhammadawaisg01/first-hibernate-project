package com.first.HibernateFirstProject;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	
        StudentName name = new StudentName("Ali","K","khattak");

        Student s1 = new Student(102,name,80);
        Student s2 = new Student(103,name,80);

        Course c1 = new Course(4,"ict",4);
        Course c2 = new Course(3,"pf",4);
        
        c1.getStudents().add(s1);
        c1.getStudents().add(s2); 
        
        c2.getStudents().add(s1);
        c2.getStudents().add(s2); 
        
        s1.getCourses().add(c1);  
        s1.getCourses().add(c2);
        
        s2.getCourses().add(c1);  
        s2.getCourses().add(c2);
        
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Course.class)  ;
        
        SessionFactory fac =cfg.buildSessionFactory();
        
        Session session  = fac.openSession();
    	
        Transaction tx = session.beginTransaction();
        
//        Student s2 = (Student) session.get(Student.class, 113);

        session.save(s1);
        session.save(s2);

        session.save(c1);
        session.save(c2);
        
        
        tx.commit();
        
//        System.out.println(s2.toString());
        
    }
}
