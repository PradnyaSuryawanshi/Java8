package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("James");
		names.add("adam");
		names.add("Jenny");

		names.remove(0);

		for (String name : names) {
			System.out.println(name);
		}

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println(names);
		
		
		Stream <String>nameStream=names.stream();
		nameStream.forEach(System.out::println);
		//
		nameStream.forEach(System.out::println);

		

	}
	
	

}
