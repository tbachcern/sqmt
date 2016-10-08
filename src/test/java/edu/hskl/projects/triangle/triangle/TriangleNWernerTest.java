package edu.hskl.projects.triangle.triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TriangleNWernerTest {

	private Triangle triangle;
	
	@Before
	public void setUp() throws Exception {
		triangle = new TriangleNWerner();
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral() throws Exception {
		int[] input = {10, 10, 10};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsEquilateral2() throws Exception {
		int[] input = {11, 11, 11};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral3() throws Exception {
		int[] input = {12, 12, 12};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral4() throws Exception {
		int[] input = {11, 12, 12};
		TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral5() throws Exception {
		int[] input = {12, 11, 12};
		TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral6() throws Exception {
		int[] input = {12, 12, 11};
		TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral7() throws Exception {
		int[] input = {12, 10, 11};
		TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral8() throws Exception {
		int[] input = {10, 113, 11};
		TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral9() throws Exception {
		int[] input = {17, 45, 2};
		TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral10() throws Exception {
		int[] input = {0, 45, 2};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral11() throws Exception {
		int[] input = {2, -10, 2};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral12() throws Exception {
		int[] input = {-30, -20, -10};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsEquilateral13() throws Exception {
		int[] input = {-30, -20, -10, 10};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral14() throws Exception {
		int[] input = {1, 2, 3, 10};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral15() throws Exception {
		int[] input = {1, 2, 0};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral16() throws Exception {
		int[] input = {0, 2, 0};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

}
