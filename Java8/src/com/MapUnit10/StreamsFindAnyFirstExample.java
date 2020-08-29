package com.MapUnit10;

import java.util.List;
import java.util.Optional;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class StreamsFindAnyFirstExample {
	
	public static Optional<Student> findFirstStudent(){
		Optional<Student> findFirst = StudentDataBase.getAllStudents().stream()
				
		//Adam
	    //jenny
		//Emily
		.filter(student->student.getGpa()>=4.0)
		.findFirst();
		return findFirst;
	}
	
	public static Optional<Student> findanyStudent(){
		Optional<Student> findAny = StudentDataBase.getAllStudents().stream()
				//Adam
				//Jenny
				//Emily
		.filter(student->student.getGpa()>=4.0)
		.findAny();
		return findAny;
	}

	public static void main(String[] args) {
		
		Optional<Student> findFirstStudent = findFirstStudent();
		if(findFirstStudent.isPresent()) {
		System.out.println("first student is : "+findFirstStudent.get());
		}else
			System.out.println("No Student found!");
		
		Optional<Student> findAnyStudent = findanyStudent();
		if(findAnyStudent.isPresent()) {
		System.out.println("first student is : "+findAnyStudent.get());
		}else
			System.out.println("No Student found!");
	}

}
