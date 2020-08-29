package Optional.unit15;

import java.util.Optional;

import MethodReference.Bike;
import MethodReference.Student;
import MethodReference.StudentDataBase;

public class OptionalMapFlatMapEx {

	// filter
	public static void optionalFilter() {
		Optional<Student> studentOptionalFilter = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		studentOptionalFilter.filter(student->student.getGpa()>=3.5)
				.ifPresent(student->System.out.println(student));
		
	}

	//map
	public static void optionalMap(){
		Optional<Student> studentMap = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<String> map = studentMap.filter(student->student.getGpa()>=3.0)
		.map(Student::getName);
		System.out.println("Map : "+map.get());
		
		 
	}
	
	//flatmap
	public static void optionalFlatMap() {
		Optional<Student> studentFlatMap = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<String> name= studentFlatMap
				.filter(student->student.getGpa()>=3.5)
				.flatMap(Student::getBike)
				.map(Bike::getName);
		
		name.ifPresent(s->System.out.println(s));
	    
	}
	
	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}

}
