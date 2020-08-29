package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class PredicateAndConsumerEx {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
	static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
	
	static BiPredicate<Integer, Double> biPredicate = (gradeLevel,gpa) -> gradeLevel>=3 && gpa>=3.9;

	static BiConsumer<String, List<String>> nameAndActivities = (name, activities) -> {
		System.out.println(name + ":" + activities);
	};

	static Consumer<Student> p3 = (student) -> {
		if (biPredicate.test(student.getGradeLevel(),student.getGpa())) {
			nameAndActivities.accept(student.getName(), student.getActivities());

		}
	};
	public static void printStudent(List<Student> students) {
		students.forEach(p3);
	}

	public static void main(String[] args) {
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		new PredicateAndConsumerEx().printStudent(studentList);

	}
}
