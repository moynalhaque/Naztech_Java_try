import java.util.*;
import java.util.stream.*;

public class Square {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(square);
		List<String> names = Arrays.asList("Maynal","Haque","Ridoy");
		List<String> result=names.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
		System.out.println(result);
		List<String> shows = names.stream().sorted().collect(Collectors.toList());
		System.out.println(shows);
		List<Integer> numbers = Arrays.asList(2,3,4,5,2);
		Set<Integer> squareSet  = numbers.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(squareSet);
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		
	}

}
