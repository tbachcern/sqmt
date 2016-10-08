package edu.hskl.projects.triangle.triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TriangleCBlochingTest {
	
	private Triangle triangle;
	
	@Before
	public void setUp() throws Exception {
		triangle = new TriangleCBloching();
	}

	@Test
	public void testGetTriangleResultForLenghtsEquilateral() throws Exception {
		int [] input = {10,10,10};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);	
	}
	@Test
	public void testGetTriangleResultForLenghtsEquilateral2() throws Exception {
		int [] input = {11,11,11};
		TriangleResult expected = TriangleResult.TRIANGLE_EQUILATERAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);	
	}
	@Test
	public void testGetTriangleResultForLenghtsNotEqual() throws Exception {
		int [] input = {13,12,5};
		TriangleResult expected = TriangleResult.TRIANGLE_NOT_EQUAL;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);	
	}
	@Test
	public void testGetTriangleResultForLenghtsISOSCELES() throws Exception {
		int [] input = {15,15,11};
		TriangleResult expected = TriangleResult.TRIANGLE_ISOSCELES;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);	
	}
	@Test
	public void testGetTriangleResultForLenghtsUnknown() throws Exception {
		int [] input = {13,12,60};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);	
	}
	@Test
	public void testGetTriangleResultForLenghtsParameters() throws Exception {
		int [] input = {13,12,60,14};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);	
	}
	@Test
	public void testGetTriangleResultForLenghtsNoTriangle() throws Exception {
		int [] input = {13,12,120};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);	
	}
	@Test
	public void testGetTriangleResultForLenghtsZero() throws Exception {
		int [] input = {0,0,-1};
		TriangleResult expected = TriangleResult.UNKNOWN;
		assertThat(triangle.getTriangleResultForLenghts(input)).isEqualTo(expected);	
	}
	@Test
	public void testGetTriangleResultForLenghtsZeroProtected() throws Exception {
		assertThat(new TriangleCBloching().isNotEqualOrLessZero(1,1,-1)).isFalse();	
	}

}
