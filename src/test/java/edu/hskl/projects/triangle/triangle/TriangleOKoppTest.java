package edu.hskl.projects.triangle.triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TriangleOKoppTest {

	private Triangle triangle;

	@Before
	public void setUp() throws Exception {
		triangle = new TriangleOKopp();
	}

	@Test
	public void testGetTriangleResultForLenghtsTestEquilateral() throws Exception {
		final int[] input = { 10, 10, 10 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestIsosceles1() throws Exception {
		final int[] input = { 6, 10, 10 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestIsosceles2() throws Exception {
		final int[] input = { 10, 6, 10 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestIsosceles3() throws Exception {
		final int[] input = { 10, 10, 6 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestWrongInputCount() throws Exception {
		final int[] input = { 6, 10, 10, 10 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestNegativInput1() throws Exception {
		final int[] input = { -1, 3, 5 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestNegativInput2() throws Exception {
		final int[] input = { 1, -3, 5 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestNegativInput3() throws Exception {
		final int[] input = { 1, 3, -5 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestNullInput() throws Exception {
		final int[] input = { 1, 3, 0 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestNotEqual() throws Exception {
		final int[] input = { 4, 6, 7 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestNotEqual2() throws Exception {
		final int[] input = { 7, 6, 5 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

	@Test
	public void testGetTriangleResultForLenghtsTestNotEqual3() throws Exception {
		final int[] input = { 6, 4, 7 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);

	}

}
