package Stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import MethodReference.Student;
import MethodReference.StudentDataBase;

public class StreamMapExample {

	public static List<String> namesList() {

		List<String> studentList = StudentDataBase.getAllStudents().stream().map(Student::getName)
				.map(String::toUpperCase).collect(toList());

		return studentList;

	}

	public static Set<String> namesSet() {

		Set<String> studentList = StudentDataBase.getAllStudents().stream().map(Student::getName)
				.map(String::toUpperCase).collect(toSet());
		// Or

		List<Student> allStudents = StudentDataBase.getAllStudents();
		Stream<Student> stream = allStudents.stream();
		Stream<String> map = stream.map(Student::getName);
		List<String> collect = map.collect(toList());

		return studentList;

	}

	public static void main(String[] args) {
		System.out.println(namesList());
		
		System.out.println(namesSet());

	}

}
