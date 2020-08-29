package Optional.unit15;

import java.util.Optional;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class OptionalOrElseEx {

	//orElse
	public static String orElse() {
		//Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional =Optional.ofNullable(null);
		String  name=studentOptional.map(Student::getName).orElse("Default");
		return name;
	}
	//elseGet
	public static String elseGet(){
	//	Optional<Student> ofNullable = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> ofNullable =Optional.ofNullable(null);
		String name = ofNullable.map(Student::getName).orElseGet(()-> "Default");
		return name;
	}
	
	//elseThrow
	public static String elseThrow(){
		//Optional<Student> ofNullable = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> ofNullable=Optional.ofNullable(null);
		 String name = ofNullable.map(Student::getName).orElseThrow(()->new RuntimeException("Not Valid data"));
		 return name;
	}
	public static void main(String[] args) {
		
		System.out.println("orElse : "+orElse());
		System.out.println("elseGet : "+elseGet());
		
		System.out.println("orElseThrow : " +elseThrow());
	}

}
