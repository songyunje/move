package test06_sor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		String[] arr = {"samsung", "software", "academy", "for", "youth"};
		
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		
		// cf. Arrays.sort
		// Collection.sort()
		Collections.sort(list);
		System.out.println(list);

	}

}
