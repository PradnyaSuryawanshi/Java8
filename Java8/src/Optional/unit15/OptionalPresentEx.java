package Optional.unit15;

import java.util.Optional;

public class OptionalPresentEx {

	public static void main(String[] args) {
			Optional<String> ofNullable = Optional.ofNullable("Hello");
			System.out.println( ofNullable.isPresent());
			if(ofNullable.isPresent()) {
				System.out.println("isPresent : "+ofNullable.get());
			}
			ofNullable.ifPresent(s->System.out.println("ifPresent : " +s));
	}

}
