package edu.hskl.projects.triangle.triangle;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TriangleNLappeTest {

	private Triangle mTriangle;

	@Before
	public void setUp() throws Exception {
		mTriangle = new TriangleNLappe();
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral() throws Exception {
		int[] input = { 10, 10, 10 };
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral2() throws Exception {
		int[] input = { 11, 11, 11 };
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral3() throws Exception {
		int[] input = { 12, 12, 12 };
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral4() throws Exception {
		int[] input = { 12, 12, 12 };
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isNotEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotEqual() throws Exception {
		int[] input = { 3, 5, 9 };
		TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotEqual2() throws Exception {
		int[] input = { 5, 9, 7 };
		TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotEqual3() throws Exception {
		int[] input = { 11, 9, 3 };
		TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsNotEqual4() throws Exception {
		int[] input = { 11, 9, 3 };
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isNotEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles() throws Exception {
		int[] input = { 11, 11, 3 };
		TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles2() throws Exception {
		int[] input = { 13, 13, 11 };
		TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles3() throws Exception {
		int[] input = { 11, 11, 3 };
		TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsIsosceles4() throws Exception {
		int[] input = { 11, 11, 3 };
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isNotEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown() throws Exception {
		int[] input = { (int)(Math.random()*10)*-1, (int)(Math.random()*10)*-1, (int)(Math.random()*10)*-1 };
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown2() throws Exception {
		int[] input = { (int)(Math.random()*10)+1, (int)(Math.random()*10)+1, (int)(Math.random()*10)+1 };
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isNotEqualTo(expected);
	}

	@Test
	public void testGetTriangleResultForLenghtsUnknown3() throws Exception {
		int[] input = { (int)(Math.random()*10), (int)(Math.random()*10), (int)(Math.random()*10) };
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isNotEqualTo(null);
	}

	@Test
	public void testGetTriangleResultForLenghtsUnknown4() throws Exception {
		int[] input = { (int)(Math.random()*10)+1, (int)(Math.random()*10)+1, (int)(Math.random()*10)+1 };
		TriangleResult[] expected = {TriangleResult.TRIANGLE_EQUILATERAL, TriangleResult.TRIANGLE_ISOSCELES, TriangleResult.TRIANGLE_NOT_EQUAL};
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isIn(Arrays.asList(expected));
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown5() throws Exception {
		int[] input = { 0,0,0 };
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(mTriangle.getTriangleResultForLenghts(input)).isEqualTo(expected);
	}


}
