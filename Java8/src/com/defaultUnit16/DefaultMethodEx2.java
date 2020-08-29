package com.defaultUnit16;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class DefaultMethodEx2 {

	static Consumer<Student> studentConsumer = (student -> System.out.println(student));

	public static void sortByName(List<Student> studentList) {
		System.out.println("After sortByName : ");
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer); 
	}

	public static void sortByGPA(List<Student> studentList) {
		System.out.println("After sortByGPA : ");
		Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer); 
	}
	public static void main(String[] args) {

		List<Student> studentList = StudentDataBase.getAllStudents();
		// System.out.println(studentList);
		System.out.println("Before sort : ");
		studentList.forEach(studentConsumer);
		sortByName(studentList);
		studentList.forEach(studentConsumer);
		sortByName(studentList);
	}

}
