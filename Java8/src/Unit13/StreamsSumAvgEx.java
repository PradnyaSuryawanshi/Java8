package Unit13;

import MethodReference.Student;
import MethodReference.StudentDataBase;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.averagingInt;


public class StreamsSumAvgEx {

	public static int sum() {
		return StudentDataBase.getAllStudents()
		.stream()
		.collect(summingInt(Student::getNoteBook));
	}
	public static Double average() {
		return StudentDataBase.getAllStudents()
		.stream()
		.collect(averagingInt(Student::getNoteBook));
	}
	
	
	public static void main(String[] args) {
		System.out.println("Total Number Of Books : "+sum());
		System.out.println("average Number Of Books : "+average());

	}

}
