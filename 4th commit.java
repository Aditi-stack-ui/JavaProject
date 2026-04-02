package streamminmax;
import java.util.*;

public class top3Highest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,7,2,7);
		 list.stream().sorted((a,b)->Integer.compare(b,a))
				 .limit(3).forEach(System.out::println);
 }
}
