package Unit13;

import java.util.stream.Collectors;

import MethodReference.StudentDataBase;

public class StringsCountingEx {

	public static long count() {
		return StudentDataBase.getAllStudents()
				.stream()
				.filter(student-> student.getGpa()>=3.9)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {
		System.out.println(count());
	}

}
