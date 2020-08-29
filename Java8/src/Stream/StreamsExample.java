package Stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {

		Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
		Predicate<Student> studntGpaPredicate =( student -> student.getGpa() >= 3.9);

		Map<String, List<String>> studentDatabase = StudentDataBase.getAllStudents().stream()
				.peek((student ->{
					System.out.println(student);
				}))
				.filter(studentPredicate)
				.peek((student ->{
					System.out.println("After 1st Filter " +student);
				}))
				.filter(studntGpaPredicate)
				.peek((student ->{
					System.out.println("After 2nd Filter " +student);
				}))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentDatabase);

	}

}
