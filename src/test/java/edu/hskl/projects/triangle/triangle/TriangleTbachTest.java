package edu.hskl.projects.triangle.triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TriangleTbachTest {
	private Triangle triangle = null;

	@Before
	public void setUp() throws Exception {
		triangle = new TriangleNWerner();
	}

	@Test
	public void testGetTriangleResultForLenghts() throws Exception {
		final int[] input = { 1, 1, 1 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNull() throws Exception {
		final int[] input = null;
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsZero() throws Exception {
		final int[] input = { 0, 0, 0 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsToSmall() throws Exception {
		final int[] input = { 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsToBig() throws Exception {
		final int[] input = { 1, 1, 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNegativeNNN() throws Exception {
		final int[] input = { -1, -1, -1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNegativeNNP() throws Exception {
		final int[] input = { -1, -1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNegativeNPN() throws Exception {
		final int[] input = { -1, 1, -1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNegativeNPP() throws Exception {
		final int[] input = { -1, 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNegativePNN() throws Exception {
		final int[] input = { 1, -1, -1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNegativePNP() throws Exception {
		final int[] input = { 1, -1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNegativePPN() throws Exception {
		final int[] input = { 1, 1, -1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotATriangle() throws Exception {
		final int[] input = { 10, 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotATriangle2() throws Exception {
		final int[] input = { 1, 10, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotATriangle3() throws Exception {
		final int[] input = { 1, 1, 10 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotATriangle4() throws Exception {
		final int[] input = { Integer.MAX_VALUE, 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotATriangleClose() throws Exception {
		final int[] input = { 2, 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral() throws Exception {
		final int[] input = { 2, 2, 2 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateralMax() throws Exception {
		final int[] input = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsoscelesMax() throws Exception {
		final int[] input = { 1, Integer.MAX_VALUE, Integer.MAX_VALUE };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsoscelesMax2() throws Exception {
		final int[] input = { Integer.MAX_VALUE, 1, Integer.MAX_VALUE };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsoscelesMax3() throws Exception {
		final int[] input = { Integer.MAX_VALUE, Integer.MAX_VALUE, 1 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles() throws Exception {
		final int[] input = { 10, 10, 15 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles2() throws Exception {
		final int[] input = { 10, 15, 10 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles3() throws Exception {
		final int[] input = { 10, 15, 10 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsValidButNotSpecial() throws Exception {
		final int[] input = { 10, 9, 8 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
}
