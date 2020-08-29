package com.MapUnit10;

import java.util.List;
import static java.util.stream.Collectors.toList;
import MethodReference.Student;
import MethodReference.StudentDataBase;

public class StreamFilterExample {

	public static List<Student> filterStudents(){
		
		
		return StudentDataBase.getAllStudents().stream()
		.filter((student -> student.getGender().equals("female")))
		.filter((student -> student.getGpa()>=3.9))
		.collect(toList());
		
	}
	
	
	
	public static void main(String[] args) {
    // System.out.println("filterStudents : " +filterStudents());
	filterStudents().forEach(System.out::println);
		

	}

}
