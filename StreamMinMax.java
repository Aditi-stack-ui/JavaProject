
package streamminmax;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;


public class StreamMinMax {
	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(1,3,8,2,5);
		Optional<Integer> result = list.stream().min((a,b)->b-a); //use max too
		result.ifPresent(System.out::println);
	}
}
