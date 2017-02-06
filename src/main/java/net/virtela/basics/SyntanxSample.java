package net.virtela.basics;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class SyntanxSample {
	public static void main(String[] args) {
		final List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);

		numberList.forEach(num -> System.out.println(num));

		numberList.forEach(num -> {
			num += 1;
			System.out.println(num);
		});
	}
}
