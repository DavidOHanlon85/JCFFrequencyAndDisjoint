package slideDeckChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example06Composition {

	public static void main(String[] args) {
		
		Integer[] nums = {3, 4, 5, 6, 3, 4, 8, 9, 16};
		
		List<Integer> numbers = Arrays.asList(nums);
		
		List<Integer> numbers2 = new ArrayList<Integer>();
		Collections.addAll(numbers2, 12, 13, 16, 18);
		
		System.out.println(numbers);
		System.out.println(numbers2);
		
		System.out.printf("The number 4 appears %d times in the list\n", Collections.frequency(numbers, 4));
		
		System.out.println("The lists do no contain common items: " + Collections.disjoint(numbers, numbers2));
		
		
		
	}

}
