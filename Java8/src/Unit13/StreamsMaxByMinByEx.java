package Unit13;

import java.util.Optional;

import MethodReference.Student;
import MethodReference.StudentDataBase;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;
public class StreamsMaxByMinByEx {
	public static Optional<Student> minByEx(){
		return StudentDataBase.getAllStudents()
		.stream()
		.collect(minBy(Comparator.comparing(Student::getGpa)));
		
	}
	public static Optional<Student> maxByEx(){
		return StudentDataBase.getAllStudents()
		.stream()
		.collect(maxBy(Comparator.comparing(Student::getGpa)));
		
	}

	public static void main(String[] args) {
	System.out.println(minByEx());
	System.out.println(maxByEx());

	}

}
