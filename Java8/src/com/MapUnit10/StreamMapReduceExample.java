package com.MapUnit10;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class StreamMapReduceExample {
	
	public static int noOfNoteBooks() {
		
		Integer noOfBooks = StudentDataBase.getAllStudents().stream()
				.filter(student ->student.getGradeLevel()>=3)
				.filter(student -> student.getGender().equals("female"))
		
		.map(Student::getNoteBook)
		//.reduce(0, (a,b)-> a+b);
		.reduce(0, Integer::sum);
		
		return noOfBooks;
		
	}

	public static void main(String[] args) {

		System.out.println("Total Books: " +noOfNoteBooks());
	}

}
