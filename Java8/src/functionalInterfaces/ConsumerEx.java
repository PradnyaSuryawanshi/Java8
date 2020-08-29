package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class ConsumerEx {
	static Consumer<Student> students = (student) -> System.out.println(student);
	static Consumer<Student> studentName = (student) -> System.out.println(student.getName());
	static Consumer<Student> studentActivities = (student) -> System.out.println(student.getActivities());

	
	
	public static void printStudents() {

		System.out.println("printStudents");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(students);
	}

	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities");
		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(studentName.andThen(studentActivities));

	}

	public static void printNameAndActivitiesWithCondition() {
		System.out.println("printNameAndActivitiesWithCondition");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student -> {
			if (student.getGradeLevel() >= 3 & student.getGpa()>=3.9) {
				studentName.andThen(studentActivities).accept(student);

			}
		});
	}

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

		Consumer<String> c2 = (s) -> System.out.println(s.toLowerCase());

		c1.accept("Suryawanshi");
		c2.accept("JAVA8");
		printStudents();
		printNameAndActivities();
		printNameAndActivitiesWithCondition();

	}

}
