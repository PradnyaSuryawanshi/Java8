package com.MapUnit12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumricStreamExample {
	
	public static int sumOfNNumber(List<Integer> integerList) {
		return integerList.stream().
		reduce(0,(x,y)->x+y); //Unboxing it is convert Integer to int
		
	}
	
	public static int SumOfIntStream() {
		
		return IntStream.rangeClosed(1, 6) //1 2 3 4 5 6
		.sum();
		
	}

	public static void main(String[] args) {
		List<Integer> integerList= Arrays.asList(1,2,3,4,5,6);
		System.out.println("The sum of N Number is: " +sumOfNNumber(integerList));
		System.out.println("The sum of IntStream is : " +SumOfIntStream());
		
		
	}

}
