package com.MapUnit10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.*;

import java.util.Collections;

import static java.util.Map.Entry.*;


public class MapSortingEx {
	
	
	
	public static void main(String[] args) throws Exception {
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("Grocery", 1);
		map.put("Rice", 2);
		map.put("wheat", 3);
		map.put("Transportation", 4);
		
		System.out.println("Before sort:" +map);
		
		
	    Map<String, Integer> collect = map.entrySet().stream().sorted(comparingByValue())
		.collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

	    System.out.println("After Sorting : " +collect);

	    //Using Method Reference

	    Map<String, Integer> collect1 = map.entrySet().stream().sorted(comparingByKey())
	    .collect(toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e2,
                LinkedHashMap::new));
	    System.out.println("Using methodRefernce : " +collect1);
	    
	    Map<String, Integer> reverseOrder = map.entrySet().stream().sorted(Collections.reverseOrder(comparingByValue()))
	    	    .collect(toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e2,
	                    LinkedHashMap::new));
	    	    System.out.println("Using methodRefernce : " +reverseOrder);
	}

	
}