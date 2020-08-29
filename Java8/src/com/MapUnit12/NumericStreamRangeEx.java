package com.MapUnit12;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.w3c.dom.ranges.RangeException;

public class NumericStreamRangeEx {

	
	
	public static void main(String[] args) {

		IntStream intStream = IntStream.range(1, 50);
		System.out.println("Range count : " +intStream.count());
		IntStream.range(1, 50).forEach(value -> System.out.print(+value+" "));
		System.out.println();
		System.out.println("Range closed count : " +IntStream.rangeClosed(1,50).count());
		IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(+value+" "));
		System.out.println();
		System.out.println("Long Stream Range closed count : " +LongStream.rangeClosed(1,50).count());
		LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(+value+" "));
		System.out.println();
		System.out.println("Double Stream count is : "+IntStream.range(1,50).count());
		IntStream.range(1, 50).asDoubleStream().forEach(value -> System.out.print(+value+" "));

	}

}

