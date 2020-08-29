package Optional.unit15;

import java.util.Optional;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class OptionalExample {
	
	public static String getStudentName() {
		
		//Student student = StudentDataBase.studentSupplier.get();
		Student student=null;
		if(student!=null) {
			return student.getName();
		}
		return null;
	};
	
	
	public static Optional<String> getOptionalStudentName(){
		Optional<Student> studentName = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		if(studentName.isPresent()) {
			studentName.get();//Student
			return studentName.map(Student::getName);//Optional<String>
		}
		else
			return Optional.empty();//represents that optional is null

	}

	public static void main(String[] args) {
//		String studentName = getStudentName();
//		if(studentName!=null) {
//		System.out.println("Student name length is : "+studentName.length());
//		}
//		System.out.println("Student not found!");
//	}
	
	Optional<String>student=getOptionalStudentName();{
	if(student.isPresent()) {
		System.out.println("Student name length is : "+student.get().length());
	}else
	System.out.println("Student not found!");
	}
}
}
