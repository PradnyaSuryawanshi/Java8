package com.MapUnit10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxValueExample {
	
	public static int findMaxValue(List<Integer> integerList) {
		return integerList.stream()
				//6 ->y
				//7 ->y
				//8 ->y
				//9 ->y
				//10 ->y
				//x holds the max value result
				.reduce(0, (x,y)-> x>y ? x : y);
		
	}
	

	public static Optional<Integer> findMinValue(List<Integer> integerList) {
		return integerList.stream()
				//6 ->y
				//7 ->y
				//8 ->y
				//9 ->y
				//10 ->y
				//x holds the max value result
				.reduce( (x,y)-> x<y ? x : y);
		
	}
	
	
	public static Optional<Integer> findMaxValueWithOutIdentity(List<Integer> integerList) {
		return integerList.stream()
				.reduce((x,y)-> x>y ? x : y);
		
	}

	

	public static void main(String[] args) {
        
		List<Integer> integerList = Arrays.asList(6,7,8,9,10);
		//List<Integer> integerList=new ArrayList();
		
		Optional<Integer> minValueOptional=findMinValue(integerList);
		if(minValueOptional.isPresent())
		{
		System.out.println("min value is : "+minValueOptional.get());
		}else
			System.out.println("The list is empty");
		
		
//		int maxValue=findMaxValue(integerList);
//		System.out.println( "max value is:" +maxValue);
//		
//		Optional<Integer> findMaxValueWithOutIdentity = findMaxValueWithOutIdentity(integerList);
//		System.out.println("Value of MaxValue is : "+findMaxValueWithOutIdentity);
//		if(findMaxValueWithOutIdentity.isPresent()) {
//			System.out.println("Max Value is :" +findMaxValueWithOutIdentity.get());
//		}else
//			System.out.println("the List is empty");
		
	}

}
