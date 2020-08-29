package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class PredicateStudentEx {
	static Predicate<Student> p1 = (student) -> (student.getGradeLevel()>=3);
	static Predicate<Student> p2 = (student) -> (student.getGpa()>=3.9);
	
	public static void getStudentGradeLevel() {
		System.out.println("getStudentGradeLevel");
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(student  -> {
			if(p1.test(student))
				System.out.println(student);;
		});
	}
	public static void getStudentGpa() {
		System.out.println("getStudentGpa");
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(student  -> {
			if(p2.test(student))
				System.out.println(student);;
		});
	}
	public static void getStudentGpaAndGradelevel() {
		System.out.println("getStudentGpaAndGradelevel");
		List<Student> studentList = StudentDataBase.getAllStudents();
		
		studentList.forEach(student  -> {
			if(p1.and(p2).negate().test(student))
				System.out.println(student);;
		});
	}
	

	

	public static void main(String[] args) {
		getStudentGradeLevel();
		getStudentGpa();
		getStudentGpaAndGradelevel();

	}

}
