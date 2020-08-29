package Optional.unit15;

import java.util.Optional;

public class OptionalOfEmptyNullableEX {
	
	public static Optional<String> ofNullable(){
		Optional<String> ofNullable = Optional.ofNullable("Hello");
		return ofNullable;
	}
	public static Optional<String> of(){
		Optional<String> of = Optional.of("Hello");
		return of;
		
	}
	
	public static Optional<String> empty(){
		Optional<String> empty = Optional.empty();
		return Optional.empty();
		
	}

	public static void main(String[] args) {
     System.out.println("ofNullable : "+ofNullable().get());
     System.out.println("of : "+of().get());
     System.out.println("Empty : " +empty());
	}

}
