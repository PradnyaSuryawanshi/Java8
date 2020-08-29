package MethodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String,String> toUppercaseLambda = s -> s.toUpperCase();
	
	static Function<String,String> ToUpperCaseMethodReference= String::toUpperCase;
	
	public static void main(String[] args) {
		
    System.out.println(toUppercaseLambda.apply("java8"));
    
    System.out.println(ToUpperCaseMethodReference.apply("java8"));
    
	}

}
