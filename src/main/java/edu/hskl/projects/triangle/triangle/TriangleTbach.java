package edu.hskl.projects.triangle.triangle;

import java.util.Arrays;

public class TriangleTbach extends Triangle {

	public static void main(final String[] args) {
		final int[] lenghts = { 11, 9, 3 };
		System.out.println(new TriangleTbach().getTriangleResultForLenghts(lenghts));
	}

	@Override
	public TriangleResult getTriangleResultForLenghts(final int... lenghts) {
		if (lenghts == null || lenghts.length != 3 || lenghts[0] <= 0 || lenghts[1] <= 0 || lenghts[2] <= 0) {
			return TriangleResult.UNKNOWN;
		}
		final int[] myLenghts = Arrays.copyOf(lenghts, lenghts.length);
		Arrays.sort(myLenghts);
		final int a = myLenghts[0];
		final int b = myLenghts[1];
		final int c = myLenghts[2];

		if (c - b >= a) { // not a triangle a + b <= c
			return TriangleResult.UNKNOWN;
		}
		if (a == b && b == c) {
			return TriangleResult.TRIANGLE_EQUILATERAL;
		}
		if (a == b || b == c) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
		return TriangleResult.TRIANGLE_NOT_EQUAL;
	}
}
