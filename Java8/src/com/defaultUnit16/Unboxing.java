package com.defaultUnit16;

import java.util.ArrayList;
//Java Unboxing is reverse of Autoboxing, i.e. it converts wrapper class object into its corresponding primitive data type
public class Unboxing {

	public static void main(String[] args) {
		Character character = 'a';
	    char a = character;
	    ArrayList<Integer> arrayList = new ArrayList<Integer>();
	    arrayList.add(25);
	    int num = arrayList.get(0);
	    System.out.println(num);

	}

}
