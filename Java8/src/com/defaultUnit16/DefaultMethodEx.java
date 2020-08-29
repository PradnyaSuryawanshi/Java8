package com.defaultUnit16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodEx {

	public static void main(String[] args) {
     List<String> stringList = Arrays.asList("Adam","Jenny","Eric","Tom","Pradnya","Bob");
     
     /**
      * prior java8
//      */
//     Collections.sort(stringList);
//     
//     System.out.println("Sorted list using Collections.sort() : " +stringList);
//     
     /**
      * java 8
      */ 
     stringList.sort(Comparator.naturalOrder());
     System.out.println("Sorted list using Collections.sort() : " +stringList);

     stringList.sort(Comparator.reverseOrder() );
     System.out.println("Sorted list using Collections.sort() : " +stringList);
     
    
	}

}
