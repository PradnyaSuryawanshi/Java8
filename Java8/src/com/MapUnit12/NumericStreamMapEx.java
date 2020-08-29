package com.MapUnit12;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreamMapEx {

	public static List<Integer> mapToObj() {
		return IntStream.rangeClosed(1, 10).mapToObj(i -> {
			return new Integer(i);
			
		})
				.collect(Collectors.toList());
	}
	public static long mapToLong() {
		return IntStream.rangeClosed(1, 10).mapToLong((i) -> i)
		.sum();
	}
	
	public static double mapToDouble() {
		return IntStream.rangeClosed(0, 10)
		.mapToDouble((i)-> (i))	
		.sum();
		}

	public static void main(String[] args) {
		System.out.println("mapToObj : " +mapToObj());
		System.out.println("mapToLong : " +mapToLong() );
		System.out.println("mapToDouble : " +mapToDouble());
	}

}
