package com.MapUnit10;

import java.util.List;
import static java.util.stream.Collectors.toList;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class StreamsFlatMapExample {
	
	public static  List<String> StudentListOfActivities() {

	List<String> StudentActivities = StudentDataBase.getAllStudents().stream()
			.map(Student::getActivities) //stream<List<String>>
			.flatMap(List::stream)   //stream<String>
			.distinct() //stream<String> with distinct function performed 
			.sorted()
			.collect(toList());
	
	return StudentActivities;

}
	public static  long getStudentActivitiesCount() {

		long StudentActivitiesCount = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities) //stream<List<String>>
				.flatMap(List::stream)   //stream<String>
				.distinct()
				.count();
				
		
		return StudentActivitiesCount;

	}

	public static void main(String[] args) {
		
		System.out.println("StudentListOfActivities :" +StudentListOfActivities());
		
		System.out.println("getStudentActivitiesCount :" +getStudentActivitiesCount());

	}
}