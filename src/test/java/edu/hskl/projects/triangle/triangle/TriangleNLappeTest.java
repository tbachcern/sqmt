package edu.hskl.projects.triangle.triangle;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class TriangleNLappeTest {

	public static Random random = new Random(42);

	private Triangle triangle;

	@Before
	public void setUp() throws Exception {
		triangle = new TriangleNLappe();
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral() throws Exception {
		final int[] input = { 10, 10, 10 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral2() throws Exception {
		final int[] input = { 11, 11, 11 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral3() throws Exception {
		final int[] input = { 12, 12, 12 };
		final TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral4() throws Exception {
		final int[] input = { 12, 12, 12 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isNotEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotEqual() throws Exception {
		final int[] input = { 9, 8, 7 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotEqual2() throws Exception {
		final int[] input = { 5, 9, 7 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotEqual3() throws Exception {
		final int[] input = { 11, 9, 3 };
		final TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotEqual4() throws Exception {
		final int[] input = { 11, 9, 3 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isNotEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles() throws Exception {
		final int[] input = { 11, 11, 3 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles2() throws Exception {
		final int[] input = { 13, 13, 11 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles3() throws Exception {
		final int[] input = { 11, 11, 8 };
		final TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles4() throws Exception {
		final int[] input = { 11, 11, 3 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isNotEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsUnknown() throws Exception {
		final int[] input = { -5, -5,
				-5 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsUnknown2() throws Exception {
		final int[] input = { (int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1,
				(int) (Math.random() * 10) + 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isNotEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsUnknown3() throws Exception {
		final int[] input = { (int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10) };
		assertThat(triangle.getTriangleResultForLenghts(input)).isNotEqualTo(null);
	}

	@Test
	public void testGetTriangleResultForLenghtsUnknown4() throws Exception {
		final int[] input = { 7, 7, 7 };
		final TriangleResult[] expected = { TriangleResult.TRIANGLE_EQUILATERAL, TriangleResult.TRIANGLE_ISOSCELES,
				TriangleResult.TRIANGLE_NOT_EQUAL };
		assertThat(triangle.getTriangleResultForLenghts(input)).isIn(Arrays.asList(expected));
	}

	@Test
	public void testGetTriangleResultForLenghtsUnknown6() throws Exception {
		final int[] input = { 1, 1, 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsUnknown7() throws Exception {
		final int[] input = { 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsUnknown8() throws Exception {
		final int[] input = { 0, 0, 0 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown9() throws Exception {
		final int[] input = { 0, 5, 5 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsUnknown10() throws Exception {
		final int[] input = { 5, 0, 5 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsUnknown11() throws Exception {
		final int[] input = { 5, 5, 0 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsUnknown12() throws Exception {
		final int[] input = { 100, 1, 1 };
		final TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
}
