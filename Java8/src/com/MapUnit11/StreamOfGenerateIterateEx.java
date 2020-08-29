package com.MapUnit11;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateEx {

	public static void main(String[] args) {
		Stream<String> name = Stream.of("Adam","Julie","dany");
		
		name.forEach(System.out::println);
		
		Stream.iterate(1, x->x*2)
		.limit(10)
		.forEach(System.out::println);
		
		Supplier<Integer> generateSupplier= new Random()::nextInt;
		Stream.generate(generateSupplier)
		.limit(10)
		.forEach(System.out::println);
	}
	
	

}
