package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateEx {
	static Predicate<Integer> p = (a) -> {return (a % 2) == 0;};
	static Predicate<Integer> p1 = (a) -> (a % 2) == 0;;
	static Predicate<Integer> p2 = (a) -> (a % 5) == 0;;
	
	public static void predicateAnd() {
		System.out.println("Predicate And:" + p1.and(p2).test(10));
		System.out.println("Predicate And:" +p1.and(p2).test(8));
	}
	public static void predicateOr() {
		System.out.println("Predicate OR:" +p1.or(p2).test(10));
		System.out.println("Predicate OR:" +p1.or(p2).test(8));
	}
	public static void predicateNegation() {
		System.out.println("Predicate Negate:"+ p1.or(p2).negate().test(10));
		System.out.println("Predicate Negate:"+ p1.or(p2).negate().test(8));
	}
	

	public static void main(String[] args) {
		System.out.println(p.test(10));
		System.out.println(p1.test(10));
		predicateAnd();
		predicateOr();
		predicateNegation();
	}

}
