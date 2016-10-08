package edu.hskl.projects.triangle.triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TriangleDanielTest {

	private Triangle triangle;

	@Before
	public void setUp() throws Exception {
		triangle = new TriangleDaniel();
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral() throws Exception {
		final int[] input = { 10, 10, 10 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsISOSECLES() throws Exception {
		final int[] input = { 10, 11, 11 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsISOSECLES1() throws Exception {
		final int[] input = { 11, 11, 10 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsISOSECLES3() throws Exception {
		final int[] input = { 11, 11, 1 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsUNKNOWN() throws Exception {
		final int[] input = { 10, 11, 11, 12 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsUNKNOWN1() throws Exception {
		final int[] input = { 10 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsUNKNOWN_kleiner0() throws Exception {
		final int[] input = { 10, 10, -1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghts() throws Exception {
		final int[] input = { 10 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
}