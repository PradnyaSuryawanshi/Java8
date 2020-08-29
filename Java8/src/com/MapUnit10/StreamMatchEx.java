package com.MapUnit10;

import java.util.List;

import MethodReference.StudentDataBase;

public class StreamMatchEx {
	
	public static boolean allMatch(){
	     boolean allMatch = StudentDataBase.getAllStudents().stream()
		.allMatch(student-> student.getGpa()>=3.5);
		return allMatch;
	}
	
	public static boolean anyMatch(){
	     boolean anyMatch = StudentDataBase.getAllStudents().stream()
		.anyMatch(student-> student.getGpa()>=4.0);
		return anyMatch;
	}

	public static boolean noneMatch(){
	     boolean noneMatch = StudentDataBase.getAllStudents().stream()
		.noneMatch(student-> student.getGpa()>=4.1);
		return noneMatch;
	}

	public static void main(String[] args) {
     
		System.out.println("All match is : " +allMatch());
		System.out.println("Any match is : " +anyMatch());
		System.out.println("Any match is : " +noneMatch());
	}

}
