package Unit13;

import MethodReference.Student;
import MethodReference.StudentDataBase;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

public class StreamGroupingEx {
	
	public static void GroupByGender() {
		Map<String, List<Student>> collect = StudentDataBase.getAllStudents()
		.stream()
		.collect(groupingBy(Student::getGender));
		System.out.print(collect);
	}
	
	public static void GroupByGpa() {
		Map<String, List<Student>> groupByGpa = StudentDataBase.getAllStudents()
		.stream()
		.collect(groupingBy(student -> student.getGpa()>=3.9 ? "Outstanding": "Average"));
		System.out.print(groupByGpa);
	}

	public static void main(String[] args) {
		//GroupByGender();
		GroupByGpa();
	}

}
