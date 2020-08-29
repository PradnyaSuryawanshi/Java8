package com.MapUnit10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import MethodReference.Student;
import MethodReference.StudentDataBase;

public class StreamReduceExample {
	
	
	public static int performMulitiplication(List<Integer> integerList)  {
		
		return integerList.stream()
		
		.reduce( 1, (a,b)-> a*b);
		
	}

	
public static Optional<Integer> performMulitiplicationWithoutIdentity(List<Integer> integerList)  {
		
		return integerList.stream()
		
		.reduce( (a,b)-> a*b);
		
	}
public static Optional<Student> getStudentHighestGpa(){
	
     return	StudentDataBase.getAllStudents().stream()
    		 .reduce((s1,s2)-> s1.getGpa()>s2.getGpa() ?s1:s2);
//    		 .reduce((s1,s2)->{
//    			 if(s1.getGpa()>s2.getGpa()){
//    				 return s1;
//    			 }else
//    				 return s2;
//    		 });
}


	public static void main(String[] args) {
		
		List<Integer> integers= Arrays.asList(1,2,3,4,5,6,7);
		
		List<Integer> integers1= Arrays.asList();

		
		System.out.println(performMulitiplication(integers));
		
	    Optional<Integer> ispresent = performMulitiplicationWithoutIdentity(integers);
		System.out.println(ispresent.isPresent());
		System.out.println(ispresent.get());
		
		
	    Optional<Integer> emptyList = performMulitiplicationWithoutIdentity(integers1);
		System.out.println(emptyList.isPresent());

		if(emptyList.isPresent()) {
		System.out.println(emptyList.get());
		}
		
		Optional<Student> HighestGpa = getStudentHighestGpa();
    	if(HighestGpa.isPresent()) {
    		System.out.println("Highest Gpa Student is : " +HighestGpa);
    	
    }



	}

}
