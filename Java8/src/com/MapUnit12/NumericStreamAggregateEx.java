package com.MapUnit12;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateEx {

	public static void main(String[] args) {
			IntStream intStream = IntStream.rangeClosed(1, 50);
			
			int sumOfIntStream = IntStream.rangeClosed(1, 50).sum();
			System.out.println("sum is : " +sumOfIntStream);
			
			
			OptionalInt maxOfIntStream = IntStream.rangeClosed(0, 0).max();
			System.out.println(maxOfIntStream.isPresent() ? maxOfIntStream.getAsInt():0 );
			System.out.println("The Max value is : " +maxOfIntStream);
			
			OptionalLong minofLongStream = LongStream.rangeClosed(50,100).min();
			System.out.println(minofLongStream.isPresent() ? minofLongStream.getAsLong():0);
			System.out.println("The min value is : " +minofLongStream);
			
			OptionalDouble asDoubleStream = IntStream.rangeClosed(1, 50).asDoubleStream().average();
			System.out.println(asDoubleStream.isPresent() ? asDoubleStream.getAsDouble():0.0);
			System.out.println("The average number is : " +asDoubleStream);
	}

}
