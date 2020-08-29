package com.MapUnit12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamBoxingUnboxingEx {

	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 15)
		.boxed()
		.collect(Collectors.toList());
	}
	
	public static int unBoxing(List<Integer> integerList) {
		return integerList.stream()
		.mapToInt(Integer::intValue).sum();
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Boxing : " +boxing());
		List<Integer> integerList=boxing(); 
		System.out.println("Unboxing : " +unBoxing(integerList));

	}

}
