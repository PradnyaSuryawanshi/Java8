package Unit13;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.mapping;
import MethodReference.Student;
import MethodReference.StudentDataBase;

public class StreamMappingEx {

	public static void main(String[] args) {
	List<String> nameList =StudentDataBase.getAllStudents()
	.stream()
	.collect(mapping(Student::getName,Collectors.toList()));
     System.out.println("toList : " +nameList);
	
	
	Set<String> nameSet =StudentDataBase.getAllStudents()
			.stream()
			.collect(mapping(Student::getName,Collectors.toSet()));
		     System.out.println("nameSet: " +nameSet);

		List<String> nameList1= StudentDataBase.getAllStudents()
				.stream()
		        .map(Student::getName)
		        .collect(Collectors.toList());
			     System.out.println("nameSet1 : " +nameList1);
		     
			}

}


