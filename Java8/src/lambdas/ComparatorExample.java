package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample{

	public static void main(String[] args) {

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};

		System.out.println("Compare :"+ comparator.compare(3, 2));
		
		
		Comparator<Integer> comparator2=(i,i2)-> i.compare(i, i2);
		
		System.out.println("lambada compare :"+ comparator2.compare(3, 2));
	}

}
