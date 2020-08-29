package com.MapUnit10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> intergers) {
		return intergers.stream()
				//6
				//7
				//8
				//9
				//10
				.limit(3)//6,7,8
				.reduce((x, y) -> x + y);

	}

	public static Optional<Integer> skip(List<Integer> intergers) {
		return intergers.stream()
				.skip(3)//9+10
				.reduce((x, y) -> x + y);

	}

	public static void main(String[] args) {

		List<Integer> intergers = Arrays.asList(6, 7, 8, 9, 10);

		Optional<Integer> limit = limit(intergers);
		if (limit.isPresent()) {
			System.out.println("Limit result is: " + limit.get());
		}else
			System.out.println("The List is empty");

		

		Optional<Integer> skip = skip(intergers);
		if (skip.isPresent()) {
			System.out.println("Skip result is: " + skip.get());
		}else
			System.out.println("The List is empty");
	}

}
