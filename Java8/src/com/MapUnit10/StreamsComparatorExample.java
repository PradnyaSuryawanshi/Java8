package com.MapUnit10;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.Comparator;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class StreamsComparatorExample {

	public static List<Student> SortStudentByName() {

		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(toList());
	}

	public static List<Student> SortStudentByGpa() {

		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa))
				.collect(toList());
	}
	
	public static List<Student> SortStudentByGpadesc() {

		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(toList());
	}
	
	

	public static void main(String[] args) {
		System.out.println("SortStudentByName : ");
		StreamsComparatorExample.SortStudentByName().forEach(System.out::println);

		System.out.println("SortStudentByGpa : ");
		StreamsComparatorExample.SortStudentByGpa().forEach(System.out::println);


		System.out.println("SortStudentByGpadesc: ");
		StreamsComparatorExample.SortStudentByGpadesc().forEach(System.out::println);
	}
}
