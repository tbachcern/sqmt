package edu.hskl.projects.triangle.triangle;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
	public static Random random = new Random(42);

	public static void main(final String[] args) {
		System.out.println(random.nextInt(100_000));
	}

	public static List<Integer> getList() {
		return Arrays.asList(1, 5, 9);
	}
}
